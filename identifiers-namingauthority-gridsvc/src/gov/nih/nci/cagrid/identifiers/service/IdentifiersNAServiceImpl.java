package gov.nih.nci.cagrid.identifiers.service;

import gov.nih.nci.cagrid.identifiers.common.IdentifiersNAUtil;
import gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault;

import java.net.URI;
import java.net.URISyntaxException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.types.URI.MalformedURIException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cagrid.identifiers.namingauthority.InvalidIdentifierException;
import org.cagrid.identifiers.namingauthority.InvalidIdentifierValuesException;
import org.cagrid.identifiers.namingauthority.MaintainerNamingAuthority;
import org.cagrid.identifiers.namingauthority.NamingAuthorityConfigurationException;
import org.cagrid.identifiers.namingauthority.NamingAuthoritySecurityException;
import org.cagrid.identifiers.namingauthority.SecurityInfo;
import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.cagrid.identifiers.namingauthority.util.Tree;
import org.globus.wsrf.security.SecurityManager;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * The service side implementation class of the IdentifiersNAService, managed by
 * Introduce. This mostly just delegates the operations to a Spring-loaded bean
 * implementation of the NamingAuthority and does any necessary mapping to/from
 * Axis types or arrays to the Naming Authority interface.
 * 
 * @created by Introduce Toolkit version 1.3
 */
public class IdentifiersNAServiceImpl extends IdentifiersNAServiceImplBase {

	protected static Log LOG = LogFactory.getLog(IdentifiersNAServiceImpl.class.getName());
	protected static final String NA_BEAN_NAME = "NamingAuthority";
	protected MaintainerNamingAuthority namingAuthority = null;

	public IdentifiersNAServiceImpl() throws RemoteException {
		super();

		try {
			String naConfigurationFile = getConfiguration().getNaConfigurationFile();
			String naProperties = getConfiguration().getNaPropertiesFile();
			FileSystemResource naConfResource = new FileSystemResource(naConfigurationFile);
			FileSystemResource naPropertiesResource = new FileSystemResource(naProperties);

			XmlBeanFactory factory = new XmlBeanFactory(naConfResource);
			PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();
			cfg.setLocation(naPropertiesResource);
			cfg.postProcessBeanFactory(factory);

			this.namingAuthority = (MaintainerNamingAuthority) factory.getBean(NA_BEAN_NAME,
					MaintainerNamingAuthority.class);

		}
		catch (Exception e) {
			String message = "Problem inititializing NamingAuthority while loading configuration:" + e.getMessage();
			LOG.error(message, e);
			throw new RemoteException(message, e);
		}
	}

	/**********************
	 * creates an identifier
	 * 
	 * @param identifierData
	 * @return
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 */

	/******
	 * This method is used to get the data associated with an identifier. This
	 * method is a non authentication oriented operation.
	 * 
	 * @param identifier
	 * @return Identifier data.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public namingauthority.IdentifierData resolveIdentifier(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {

		try {
			LOG.info("resolveIdentifier: USER=========[" + SecurityManager.getManager().getCaller() + "]");
			SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
			return IdentifiersNAUtil.map(namingAuthority.resolveIdentifier(secInfo, URI.create(identifier)));
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}
	}

	/**********
	 * This method is used to create keys.
	 * @param identifier
	 * @param identifierData
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 */

	/*************
	 * This method is used to get the key names of the of an identifier.
	 * @param identifier
	 * @return
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */

	/**************
	 * This method is used to get the key data associated with a key for an identifier.
	 * @param identifier
	 * @param keyName
	 * @return
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 */

