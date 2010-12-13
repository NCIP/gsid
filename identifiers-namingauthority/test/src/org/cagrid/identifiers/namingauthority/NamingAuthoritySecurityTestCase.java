package org.cagrid.identifiers.namingauthority;

import java.net.URI;

import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.domain.IdentifierValues;
import org.cagrid.identifiers.namingauthority.domain.KeyData;
import org.cagrid.identifiers.namingauthority.domain.KeyValues;
import org.cagrid.identifiers.namingauthority.test.NamingAuthorityTestCaseBase;
import org.cagrid.identifiers.namingauthority.util.Keys;



public class NamingAuthoritySecurityTestCase extends NamingAuthorityTestCaseBase {


	////////////////////////////////////////////////////////
	// Resolve system identifier and look for expected keys
	////////////////////////////////////////////////////////
	public void testResolveSystemIdentifier() {
		
		IdentifierData values = null;
		try {
			values = this.NamingAuthority.resolveIdentifier(null, getSystemIdentifier());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to resolve system identifier [" + e.getMessage() + "]");
		} 
		
		KeyData kd = values.getValues(Keys.PUBLIC_CREATION);
		if (kd == null || kd.getValues() == null 
				|| kd.getValues().size() != 1) {
			fail("No PUBLIC_CREATION flag defined under system identifier");
		}
		
		kd = values.getValues(Keys.ADMIN_USERS);
		if (kd == null || kd.getValues() == null) {			
			fail("No ADMIN_USERS key defined under system identifier");
		} 
	}
	
	////////////////////////////////////////////////////////////
	// createKeys authorization error (not an admin)
	// (adding security-type key to system identifier)
	////////////////////////////////////////////////////////////
	public void testCreateKeys1() {
		boolean gotexpected = false;
		
		IdentifierData newKeys = new IdentifierData();
		newKeys.put(Keys.WRITE_USERS, new KeyData(null, new String[]{}));
		try {
			this.NamingAuthority.createKeys(null, getSystemIdentifier(), newKeys);
		} catch (NamingAuthoritySecurityException e) {
			gotexpected = true;
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
		if (!gotexpected) {
			fail("Expected NamingAuthoritySecurityException was not raised");
		}
	}

	////////////////////////////////////////////////////////////
	// createKeys authorization error
	// (adding key to identifier that no one can write)
	////////////////////////////////////////////////////////////
	public void testCreateKeys2() {
		//
		// Create identifier with empty list of WRITE_USERS
		// 
		URI id = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.WRITE_USERS, null);
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		} 
		
