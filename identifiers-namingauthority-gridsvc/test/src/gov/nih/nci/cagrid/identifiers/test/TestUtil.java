package gov.nih.nci.cagrid.identifiers.test;

import gov.nih.nci.cagrid.identifiers.client.IdentifiersNAServiceClient;
import gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault;
import gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault;

import java.rmi.RemoteException;

import namingauthority.IdentifierData;
import namingauthority.Tree;

public class TestUtil
{	
	private IdentifiersNAServiceClient client;	
	
	
	public TestUtil(IdentifiersNAServiceClient client)
	{		
		this.client = client;
	}

	public TestUtil()
	{
	}

	public String registerGSID(String suggestedIdentifier,String[] parentIdentifiers) throws NamingAuthorityConfigurationFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{
		String identifier=null;
		identifier=client.registerGSID(suggestedIdentifier, parentIdentifiers);
		return identifier;
	}
	
	public void addSite(String identifier) throws NamingAuthorityConfigurationFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{		
		client.addSite(identifier);
	}
	
	public String[] createBatchIdentifiers(int numOfIdentifiers) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, RemoteException
	{
		String[] temp=null;
		temp=client.generateIdentifiers(numOfIdentifiers);
		return temp;
	}
	
	public IdentifierData resolveIdentifier(String identifier) throws NamingAuthorityConfigurationFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{
		IdentifierData temp=client.resolveIdentifier(identifier);
		return temp;		
	}
	
	public Tree getParentHierarch(String identifier) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, RemoteException
	{
		Tree tree=null;
		tree=client.getParentHierarchy(identifier);
		return tree;
	}
	
	public Tree getChildHierarch(String identifier) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, RemoteException
	{
		Tree tree=null;
		tree=client.getChildHierarchy(identifier);
		return tree;
	}
	
	public boolean validateIdentifier(String identifier) throws InvalidIdentifierFault, InvalidIdentifierValuesFault, NamingAuthorityConfigurationFault, RemoteException
	{
		boolean flag=false;	
		flag=client.validateIdentifier(identifier);
		return flag;
	}
	
	
	
}