	/****
	 * This method is used to register GSID in to the database of the GSID. This
	 * method is an authentication oriented operation.
	 * 
	 * @param suggestedIdentifier
	 *            is an optional parameter (can be null) which is used to
	 *            register an non existing identifier. If the identifier already
	 *            exists then new identifier is generated and returned.
	 * @param parentIdentifiers
	 *            is an array of identifiers which are already registered and
	 *            exists in the database.
	 * @return registered identifier.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public java.lang.String registerGSID(java.lang.String suggestedIdentifier,java.lang.String[] parentIdentifiers) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
		LOG.info("registerGSID: USER=========[" + SecurityManager.getManager().getCaller() + "]");
		SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
		try {
			return namingAuthority.registerGSID(secInfo, suggestedIdentifier, parentIdentifiers);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierValuesException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}
	}

	/*****************************
	 * This method is used to add an identifier to a site. This method is an
	 * authentication oriented operation. The identifier should exists in the
	 * database.
	 * 
	 * @param identifier
	 *            is an existing GSID to which you would like to attach your
	 *            site data.
	 * @return
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public org.apache.axis.types.URI addSite(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
		LOG.info("addSite: USER=========[" + SecurityManager.getManager().getCaller() + "]");
		SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
		try {
			namingAuthority.addSite(secInfo, identifier);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierValuesException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}

		return null;

	}

	/**********************************
	 * This method is used to generate a batch of identifiers. This method is a
	 * non authentication oriented operation.
	 * 
	 * @param numOfIdentifiers
	 *            is the number of identifiers you are requesting for should be
	 *            between 1 and 100.
	 * @return array of identifiers.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public java.lang.String[] generateIdentifiers(int numOfIdentifiers) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
		LOG.info("generateIdentifiers: USER=========[" + SecurityManager.getManager().getCaller() + "]");
		SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
		try {
			return namingAuthority.createBatchIdentifiers(secInfo, numOfIdentifiers);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierValuesException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}

	}

	/****************************************
	 * This method is used to get the parent hierarchy details about the
	 * identifiers. This method is a non authentication oriented operation.
	 * 
	 * @param identifier
	 *            is the GSID for which you would like to get parent hierarchy
	 *            information.
	 * @return a tree representing the parent hierarchy.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 */
  public namingauthority.Tree getParentHierarchy(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault {
		try {
			LOG.info("getParentHierarchy: USER=========[" + SecurityManager.getManager().getCaller() + "]");
			SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
			Tree parents = namingAuthority.getParentHierarchy(secInfo, identifier.toString());
			return convert(parents);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}

	}

	/*****************************************
	 * This method is used to get the child hierarchy details about the
	 * identifiers. This method is a non authentication oriented operation.
	 * 
	 * @param identifier
	 *            is the GSID for which you would like to get child hierarchy
	 *            information.
	 * @return a tree representing the child hierarchy.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public namingauthority.Tree getChildHierarchy(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
		try {
			LOG.info("getChildHierarchy: USER=========[" + SecurityManager.getManager().getCaller() + "]");
			SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
			Tree children = namingAuthority.getChildHierarchy(secInfo, identifier.toString());
			return convert(children);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}
	}

	/******************************
	 * This method is used to register site information related to a globus
	 * credential. This is an authentication oriented operation. This operation
	 * should be executed before any other authentication operation for a new
	 * globus credential. Throws an exception if the globus credentials has
	 * already registered a site.
	 * 
	 * @param application
	 *            is the name of the application
	 * @param applicationURL
	 *            is the URL of the application
	 * @param applicationVersion
	 *            is the version of the application
	 * @param contactName
	 *            is the contact of the site.
	 * @param contactEmail
	 *            is the email address of the contact of the site.
	 * @param contactPhone
	 *            is the phone number of the contact.
	 * @param organization
	 *            is the organization of the site.
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault
	 */
  public void registerSite(java.lang.String application,java.lang.String applicationURL,java.lang.String applicationVersion,java.lang.String contactName,java.lang.String contactEmail,java.lang.String contactPhone,java.lang.String organization) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {

		LOG.info("registerSite: USER=========[" + SecurityManager.getManager().getCaller() + "]");
		try {
			SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
			namingAuthority.registerSite(secInfo, application, applicationURL, applicationVersion, contactName,
					contactEmail, contactPhone, organization);
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}

	}

	/**************************************************
	 * This method checks if the identifier exists in the database or not. if
	 * identifier does not exists returns true else false. This is a non
	 * authentication oriented operation.
	 * 
	 * @param identifier
	 * @return
	 * @throws RemoteException
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault
	 * @throws gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault
	 */
  public boolean validateIdentifier(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault {
		try {
			LOG.info("getChildHierarchy: USER=========[" + SecurityManager.getManager().getCaller() + "]");
			SecurityInfo secInfo = new SecurityInfoImpl(SecurityManager.getManager().getCaller());
			boolean flag = namingAuthority.validateIdentifier(secInfo, identifier);
			return flag;
		}
		catch (NamingAuthorityConfigurationException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (InvalidIdentifierException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (NamingAuthoritySecurityException e) {
			e.printStackTrace();
			throw IdentifiersNAUtil.map(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.toString());
		}
	}

	private namingauthority.Tree convert(Tree tree) {
		namingauthority.Tree temp = null;
		if (tree != null) {
			String identifier = tree.getIdentifier();
			namingauthority.Tree[] mytrees = null;
			if (tree.getChildren() != null && tree.getChildren().size() > 0) {
				mytrees = new namingauthority.Tree[tree.getChildren().size()];
				for (int i = 0; i < mytrees.length; i++) {
					mytrees[i] = convert(tree.getChildren().get(i));
				}
			}
			temp = new namingauthority.Tree(identifier, mytrees);
		}
		return temp;
	}

}