		//
		// Now attempt to add a key to it
		//
		boolean gotexpected = false;
		IdentifierData newKeys = new IdentifierData();
		newKeys.put("A KEY", new KeyData(null, new String[]{ "A VALUE" }));
		try {
			this.NamingAuthority.createKeys(null, id, newKeys);
		} catch (NamingAuthoritySecurityException e) {
			gotexpected = true;
		} catch (Exception e) {
			fail(e.getMessage());
		}
		if (!gotexpected) {
			fail("Expected NamingAuthoritySecurityException was not raised");
		}
	}
	
	////////////////////////////////////////////////////////////
	// deleteKeys authorization error
	// (deleteKey from system identifier)
	////////////////////////////////////////////////////////////
	public void testDeleteKeys() {
		boolean gotexpected = false;
		
		try {
			this.NamingAuthority.deleteKeys(null, getSystemIdentifier(), 
					new String[]{ Keys.ADMIN_USERS });
		} catch (NamingAuthoritySecurityException e) {
			gotexpected = true;
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
		if (!gotexpected) {
			fail("Expected NamingAuthoritySecurityException was not raised");
		}
	}
	
	////////////////////////////////////////////////////////////
	// deleteKeys authorization error
	// (deleting key to identifier that no one can write)
	////////////////////////////////////////////////////////////
	public void testDeleteKeys2() {
		//
		// Create identifier with empty list of WRITE_USERS
		// 
		URI id = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.WRITE_USERS, null);
		values.put("A KEY", null);
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		} 
		
		//
		// Not attempt to delete a key from it
		//
		boolean gotexpected = false;
		try {
			this.NamingAuthority.deleteKeys(null, id, 
					new String[]{"A KEY"});
		} catch (NamingAuthoritySecurityException e) {
			gotexpected = true;
		} catch (Exception e) {
			fail(e.getMessage());
		}
		if (!gotexpected) {
			fail("Expected NamingAuthoritySecurityException was not raised");
		}
	}
	
	///////////////////////////////////////////////////////////////
	// resolveIdentifier authorization error
	// (identifier security - READ_USERS)
	///////////////////////////////////////////////////////////////
	public void testResolveIdentifier1() {
		URI id = null;
		IdentifierData values = new IdentifierData();
		values.put("CODE", new KeyData(null, new String[]{"007"}));
		values.put(Keys.READ_USERS, null);
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		} 
		
		//
		// Resolution
		//
		try {
			this.NamingAuthority.resolveIdentifier(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeys
		//
		try {
			this.NamingAuthority.getKeyNames(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeyData
		//
		try {
			this.NamingAuthority.getKeyData(null, id, "CODE");
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// resolveIdentifier authorization error
	// (identifier security - READWRITE_IDENTIFIERS.READ_USERS)
	///////////////////////////////////////////////////////////////
	public void testResolveIdentifier2() {
		// Create security identifier
		URI rwIdentifier = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.READ_USERS, new KeyData(null, new String[]{"A"}));
		try {
			rwIdentifier = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Create reference to security identifier
		URI id = null;
		values = new IdentifierData();
		values.put("CODE", null);
		values.put(Keys.READWRITE_IDENTIFIERS, new KeyData(null, 
				new String[]{ rwIdentifier.normalize().toString() }));
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// Resolution
		//
		try {
			this.NamingAuthority.resolveIdentifier(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeys
		//
		try {
			this.NamingAuthority.getKeyNames(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeyValues
		//
		try {
			this.NamingAuthority.getKeyData(null, id, "CODE");
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// resolveIdentifier authorization error
	// (key security)
	///////////////////////////////////////////////////////////////
	public void testResolveIdentifier3() {
		// Create security identifier
		URI rwIdentifier = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.READ_USERS, new KeyData(null, new String[]{"A"}));
		try {
			rwIdentifier = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Create reference to security identifier
		URI id = null;
		values = new IdentifierData();
		values.put("CODE", new KeyData(rwIdentifier, new String[]{"008"}));
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// Resolution
		//
		try {
			this.NamingAuthority.resolveIdentifier(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeys
		//
		try {
			this.NamingAuthority.getKeyNames(null, id);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//
		// getKeyValues
		//
		try {
			this.NamingAuthority.getKeyData(null, id, "CODE");
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// replaceKeys authorization error
	// (trying to replace system identifier key)
	///////////////////////////////////////////////////////////////
	public void testReplaceKeys1() {
		//
		// Can we tamper with the system identifier?
		//
		IdentifierValues values = new IdentifierValues();
		values.put(Keys.ADMIN_USERS, new KeyValues(new String[] {"A"}));
		try {
			this.NamingAuthority.replaceKeyValues(null, getSystemIdentifier(), values);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// replaceKeys authorization error
	// (trying to replace key in identifier with empty list of writers)
	///////////////////////////////////////////////////////////////
	public void testReplaceKeys2() {
		URI id = null;
		IdentifierData values = new IdentifierData();
		values.put("CODE", new KeyData(null, new String[]{"007"}));
		values.put(Keys.WRITE_USERS, null);
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		} 
		
		IdentifierValues values2 = new IdentifierValues();
		values2.put("CODE", new KeyValues(new String[] {"008"}));
		try {
			this.NamingAuthority.replaceKeyValues(null, id, values2);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// replaceKeys authorization error
	// (trying to replace key in identifier with a security
	// identifier defined which does not list this user as writer) 
	///////////////////////////////////////////////////////////////
	public void testReplaceKeys3() {
		// Create security identifier
		URI rwIdentifier = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.WRITE_USERS, new KeyData(null, new String[]{"A"}));
		try {
			rwIdentifier = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Create identifier with reference to security identifier
		URI id = null;
		values = new IdentifierData();
		values.put("CODE", null);
		values.put(Keys.READWRITE_IDENTIFIERS, new KeyData(null, 
				new String[]{ rwIdentifier.normalize().toString() }));
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Now try to replace a key
		IdentifierValues values2 = new IdentifierValues();
		values2.put("CODE", new KeyValues(new String[] {"008"}));
		try {
			this.NamingAuthority.replaceKeyValues(null, id, values2);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	///////////////////////////////////////////////////////////////
	// replaceKeys authorization error (key security)
	///////////////////////////////////////////////////////////////
	public void testReplaceKeys4() {
		// Create security identifier
		URI rwIdentifier = null;
		IdentifierData values = new IdentifierData();
		values.put(Keys.WRITE_USERS, new KeyData(null, new String[]{"A"}));
		try {
			rwIdentifier = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Create identifier with reference to security identifier
		URI id = null;
		values = new IdentifierData();
		values.put("CODE", new KeyData(rwIdentifier, new String[]{"007"}));
		try {
			id = this.NamingAuthority.createIdentifier(null, values);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// Now try to replace the value
		IdentifierValues values2 = new IdentifierValues();
		values2.put("CODE", new KeyValues(new String[] {"008"}));
		try {
			this.NamingAuthority.replaceKeyValues(null, id, values2);
			fail("Expected NamingAuthoritySecurityException was not raised");
		} catch (NamingAuthoritySecurityException e) {
			// expected
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
