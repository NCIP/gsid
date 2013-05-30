/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

import java.net.URI;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.domain.KeyData;
import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.cagrid.identifiers.namingauthority.test.NamingAuthorityTestCaseBase;
import org.cagrid.identifiers.namingauthority.util.Tree;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

public class NamingAuthorityTestCase extends NamingAuthorityTestCaseBase {

	private static IdentifierData globalValues = null;
	protected static Log LOG = LogFactory.getLog(NamingAuthorityTestCase.class.getName());

	static {
		globalValues = new IdentifierData();

		globalValues.put("URL", new KeyData(null,
				new String[] { "http://na.cagrid.org/foo", "http://na.cagrid.org/bar" }));

		globalValues.put("CODE", new KeyData(null, new String[] { "007" }));
	}

	@Test
	public void testRegisterGSID() {
		// System.out.println("testing the RegisterGSID");
		LOG.info("testing testRegisterGSID method");

		// check no register access.
		SecurityInfo secInfo = new SecurityInfoImpl("Unknown");
		try {
			this.NamingAuthority.registerGSID(secInfo, null, null);
			fail("test registerGSID");
		}
		catch (Exception e) {
			LOG.info("passed registerGSID for " + secInfo.getUser() + ". MSG:\" " + e.getMessage() + "\"");
		}

		secInfo = new SecurityInfoImpl("User13");

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite inorder to test registerGSID for user " + secInfo.getUser());
		}
		catch (Exception e) {
			StringBuffer sb = new StringBuffer();
			for (StackTraceElement temp : e.getStackTrace())
				sb.append(temp.getClassName() + "[" + temp.getLineNumber() + "]\n");
			fail("test registeSite for user " + secInfo.getUser() + ". MSG:\"" + sb.toString() + "\"");
		}
		String identifier = null;
		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, null, null);
			LOG.info("passed registerGSID without parent and Identifier for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without parent and Identifier for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			this.NamingAuthority.registerGSID(secInfo, null, new String[] { identifier, "   ", "" });
			LOG.info("passed test registerGSID with parentIdentifiers not null for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with parentIdentifiers not null for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}
		identifier = "5784d1dd-9373-533e-8086-fd479fbd564e";
		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, identifier, null);
			LOG.info("passed test registerGSID with suggestedIdentifier not null for " + secInfo.getUser() + ". id: "
					+ identifier);
		}
		catch (Exception e) {
			fail("test registerGSID with suggestedIdentifier not null for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, identifier, new String[] { identifier, "   ", "" });
			fail("test registerGSID with suggestedIdentifier and parent identifiers as not null and with suggestedIdentifier as one of the member in the parent identifier  "
					+ secInfo.getUser());
		}
		catch (Exception e) {
			LOG.info("test registerGSID with suggestedIdentifier and parent identifiers as not null and with suggestedIdentifier as one of the member in the parent identifier "
					+ secInfo.getUser());
		}
	}

	@Test
	public void testRegisterSite() {
		SecurityInfo secInfo = new SecurityInfoImpl("User2");

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registeSite for " + secInfo.getUser() + ". MSG: \"" + e.getMessage() + "\"");
			e.getStackTrace();
		}

		try {
			this.NamingAuthority.registerSite(secInfo, "a1", "a1", "1.01", "srikalyan1", "srikalyan1@semanticbits.com",
					"4431", "SB");
			fail("test registeSite for user " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed registerSite for " + secInfo.getUser() + " for registiering again. MSG: \""
					+ e.getMessage() + "\"");
		}

	}

	@Test
	public void testAddSite() {
		SecurityInfo secInfo = new SecurityInfoImpl("Unknown");
		try {
			this.NamingAuthority.addSite(secInfo, null);
			fail("test addSite with null identifier and unregistered user for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed addSite with null identifier and unregistered user for " + secInfo.getUser() + ". MSG: "
					+ e.getMessage() + "\"");
		}

		secInfo = new SecurityInfoImpl("User3");

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite for " + secInfo.getUser() + " inorder to test addSite.");
		}
		catch (Exception e) {
			fail("test registeSite for " + secInfo.getUser() + ". MSG: \"" + e.getMessage() + "\"");
		}

		String identifier = null;
		try {
			this.NamingAuthority.addSite(secInfo, identifier);
			fail("test addSite with null identifier and registered user for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed addSite with null identifier and registered user for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, null, null);
			LOG.info("passed registerGSID for " + secInfo.getUser() + " to test addSite.");
		}
		catch (Exception e) {
			fail("test registerGSID for " + secInfo.getUser() + " to test addSite. MSG: \"" + e.getMessage() + "\"");
		}

		secInfo = new SecurityInfoImpl("User4");

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite for " + secInfo.getUser() + " inorder to test addSite.");
		}
		catch (Exception e) {
			fail("test registeSite for " + secInfo.getUser() + " inorder to test addSite. MSG: \"" + e.getMessage()
					+ "\"");
		}

		try {
			this.NamingAuthority.addSite(secInfo, identifier);
			LOG.info("passed addSite with valid identifier for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test addSite for " + secInfo.getUser() + ". MSG: " + e.getMessage() + "\"");
		}

		identifier = "5784d1dd-9373-433e-8086-fd479fbd564e";
		try {
			this.NamingAuthority.addSite(secInfo, identifier);
			fail("test addSite with invalid identifier for " + secInfo.getUser() + " ");
		}
		catch (Exception e) {
			LOG.info("passed addSite with invalid identifier for " + secInfo.getUser() + "");
		}

	}

	@Test
	public void testCreateBatchIdentifiers() {
		SecurityInfoImpl secInfo = new SecurityInfoImpl("null");
		try {
			this.NamingAuthority.createBatchIdentifiers(secInfo, 0);
			fail("test createBatchIdentifiers for user " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed createBatchIdentifiers for " + secInfo.getUser() + ".");
		}

		secInfo = new SecurityInfoImpl("User5");
		

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite inorder to test createBatchIdentifiers for user " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registeSite for user " + secInfo.getUser() + " to test creatBatchIdentifiers. MSG:\""
					+ e.getMessage() + "\"");
		}
		try {
			this.NamingAuthority.createBatchIdentifiers(secInfo, 10);
			LOG.info("passed createBatchIdentifiers for valid number for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test createBatchIdentifiers for valid number for " + secInfo.getUser() + ".");
		}

		try {
			this.NamingAuthority.createBatchIdentifiers(secInfo, 102);
			fail("test createBatchIdentifiers for invalid number for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed createBatchIdentifiers for invalid number for " + secInfo.getUser() + ".");
		}

		try {
			this.NamingAuthority.createBatchIdentifiers(secInfo, -1);
			fail("test createBatchIdentifiers for invalid number for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			LOG.info("passed createBatchIdentifiers for invalid number for " + secInfo.getUser() + ".");
		}
	}

	public void testGetParentHierarchy() {

		SecurityInfo secInfo = new SecurityInfoImpl("User6");
		String identifier = null;
		Tree tree = null;
		try {
			tree = this.NamingAuthority.getParentHierarchy(null, null);
			fail("test getParentHierarchy for user null and identifier null");
		}
		catch (Exception e) {
			LOG.info("passed getParentHierarchy for user null and identifier null");
		}

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite inorder to test getParentHierarchy for user " + secInfo.getUser());
		}
		catch (Exception e) {
			fail("test registeSite for user " + secInfo.getUser() + ". MSG:\"" + e.getMessage() + "\"");
		}

		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, null, null);
			LOG.info("passed registerGSID without parent and Identifier for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without parent and Identifier for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			tree = this.NamingAuthority.getParentHierarchy(null, identifier);
			LOG.info("passed getParentHierarchy for user null and identifier having no parent");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getParentHierarchy for user null and identifier having no parent");
		}

		try {
			identifier = this.NamingAuthority.registerGSID(secInfo, null, new String[] { identifier });
			LOG.info("passed registerGSID with parent for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with parent for " + secInfo.getUser() + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = this.NamingAuthority.getParentHierarchy(null, identifier);
			LOG.info("passed getParentHierarchy for user null and identifier having more than one parent");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getParentHierarchy for user null and identifier having more than one parent");
		}
	}

	@Test
	public void testGetChildHierarchy() {
		SecurityInfo secInfo = new SecurityInfoImpl("User7");
		String identifier1 = null;
		Tree tree = null;
		try {
			tree = this.NamingAuthority.getChildHierarchy(null, null);
			fail("test getChildHierarchy for user null and identifier null");
		}
		catch (Exception e) {
			LOG.info("passed getChildHierarchy for user null and identifier null");
		}

		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite inorder to test getChildHierarchy for user " + secInfo.getUser());
		}
		catch (Exception e) {
			fail("test registeSite for user " + secInfo.getUser() + ". MSG:\"" + e.getMessage() + "\"");
		}

		try {
			identifier1 = this.NamingAuthority.registerGSID(secInfo, null, null);
			LOG.info("passed registerGSID without child and Identifier for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without child and Identifier for " + secInfo.getUser() + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			tree = this.NamingAuthority.getChildHierarchy(null, identifier1);
			LOG.info("passed getChildHierarchy for user null and identifier having no child");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getChildHierarchy for user null and identifier having no child");
		}
		String identifier2 = null;
		try {
			identifier2 = this.NamingAuthority.registerGSID(secInfo, null, new String[] { identifier1 });
			LOG.info("passed registerGSID with child for " + secInfo.getUser() + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with child for " + secInfo.getUser() + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = this.NamingAuthority.getChildHierarchy(null, identifier1);
			LOG.info("passed getChildHierarchy for user null and identifier having more than one child");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getChildHierarchy for user null and identifier having more than one child");
		}
	}

	@Test
	public void testValidateIdentifier() {
		String identifier = null;
		SecurityInfo secInfo = null;
		boolean isValid;
		try {
			isValid = this.NamingAuthority.validateIdentifier(secInfo, identifier);
			fail("test validateIdentifier for null Identifier");
		}
		catch (Exception e) {
			LOG.info("passed validateIdentifier for null Identifier");
		}

		identifier = "b08e7909-401d-4949-9f6d-2c8d8366b173";

		try {
			isValid = this.NamingAuthority.validateIdentifier(secInfo, identifier);
			LOG.info("passed validateIdentifier for not null Identifier");
		}
		catch (Exception e) {
			fail("test validateIdentifier for not null Identifier");
		}
		identifier = "b08e7909-401d-9f6d-2c8d8366b173";
		try {
			isValid = this.NamingAuthority.validateIdentifier(secInfo, identifier);
			fail("test validateIdentifier for invalid Identifier");
		}
		catch (Exception e) {
			LOG.info("passed validateIdentifier for invalid Identifier");
		}

	}

	@Test
	public void testResolveIdentifier() {
		URI identifier = null;
		String identifier1 = null;
		SecurityInfo secInfo = null;
		IdentifierData id = null;
		try {
			id = this.NamingAuthority.resolveIdentifier(secInfo, identifier);
			fail("test resolveIdentifier for null user and null identifier");
		}
		catch (Exception e) {
			LOG.info("passed resolveIdentifier for null user and null identifier");
		}
		secInfo = new SecurityInfoImpl("User8");
		try {
			this.NamingAuthority.registerSite(secInfo, "a", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com",
					"443", "SB");
			LOG.info("passed registerSite for " + secInfo.getUser() + " inorder to test resolveIdentifier.");
		}
		catch (Exception e) {
			fail("test registeSite for " + secInfo.getUser() + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			identifier1 = this.NamingAuthority.registerGSID(secInfo, null, null);
			LOG.info("passed registerGSID for " + secInfo.getUser() + " to test resolveIdentifier.");
		}
		catch (Exception e) {
			fail("test registerGSID for " + secInfo.getUser() + " to test resolveIdentifier. MSG: \"" + e.getMessage()
					+ "\"");
		}

		try {
			Thread.sleep(1000);
			identifier = new URI(identifier1);
			id = this.NamingAuthority.resolveIdentifier(secInfo, identifier);
			if (id == null) {
				fail("test resolveIdentifier for null user and valid identifier");
			}
			else {
				LOG.info("passed resolveIdentifier for null user and valid identifier");
				printData(id);
			}
		}
		catch (Exception e) {
			fail("test resolveIdentifier for null user and not null identifier " + identifier1);
		}

	}

	private void printData(IdentifierData id) {
		if (id != null) {
			for (String key : id.getKeys()) {
				KeyData values = id.getValues(key);
				if (values != null) {
					LOG.info(key + ": " + values.getValues());
				}
			}
		}
	}

	private void printTree(Tree tree) {
		if (tree == null) {
			return;
		}
		String tabber = "";
		printTree(tree, tabber);
	}

	private void printTree(Tree tree, String tabber) {
		if (tree == null)
			return;
		LOG.info(tabber + tree.getIdentifier());
		if (tree.getChildren() != null && tree.getChildren().size() > 0)
			for (Tree child : tree.getChildren())
				printTree(child, tabber + "\t");
	}
	
}
