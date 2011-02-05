package org.cagrid.identifiers.namingauthority.impl;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.cagrid.identifiers.namingauthority.IdentifierGenerator;
import org.cagrid.identifiers.namingauthority.InvalidIdentifierException;
import org.cagrid.identifiers.namingauthority.InvalidIdentifierValuesException;
import org.cagrid.identifiers.namingauthority.MaintainerNamingAuthority;
import org.cagrid.identifiers.namingauthority.NamingAuthorityConfigurationException;
import org.cagrid.identifiers.namingauthority.NamingAuthoritySecurityException;
import org.cagrid.identifiers.namingauthority.SecurityInfo;
import org.cagrid.identifiers.namingauthority.dao.IdentifierMetadataDao;
import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.domain.IdentifierValues;
import org.cagrid.identifiers.namingauthority.domain.KeyData;
import org.cagrid.identifiers.namingauthority.domain.KeyValues;
import org.cagrid.identifiers.namingauthority.domain.NamingAuthorityConfig;
import org.cagrid.identifiers.namingauthority.util.Constant;
import org.cagrid.identifiers.namingauthority.util.IdentifierUtil;
import org.cagrid.identifiers.namingauthority.util.Keys;
import org.cagrid.identifiers.namingauthority.util.SecurityUtil;
import org.cagrid.identifiers.namingauthority.util.Tree;

public class NamingAuthorityImpl implements MaintainerNamingAuthority
{

	private IdentifierMetadataDao identifierDao = null;
	private IdentifierGenerator identifierGenerator = null;
	private NamingAuthorityConfig configuration = null;

	//
	// Getters/Setters
	//

	public void setIdentifierDao(IdentifierMetadataDao identifierDao)
	{
		this.identifierDao = identifierDao;
	}

	public IdentifierMetadataDao getIdentifierDao()
	{
		return identifierDao;
	}

	public void setConfiguration(NamingAuthorityConfig config)
	{
		this.configuration = config;
	}

	public NamingAuthorityConfig getConfiguration()
	{
		return this.configuration;
	}

	public void setIdentifierGenerator(IdentifierGenerator generator)
	{
		this.identifierGenerator = generator;
	}

	public IdentifierGenerator getIdentifierGenerator()
	{
		return identifierGenerator;
	}

	//
	// Interfaces
	//

	public void initialize() throws NamingAuthorityConfigurationException
	{
		this.identifierDao.initialize(configuration.getNaPrefixURI());
	}

	/******
	 * 
	 */
	public URI createIdentifier(SecurityInfo secInfo, URI localIdentifier, IdentifierData ivalues)
			throws NamingAuthorityConfigurationException, InvalidIdentifierException, NamingAuthoritySecurityException,
			InvalidIdentifierValuesException
	{

		validateIdentifierValues(ivalues);
		if (localIdentifier == null)
		{
			localIdentifier = generateIdentifier();
		}
		else
		{
			try
			{
				IdentifierData tempData = resolveIdentifier(secInfo, localIdentifier);
				if (tempData != null)
				{
					localIdentifier = generateIdentifier();
				}
			}
			catch (Exception e)
			{

			}
		}
		this.identifierDao.createIdentifier(secInfo, localIdentifier, ivalues);
		return IdentifierUtil.build(configuration.getNaPrefixURI(), localIdentifier);
	}

	public URI createIdentifier(SecurityInfo secInfo, IdentifierData ivalues)
			throws NamingAuthorityConfigurationException, InvalidIdentifierException, NamingAuthoritySecurityException,
			InvalidIdentifierValuesException
	{
		return createIdentifier(secInfo, null, ivalues);
	}

	public String[] createBatchIdentifiers(SecurityInfo secInfo, int numberOfIdentifier)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{		
		if (numberOfIdentifier <= 0 || numberOfIdentifier > 100)
		{
			throw new InvalidIdentifierValuesException(Constant.INVALID_NUMBER_FOR_BATCH);
		}
		List<String> temp = new ArrayList<String>(numberOfIdentifier);
		String[] temp1 = new String[numberOfIdentifier];
		int count = 0;
		while (count < numberOfIdentifier)
		{
			String tempIdentifier;
			do
			{
				tempIdentifier = generateIdentifier().toString();
			} while (temp.contains(tempIdentifier));
			count++;
			temp.add(tempIdentifier);
		}
		return temp.toArray(temp1);
	}

	public IdentifierData resolveIdentifier(SecurityInfo secInfo, URI identifier) throws InvalidIdentifierException,
			NamingAuthorityConfigurationException, NamingAuthoritySecurityException
	{
		return this.identifierDao.resolveIdentifier(secInfo, identifier);
	}

	public void createKeys(SecurityInfo secInfo, URI identifier, IdentifierData newKeys)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{
		validateIdentifierValues(newKeys);
		this.identifierDao.createKeys(secInfo, identifier, newKeys);
	}

	public String[] getKeyNames(SecurityInfo secInfo, URI identifier) throws NamingAuthorityConfigurationException,
			InvalidIdentifierException, NamingAuthoritySecurityException
	{
		return this.identifierDao.getKeyNames(secInfo, identifier);
	}

