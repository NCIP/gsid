package org.cagrid.identifiers.namingauthority;

import java.net.URI;
import java.util.List;

import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.domain.IdentifierValues;
import org.cagrid.identifiers.namingauthority.util.Tree;

public interface MaintainerNamingAuthority extends NamingAuthority
{

	public URI createIdentifier(SecurityInfo secInfo, URI identifier, IdentifierData ivalues)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public URI createIdentifier(SecurityInfo secInfo, IdentifierData ivalues)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public void deleteKeys(SecurityInfo secInfo, URI identifier, String[] keyList)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public void createKeys(SecurityInfo secInfo, URI identifier, IdentifierData values)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;;

	public void replaceKeyValues(SecurityInfo secInfo, URI identifier, IdentifierValues values)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public String registerGSID(SecurityInfo secInfo, String suggestedIdentifer, String[] parentIdentifiers)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public void registerSite(SecurityInfo secInfo, String application, String applicationURL,
			String applicationVersion, String contactName, String contactEmail, String contactPhone, String organization)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public String[] createBatchIdentifiers(SecurityInfo secInfo, int numberOfIdentifier)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException;

	public void addSite(SecurityInfo secInfo, String identifier) throws NamingAuthorityConfigurationException,
			InvalidIdentifierValuesException, InvalidIdentifierException, NamingAuthoritySecurityException;

	public boolean validateIdentifier(SecurityInfo secInfo,String identifier) throws InvalidIdentifierException,
	NamingAuthoritySecurityException, NamingAuthorityConfigurationException;
	
	public Tree getParentHierarchy(SecurityInfo secInfo, String identifier) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, NamingAuthorityConfigurationException;

	public Tree getChildHierarchy(SecurityInfo secInfo, String identifier) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, InvalidIdentifierValuesException, NamingAuthorityConfigurationException;

	public List<IdentifierData> getSitesData(SecurityInfo secInfo) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, InvalidIdentifierValuesException, NamingAuthorityConfigurationException;

	public String getIdentifierFromUser(String userName);
}
