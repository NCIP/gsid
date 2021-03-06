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
import java.net.URISyntaxException;

import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.impl.NamingAuthorityImpl;
import org.cagrid.identifiers.namingauthority.test.SpringTestApplicationContextConstants;
import org.cagrid.identifiers.namingauthority.util.Tree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class TestUtil
{
	 MaintainerNamingAuthority NamingAuthority=null;
	public TestUtil()
	{
		ApplicationContext context=new FileSystemXmlApplicationContext(new String[]{SpringTestApplicationContextConstants.NA_BASE_LOCATION,
                SpringTestApplicationContextConstants.TEST_BASE_LOCATION});
		NamingAuthority=(MaintainerNamingAuthority)context.getBean("NamingAuthority", NamingAuthorityImpl.class);
	}
	
	public TestUtil( MaintainerNamingAuthority NamingAuthority)
	{		
		this.NamingAuthority=NamingAuthority;
	}
	
	public String registerGSID(SecurityInfo client,String suggestedIdentifier,String[] parentIdentifiers) throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException, NamingAuthoritySecurityException 
	{
		String identifier=null;
		identifier=this.NamingAuthority.registerGSID(client,suggestedIdentifier, parentIdentifiers);
		return identifier;
	}
	
	public void addSite(SecurityInfo client,String identifier) throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException, NamingAuthoritySecurityException
	{		
		this.NamingAuthority.addSite(client,identifier);
	}
	
	public  String[] createBatchIdentifiers(SecurityInfo client,int numOfIdentifiers) throws NamingAuthorityConfigurationException, InvalidIdentifierValuesException, InvalidIdentifierException, NamingAuthoritySecurityException 
	{
		String[] temp=null;
		temp=this.NamingAuthority.createBatchIdentifiers(client,numOfIdentifiers);		
		return temp;
	}
	
	public IdentifierData resolveIdentifier(SecurityInfo client,String identifier) throws InvalidIdentifierException, NamingAuthorityConfigurationException, NamingAuthoritySecurityException, URISyntaxException 
	{
		IdentifierData temp=this.NamingAuthority.resolveIdentifier(client,new URI(identifier));
		return temp;		
	}
	
	public Tree getParentHierarch(SecurityInfo client,String identifier) throws InvalidIdentifierException, NamingAuthoritySecurityException, NamingAuthorityConfigurationException
	{
		Tree tree=null;
		tree=this.NamingAuthority.getParentHierarchy(client,identifier);
		return tree;
	}
	
	public Tree getChildHierarch(SecurityInfo client,String identifier) throws InvalidIdentifierException, NamingAuthoritySecurityException, InvalidIdentifierValuesException, NamingAuthorityConfigurationException 
	{
		Tree tree=null;
		tree=this.NamingAuthority.getChildHierarchy(client,identifier);
		return tree;
	}
	
	public boolean validateIdentifier(SecurityInfo client,String identifier) throws InvalidIdentifierException, NamingAuthoritySecurityException, NamingAuthorityConfigurationException
	{
		boolean flag=false;	
		flag=this.NamingAuthority.validateIdentifier(client, identifier);
		return flag;
	}
	
	
	
}
