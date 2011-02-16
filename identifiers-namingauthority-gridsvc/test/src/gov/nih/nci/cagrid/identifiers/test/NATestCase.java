package gov.nih.nci.cagrid.identifiers.test;

import gov.nih.nci.cacoresdk.util.GridAuthenticationClient;
import gov.nih.nci.cagrid.identifiers.client.IdentifiersNAServiceClient;

import java.net.URI;
import java.rmi.RemoteException;

import junit.framework.TestCase;
import namingauthority.IdentifierData;
import namingauthority.KeyData;
import namingauthority.KeyNameData;
import namingauthority.Tree;

import org.apache.axis.types.URI.MalformedURIException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.globus.gsi.GlobusCredential;
import org.junit.Test;

public class NATestCase extends TestCase {
	private static Log LOG = LogFactory.getLog(NATestCase.class);
	private static IdentifiersNAServiceClient client;
	private static IdentifiersNAServiceClient annonymousClient;
	private static String userId = "";
	private static String password = "";
	static {
		GlobusCredential creds = null;
		try {
			String authenticationServiceURL = "https://dorian.training.cagrid.org:8443/wsrf/services/cagrid/Dorian";
			String dorianURL = "https://dorian.training.cagrid.org:8443/wsrf/services/cagrid/Dorian";
			creds = GridAuthenticationClient.authenticate(dorianURL, authenticationServiceURL, userId, password);			
			System.out.println("Using proxy with id= " + creds.getIdentity() + " and lifetime " + creds.getTimeLeft());
		}
		catch (Exception e1) {
			System.out.println("No proxy file loaded so running with no credentials\n" + e1.getMessage());
			e1.getStackTrace();
		}

		try {
			client = new IdentifiersNAServiceClient("https://localhost:8443/wsrf/services/cagrid/IdentifiersNAService",
					creds);
			client.setAnonymousPrefered(true);			
			// client.registerSite("site", "a", "1.0", "srikalyan",
			// "srikalyan@semanticbits.com", "443-481-7555", "sb");

		}
		catch (Exception e) {
			fail("Could able to create a client");
		}
		try {
			annonymousClient = new IdentifiersNAServiceClient(
					"https://localhost:8443/wsrf/services/cagrid/IdentifiersNAService");
		}
		catch (Exception e) {
			fail("Could able to create an annonymous client");
		}
	}

