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
	
	public static String registerGSID(IdentifiersNAServiceClient client,String suggestedIdentifier,String[] parentIdentifiers) throws NamingAuthorityConfigurationFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{
		String identifier=null;
		identifier=client.registerGSID(suggestedIdentifier, parentIdentifiers);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return identifier;
	}
	
	public static void addSite(IdentifiersNAServiceClient client,String identifier) throws NamingAuthorityConfigurationFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{
		
		client.addSite(identifier);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static String[] createBatchIdentifiers(IdentifiersNAServiceClient client,int numOfIdentifiers) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, RemoteException
	{
		String[] temp=null;
		temp=client.generateIdentifiers(numOfIdentifiers);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return temp;
	}
	
	public static IdentifierData resolveIdentifier(IdentifiersNAServiceClient client,String identifier) throws NamingAuthorityConfigurationFault, InvalidIdentifierFault, NamingAuthoritySecurityFault, RemoteException
	{
		IdentifierData temp=client.resolveIdentifier(identifier);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return temp;		
	}
	
	public static Tree getParentHierarch(IdentifiersNAServiceClient client,String identifier) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, RemoteException
	{
		Tree tree=null;
		tree=client.getParentHierarchy(identifier);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return tree;
	}
	
	public static Tree getChildHierarch(IdentifiersNAServiceClient client,String identifier) throws NamingAuthorityConfigurationFault, NamingAuthoritySecurityFault, InvalidIdentifierValuesFault, InvalidIdentifierFault, RemoteException
	{
		Tree tree=null;
		tree=client.getChildHierarchy(identifier);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return tree;
	}
	
	public static boolean validateIdentifier(IdentifiersNAServiceClient client,String identifier)
	{
		boolean flag=false;	
		flag=validateIdentifier(client, identifier);
//		try
//		{
//			Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return flag;
	}
	
	
	
}
