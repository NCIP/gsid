/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package gov.nih.nci.cagrid.identifiers.service.globus;

import gov.nih.nci.cagrid.identifiers.service.IdentifiersNAServiceImpl;

import java.rmi.RemoteException;

/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * This class implements each method in the portType of the service.  Each method call represented
 * in the port type will be then mapped into the unwrapped implementation which the user provides
 * in the IdentifiersNAServiceImpl class.  This class handles the boxing and unboxing of each method call
 * so that it can be correclty mapped in the unboxed interface that the developer has designed and 
 * has implemented.  Authorization callbacks are automatically made for each method based
 * on each methods authorization requirements.
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public class IdentifiersNAServiceProviderImpl{
	
	IdentifiersNAServiceImpl impl;
	
	public IdentifiersNAServiceProviderImpl() throws RemoteException {
		impl = new IdentifiersNAServiceImpl();
	}
	

    public gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse resolveIdentifier(gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse();
    boxedResult.setIdentifierData(impl.resolveIdentifier(params.getIdentifier()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse registerGSID(gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse();
    boxedResult.setResponse(impl.registerGSID(params.getSuggestedIdentifier(),params.getParentIdentifiers()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse addSite(gov.nih.nci.cagrid.identifiers.stubs.AddSiteRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse();
    boxedResult.setIdentifier(impl.addSite(params.getIdentifier()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse generateIdentifiers(gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse();
    boxedResult.setResponse(impl.generateIdentifiers(params.getNumOfIdentifiers()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse getParentHierarchy(gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault {
    gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse();
    boxedResult.setTree(impl.getParentHierarchy(params.getIdentifier()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse getChildHierarchy(gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse();
    boxedResult.setTree(impl.getChildHierarchy(params.getIdentifier()));
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse registerSite(gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
    gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse();
    impl.registerSite(params.getApplication(),params.getApplicationURL(),params.getApplicationVersion(),params.getContactName(),params.getContactEmail(),params.getContactPhone(),params.getOrganization());
    return boxedResult;
  }

    public gov.nih.nci.cagrid.identifiers.stubs.ValidateIdentifierResponse validateIdentifier(gov.nih.nci.cagrid.identifiers.stubs.ValidateIdentifierRequest params) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault {
    gov.nih.nci.cagrid.identifiers.stubs.ValidateIdentifierResponse boxedResult = new gov.nih.nci.cagrid.identifiers.stubs.ValidateIdentifierResponse();
    boxedResult.setResponse(impl.validateIdentifier(params.getIdentifier()));
    return boxedResult;
  }

}