	@Test
	public void testRegisterGSID() {
		// System.out.println("testing the RegisterGSID");
		LOG.info("testing testRegisterGSID method");
		try{
			client.registerGSID(null, null);		
			LOG.info("passed regsiterGSID for "+userId);
		}
		catch(Exception e)
		{
			fail("test registerGSID with annonymous user");			
		}
		
		try {
			client.registerGSID(null, null);
			LOG.info("passed registerGSID for " + userId + ".");
		}
		catch (Exception e) {

			fail("test registerGSID. MSG:\" " + e.getMessage() + "\"");
		}

		String identifier = null;
		try {
			identifier = client.registerGSID(null, null);
			LOG.info("passed registerGSID without parent and Identifier for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without parent and Identifier for " + userId + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			client.registerGSID(null, new String[] { identifier, "   ", "" });
			LOG.info("passed test registerGSID with parentIdentifiers not null for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with parentIdentifiers not null for " + userId + ". MSG: \"" + e.getMessage()
					+ "\"");
		}
		identifier = "5784d1dd-9373-533e-8086-fd479fbd564e";
		try {
			identifier = client.registerGSID(identifier, null);
			LOG.info("passed test registerGSID with suggestedIdentifier not null for " + userId + ". id: " + identifier);
		}
		catch (Exception e) {
			fail("test registerGSID with suggestedIdentifier not null for " + userId + ". MSG: \"" + e.getMessage()
					+ "\"");
		}

		try {
			identifier = client.registerGSID(identifier, new String[] { identifier, "   ", "" });
			fail("test registerGSID with suggestedIdentifier and parent identifiers as not null and with suggestedIdentifier as one of the member in the parent identifier  "
					+ userId);
		}
		catch (Exception e) {
			LOG.info("test registerGSID with suggestedIdentifier and parent identifiers as not null and with suggestedIdentifier as one of the member in the parent identifier "
					+ userId);
		}
	}

	@Test
	public void testRegisterSite() {

		try {
			client.registerSite("    ", "a1", "1.01", "srikalyan1", "srikalyan1@semanticbits.com", "4431", "SB");
			fail("test registeSite for user " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed registerSite for " + userId + " for registiering again. MSG: \"" + e.getMessage() + "\"");
		}

	}

	@Test
	public void testAddSite() {

		try {
			client.addSite(null);
			fail("test addSite with null identifier and unregistered user for " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed addSite with null identifier and unregistered user for " + userId + ". MSG: "
					+ e.getMessage() + "\"");
		}

		String identifier = null;
		try {
			client.addSite(identifier);
			fail("test addSite with null identifier and registered user for " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed addSite with null identifier and registered user for " + userId + ". MSG: \""
					+ e.getMessage() + "\"");
		}

		try {
			identifier = client.registerGSID(null, null);
			LOG.info("passed registerGSID for " + userId + " to test addSite.");
		}
		catch (Exception e) {
			fail("test registerGSID for " + userId + " to test addSite. MSG: \"" + e.getMessage() + "\"");
		}

		try {
			client.addSite(identifier);
			LOG.info("passed addSite with valid identifier for " + userId + ".");
		}
		catch (Exception e) {
			fail("test addSite for " + userId + ". MSG: " + e.getMessage() + "\"");
		}

		identifier = "5784d1dd-9373-433e-8086-fd479fbd564e";
		try {
			client.addSite(identifier);
			fail("test addSite with invalid identifier for " + userId + " ");
		}
		catch (Exception e) {
			LOG.info("passed addSite with invalid identifier for " + userId + "");
		}

	}

	@Test
	public void testCreateBatchIdentifiers() {

		try {
			client.generateIdentifiers(0);
			fail("test generateIdentifiers for unregisterd user " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed generateIdentifiers for unregistered user " + userId + ".");
		}

		try {
			client.generateIdentifiers(10);
			LOG.info("passed ant generateIdentifiers for valid number for " + userId + ".");
		}
		catch (Exception e) {
			fail("test generateIdentifiers for valid number for " + userId + ".");
		}

		try {
			client.generateIdentifiers(102);
			fail("test generateIdentifiers for invalid number for " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed generateIdentifiers for invalid number for " + userId + ".");
		}

		try {
			client.generateIdentifiers(-1);
			fail("test generateIdentifiers for invalid number for " + userId + ".");
		}
		catch (Exception e) {
			LOG.info("passed generateIdentifiers for invalid number for " + userId + ".");
		}
	}

	public void testGetParentHierarchy() {

		String identifier = null;
		Tree tree = null;
		try {
			tree = client.getParentHierarchy(null);
			fail("test getParentHierarchy for user null and identifier null");
		}
		catch (Exception e) {
			LOG.info("passed getParentHierarchy for user null and identifier null");
		}

		try {
			identifier = client.registerGSID(null, null);
			LOG.info("passed registerGSID without parent and Identifier for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without parent and Identifier for " + userId + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = client.getParentHierarchy(identifier);
			LOG.info("passed getParentHierarchy for user null and identifier having no parent");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getParentHierarchy for user null and identifier having no parent");
		}

		try {
			identifier = client.registerGSID(null, new String[] { identifier });
			LOG.info("passed registerGSID with parent for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with parent for " + userId + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = client.getParentHierarchy(identifier);
			LOG.info("passed getParentHierarchy for user null and identifier having more than one parent");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getParentHierarchy for user null and identifier having more than one parent");
		}
	}

	@Test
	public void testGetChildHierarchy() {

		String identifier1 = null;
		Tree tree = null;
		try {
			tree = client.getChildHierarchy(null);
			fail("test getChildHierarchy for user null and identifier null");
		}
		catch (Exception e) {
			LOG.info("passed getChildHierarchy for user null and identifier null");
		}

		try {
			identifier1 = client.registerGSID(null, null);
			LOG.info("passed registerGSID without child and Identifier for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID without child and Identifier for " + userId + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = client.getChildHierarchy(identifier1);
			LOG.info("passed getChildHierarchy for user null and identifier having no child");
			printTree(tree);
		}
		catch (Exception e) {
			fail("test getChildHierarchy for user null and identifier having no child");
		}
		String identifier2 = null;
		try {
			identifier2 = client.registerGSID(null, new String[] { identifier1 });
			LOG.info("passed registerGSID with child for " + userId + ".");
		}
		catch (Exception e) {
			fail("test registerGSID with child for " + userId + ". MSG: \"" + e.getMessage() + "\"");
		}

		try {
			tree = client.getChildHierarchy(identifier1);
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

		boolean isValid;
		try {
			isValid = client.validateIdentifier(identifier);
			fail("test validateIdentifier for null Identifier");
		}
		catch (Exception e) {
			LOG.info("passed validateIdentifier for null Identifier");
		}

		identifier = "b08e7909-401d-4949-9f6d-2c8d8366b173";

		try {
			isValid = client.validateIdentifier(identifier);
			LOG.info("passed validateIdentifier for not null Identifier");
		}
		catch (Exception e) {
			fail("test validateIdentifier for not null Identifier");
		}
		identifier = "b08e7909-401d-9f6d-2c8d8366b173";
		try {
			isValid = client.validateIdentifier(identifier);
			fail("test validateIdentifier for invalid Identifier");
		}
		catch (Exception e) {
			LOG.info("passed validateIdentifier for invalid Identifier");
		}

	}

	@Test
	public void testResolveIdentifier() {
		String identifier = null;
		String identifier1 = null;

		IdentifierData id = null;
		try {
			id = client.resolveIdentifier(identifier);
			fail("test resolveIdentifier for null user and null identifier");
		}
		catch (Exception e) {
			LOG.info("passed resolveIdentifier for null user and null identifier");
		}

		try {
			identifier1 = client.registerGSID(null, null);
			LOG.info("passed registerGSID for " + userId + " to test resolveIdentifier.");
		}
		catch (Exception e) {
			fail("test registerGSID for " + userId + " to test resolveIdentifier. MSG: \"" + e.getMessage() + "\"");
		}

		try {
			Thread.sleep(1000);
			identifier = identifier1;
			id = client.resolveIdentifier(identifier);
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
			if (id.getKeyNameData() != null && id.getKeyNameData().length > 0)
				for (KeyNameData key : id.getKeyNameData()) {
					KeyData values = key.getKeyData();
					if (values != null && values.getValue() != null && values.getValue().length > 0) {
						String temp = key + ": ";
						for (String keyValue : values.getValue())
							temp += keyValue;
						LOG.debug(temp);
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
		LOG.info(tabber + tree.getCurrentIdentifier());
		if (tree.getTree() != null && tree.getTree().length > 0)
			for (Tree child : tree.getTree())
				printTree(child, tabber + "\t");
	}

}