	public KeyData getKeyData(SecurityInfo secInfo, URI identifier, String key) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, NamingAuthorityConfigurationException, InvalidIdentifierValuesException
	{
		return this.identifierDao.getKeyData(secInfo, identifier, key);
	}

	public void deleteKeys(SecurityInfo secInfo, URI identifier, String[] keyList)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{
		this.identifierDao.deleteKeys(secInfo, identifier, keyList);
	}

	public void replaceKeyValues(SecurityInfo secInfo, URI identifier, IdentifierValues values)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{

		validateKeyValues(values);
		this.identifierDao.replaceKeyValues(secInfo, identifier, values);
	}

	public String registerGSID(SecurityInfo secInfo, String suggestedIdentifer, String[] parentIdentifiers)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{
		return this.identifierDao.registerGSID(secInfo, suggestedIdentifer, parentIdentifiers);
	}

	public void registerSite(SecurityInfo secInfo, String application, String applicationURL,
			String applicationVersion, String contactName, String contactEmail, String contactPhone, String organization)
			throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException,
			NamingAuthoritySecurityException
	{
		this.identifierDao.registerSite(secInfo, application, applicationURL, applicationVersion, contactName,
				contactEmail, contactPhone, organization);
	}

	public void addSite(SecurityInfo secInfo, String identifier) throws NamingAuthorityConfigurationException,
			InvalidIdentifierValuesException, InvalidIdentifierException, NamingAuthoritySecurityException
	{
		this.identifierDao.addSite(secInfo, identifier);
	}

	public boolean validateIdentifier(SecurityInfo secInfo, String identifier) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, NamingAuthorityConfigurationException
	{
		return this.identifierDao.validateIdentifier(secInfo, identifier);
	}

	public Tree getParentHierarchy(SecurityInfo secInfo, String identifier) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, NamingAuthorityConfigurationException
	{
		return this.identifierDao.getParentHierarchy(secInfo, identifier);
	}

	public Tree getChildHierarchy(SecurityInfo secInfo, String identifier) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, InvalidIdentifierValuesException, NamingAuthorityConfigurationException
	{
		return this.identifierDao.getChildHierarchy(secInfo, identifier);
	}

	public List<IdentifierData> getSitesData(SecurityInfo secInfo) throws InvalidIdentifierException,
			NamingAuthoritySecurityException, InvalidIdentifierValuesException, NamingAuthorityConfigurationException
	{
		return this.identifierDao.getSitesData(secInfo, configuration.getNaPrefixURI());
	}

	public String getIdentifierFromUser(String userName)
	{
		return this.identifierDao.getIdentifierFromUser(userName);
	}

	//
	// Other public
	//

	public URI getSystemIdentifier()
	{
		return URI.create(configuration.getNaPrefixURI().normalize().toString()
				+ SecurityUtil.LOCAL_SYSTEM_IDENTIFIER.normalize().toString());
	}

	//
	// Private
	//

	private URI generateIdentifier()
	{
		URI identifier = identifierGenerator.generate(getConfiguration());
		while (this.identifierDao.checkIfIdentifierExists(identifier))
		{
			identifier = identifierGenerator.generate(getConfiguration());
		}
		return identifier;
	}

	private void validateKeyValues(IdentifierValues keyValues) throws NamingAuthorityConfigurationException,
			InvalidIdentifierValuesException
	{

		if (keyValues == null || keyValues.getValues() == null)
		{
			return;
		}

		for (String key : keyValues.getKeys())
		{
			validateKeyValues(key, keyValues.getValues(key));
		}
	}

	private void validateKeyValues(String key, KeyValues keyValues) throws NamingAuthorityConfigurationException,
			InvalidIdentifierValuesException
	{

		if (keyValues == null)
		{
			return;
		}

		List<String> values = keyValues.getValues();

		if (key == null || key.equals(""))
		{
			throw new InvalidIdentifierValuesException("Key names are required");
		}

		if (values == null)
		{
			return;
		}

		if (key.equals(Keys.ADMIN_IDENTIFIERS) || key.equals(Keys.READWRITE_IDENTIFIERS))
		{

			for (String identifier : values)
			{
				// make sure it's local to prefix
				try
				{
					IdentifierUtil.getLocalName(configuration.getNaPrefixURI(), URI.create(identifier));
				}
				catch (InvalidIdentifierException e)
				{
					throw new InvalidIdentifierValuesException(e.getMessage());
				}
			}
		}
	}

	private void validateIdentifierValues(IdentifierData values) throws NamingAuthorityConfigurationException,
			InvalidIdentifierValuesException
	{

		if (values == null || values.getKeys() == null)
		{
			return;
		}

		for (String key : values.getKeys())
		{

			if (key == null || key.equals(""))
			{
				throw new InvalidIdentifierValuesException("Key names are required");
			}

			KeyData kd = values.getValues(key);
			if (kd == null)
				continue;

			if (kd.getPolicyIdentifier() != null)
			{
				// make sure it's local to prefix
				try
				{
					IdentifierUtil.getLocalName(configuration.getNaPrefixURI(), kd.getPolicyIdentifier());
				}
				catch (InvalidIdentifierException e)
				{
					throw new InvalidIdentifierValuesException(e.getMessage());
				}
			}

			validateKeyValues(key, kd);
		}
	}

}
