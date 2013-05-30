/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package gov.nih.nci.cacoresdk.util;

import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cagrid.opensaml.SAMLAssertion;
import gov.nih.nci.cagrid.syncgts.bean.SyncDescription;
import gov.nih.nci.cagrid.syncgts.core.SyncGTS;

import org.cagrid.gaards.authentication.BasicAuthentication;
import org.cagrid.gaards.authentication.client.AuthenticationClient;
import org.cagrid.gaards.dorian.client.GridUserClient;
import org.cagrid.gaards.dorian.federation.CertificateLifetime;
import org.globus.gsi.GlobusCredential;


/**
 * Client program to perform the grid authentication workflow
 * 
 * @author Satish Patel (svpatel@ekagrasoft.com)
 * 
 */
public class GridAuthenticationClient
{
	/*********************
	 * This method is used to get the globus credential for given dorian url, authentication service url, user id and string.
	 * @param dorianURL
	 * @param authenticationServiceURL
	 * @param userId
	 * @param password
	 * @return globus credential of the user.
	 * @throws Exception
	 */
	public static GlobusCredential authenticate(String dorianURL,
			String authenticationServiceURL, String userId, String password)
			throws Exception
	{
		// Create credential

		BasicAuthentication auth = new BasicAuthentication();
		auth.setUserId(userId);
		auth.setPassword(password);

		// Authenticate to the IdP (DorianIdP) using credential

		AuthenticationClient authClient = new AuthenticationClient(
				authenticationServiceURL);
		SAMLAssertion saml = authClient.authenticate(auth);

		// Requested Grid Credential lifetime (12 hours)

		CertificateLifetime lifetime = new CertificateLifetime();
		lifetime.setHours(12);

		// Request PKI/Grid Credential
		GridUserClient dorian = new GridUserClient(dorianURL);
		GlobusCredential credential = dorian.requestUserCertificate(saml,
				lifetime);
		return credential;
	}

	// From: http://cagrid.org/display/gts12/Programmatic+Approach
	// Purpose: obtain trusted CA certificates from Slave GTS service
	public static boolean synchronizeOnce(String syncDescriptionFile)
	{

		boolean success = false;
		try
		{
			// Load Sync Description
			String pathToSyncDescription = syncDescriptionFile;
			SyncDescription description = (SyncDescription) Utils
					.deserializeDocument(pathToSyncDescription,
							SyncDescription.class);

			// Sync with the Trust Fabric Once
			SyncGTS.getInstance().syncOnce(description);
			success = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return success;
	}

	// Purpose: obtain trusted CA certificates from Slave GTS service repeatedly
	private static boolean synchronizePeriodic(String syncDescriptionFile)
	{
		boolean success = false;
		try
		{
			// Load Sync Description
			String pathToSyncDescription = syncDescriptionFile; // "conf/training/sync-description.xml";
			SyncDescription description = (SyncDescription) Utils
					.deserializeDocument(pathToSyncDescription,
							SyncDescription.class);

			// Sync with the Trust Fabric Once
			SyncGTS.getInstance().syncAndResync(description, success);
			success = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return success;
	}

}