/**
 * IdentifiersNAServicePortTypeSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs.bindings;

public class IdentifiersNAServicePortTypeSOAPBindingStub extends org.apache.axis.client.Stub implements gov.nih.nci.cagrid.identifiers.stubs.IdentifiersNAServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[17];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createIdentifier");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "CreateIdentifierRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateIdentifierRequest"), gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateIdentifierResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "CreateIdentifierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resolveIdentifier");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "ResolveIdentifierRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ResolveIdentifierRequest"), gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ResolveIdentifierResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "ResolveIdentifierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteKeys");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "DeleteKeysRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">DeleteKeysRequest"), gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">DeleteKeysResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "DeleteKeysResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createKeys");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "CreateKeysRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateKeysRequest"), gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateKeysResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "CreateKeysResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("replaceKeyValues");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "ReplaceKeyValuesRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ReplaceKeyValuesRequest"), gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ReplaceKeyValuesResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "ReplaceKeyValuesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKeyNames");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetKeyNamesRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyNamesRequest"), gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyNamesResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetKeyNamesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKeyData");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetKeyDataRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyDataRequest"), gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyDataResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetKeyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerGSID");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "RegisterGSIDRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterGSIDRequest"), gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterGSIDResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "RegisterGSIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSite");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "AddSiteRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">AddSiteRequest"), gov.nih.nci.cagrid.identifiers.stubs.AddSiteRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">AddSiteResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "AddSiteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateIdentifiers");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GenerateIdentifiersRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GenerateIdentifiersRequest"), gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GenerateIdentifiersResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GenerateIdentifiersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParentHierarchy");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetParentHierarchyRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetParentHierarchyRequest"), gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetParentHierarchyResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetParentHierarchyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildHierarchy");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetChildHierarchyRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetChildHierarchyRequest"), gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetChildHierarchyResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "GetChildHierarchyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerSite");
        oper.addParameter(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "RegisterSiteRequest"), new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterSiteRequest"), gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterSiteResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "RegisterSiteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"),
                      "gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault",
                      new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMultipleResourceProperties");
        oper.addParameter(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "GetMultipleResourceProperties"), new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetMultipleResourceProperties"), org.oasis.wsrf.properties.GetMultipleResourceProperties_Element.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetMultipleResourcePropertiesResponse"));
        oper.setReturnClass(org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "GetMultipleResourcePropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFault"),
                      "org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFault"),
                      "org.oasis.wsrf.properties.ResourceUnknownFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFaultType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResourceProperty");
        oper.addParameter(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "GetResourceProperty"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetResourcePropertyResponse"));
        oper.setReturnClass(org.oasis.wsrf.properties.GetResourcePropertyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "GetResourcePropertyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFault"),
                      "org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFault"),
                      "org.oasis.wsrf.properties.ResourceUnknownFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFaultType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryResourceProperties");
        oper.addParameter(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryResourceProperties"), new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">QueryResourceProperties"), org.oasis.wsrf.properties.QueryResourceProperties_Element.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">QueryResourcePropertiesResponse"));
        oper.setReturnClass(org.oasis.wsrf.properties.QueryResourcePropertiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryResourcePropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "UnknownQueryExpressionDialectFault"),
                      "org.oasis.wsrf.properties.UnknownQueryExpressionDialectFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "UnknownQueryExpressionDialectFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryEvaluationErrorFault"),
                      "org.oasis.wsrf.properties.QueryEvaluationErrorFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryEvaluationErrorFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidQueryExpressionFault"),
                      "org.oasis.wsrf.properties.InvalidQueryExpressionFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidQueryExpressionFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFault"),
                      "org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFault"),
                      "org.oasis.wsrf.properties.ResourceUnknownFaultType",
                      new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFaultType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceSecurityMetadata");
        oper.addParameter(new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", "GetServiceSecurityMetadataRequest"), new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", ">GetServiceSecurityMetadataRequest"), gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", ">GetServiceSecurityMetadataResponse"));
        oper.setReturnClass(gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", "GetServiceSecurityMetadataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

    }

    public IdentifiersNAServicePortTypeSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IdentifiersNAServicePortTypeSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IdentifiersNAServicePortTypeSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">ResourcePropertyValueChangeNotificationType>OldValue");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.ResourcePropertyValueChangeNotificationTypeOldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ResolveIdentifierResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">SetResourcePropertiesResponse");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.SetResourcePropertiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ReplaceKeyValuesRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "ContextProperty");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ContextProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateIdentifierRequest>identifierData");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequestIdentifierData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateKeysRequest>identifierData");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifierData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidSetResourcePropertiesRequestContentFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.InvalidSetResourcePropertiesRequestContentFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">Operation>inputParameterCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.OperationInputParameterCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyNamesResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierValuesFault");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryEvaluationErrorFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.QueryEvaluationErrorFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterGSIDRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Configuration");
            cachedSerQNames.add(qName);
            cls = namingauthority.Configuration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "ServiceContext");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ServiceContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateIdentifierRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "ServiceSecurityMetadata");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.ServiceSecurityMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">SetResourceProperties");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.SetResourceProperties_Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ResolveIdentifierRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-BaseFaults-1.2-draft-01.xsd", ">BaseFaultType>Description");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.faults.BaseFaultTypeDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryExpressionType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.QueryExpressionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "InvalidIdentifierFault");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata", "ServiceMetadata");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.ServiceMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">ServiceContext>contextPropertyCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ServiceContextContextPropertyCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "UnknownQueryExpressionDialectFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.UnknownQueryExpressionDialectFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "protectionLevelType");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.ProtectionLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">IdentifiersNAServiceResourceProperties");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.IdentifiersNAServiceResourceProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyNamesRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "EndpointReferenceType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.EndpointReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "UnableToModifyResourcePropertyFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.UnableToModifyResourcePropertyFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterSiteRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", ">ServiceSecurityMetadata>operations");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.ServiceSecurityMetadataOperations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "ReplyAfterType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.ReplyAfterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyDataRequest>keyName");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestKeyName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetMultipleResourceProperties");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.GetMultipleResourceProperties_Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "Fault");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.Fault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InsertType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.InsertType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">Operation>faultCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.OperationFaultCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "AttributedURI");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.AttributedURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "ReferencePropertiesType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.ReferencePropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata", ">ServiceMetadata>serviceDescription");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.ServiceMetadataServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidQueryExpressionFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.InvalidQueryExpressionFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterGSIDResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "Output");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">QueryResourceProperties");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.QueryResourceProperties_Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "IdentifierValues");
            cachedSerQNames.add(qName);
            cls = namingauthority.IdentifierValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "GSITransport");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.GSITransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">Service>pointOfContactCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ServicePointOfContactCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "SetResourcePropertyRequestFailedFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.SetResourcePropertyRequestFailedFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetResourcePropertyResponse");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.GetResourcePropertyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "UpdateType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.UpdateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>ReplaceKeyValuesRequest>identifierValues");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifierValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthorityConfigurationFault");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", ">ResearchCenter>pointOfContactCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.ResearchCenterPointOfContactCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyDataRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetChildHierarchyResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyDataRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>ResolveIdentifierRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "SemanticMetadata");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.SemanticMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterSiteResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "Address");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GenerateIdentifiersRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "AttributedQName");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.AttributedQName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">AddSiteResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "FaultSubcodeValues");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.FaultSubcodeValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", ">IdentifiersNAServiceReference");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.types.IdentifiersNAServiceReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "DeleteType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.DeleteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "Relationship");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.Relationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "RelationshipTypeValues");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.RelationshipTypeValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>DeleteKeysRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameValues");
            cachedSerQNames.add(qName);
            cls = namingauthority.KeyNameValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ReplaceKeyValuesResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "ResearchCenterDescription");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.ResearchCenterDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">DeleteKeysResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-BaseFaults-1.2-draft-01.xsd", ">BaseFaultType>ErrorCode");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.faults.BaseFaultTypeErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateKeysRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "GSISecureConversation");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.GSISecureConversation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "InvalidResourcePropertyQNameFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "None");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.None.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", ">ServiceSecurityResourceProperties");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.introduce.security.stubs.ServiceSecurityResourceProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", ">UMLClass>umlAttributeCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.UMLClassUmlAttributeCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "InputParameter");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.InputParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "PointOfContact");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.PointOfContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", ">ValueDomain>enumerationCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.ValueDomainEnumerationCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">ResourcePropertyValueChangeNotificationType>NewValue");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.ResourcePropertyValueChangeNotificationTypeNewValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyNamesRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetParentHierarchyResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "IdentifierData");
            cachedSerQNames.add(qName);
            cls = namingauthority.IdentifierData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", ">GetServiceSecurityMetadataRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "CommunicationStyle");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.CommunicationStyle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree");
            cachedSerQNames.add(qName);
            cls = namingauthority.Tree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "Enumeration");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.Enumeration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "ServiceNameType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.message.addressing.ServiceNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateIdentifierResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GenerateIdentifiersResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "GSISecureMessage");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.GSISecureMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">ServiceContext>operationCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ServiceContextOperationCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateKeysRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateKeysResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-BaseFaults-1.2-draft-01.xsd", "BaseFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.faults.BaseFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", ">Service>serviceContextCollection");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.ServiceServiceContextCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "ValueDomain");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.ValueDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetChildHierarchyRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">GetMultipleResourcePropertiesResponse");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "CaDSRRegistration");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.CaDSRRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourcePropertyValueChangeNotificationType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.ResourcePropertyValueChangeNotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "UMLAttribute");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.UMLAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "UMLClass");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.UMLClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyValues");
            cachedSerQNames.add(qName);
            cls = namingauthority.KeyValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameData");
            cachedSerQNames.add(qName);
            cls = namingauthority.KeyNameData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "CommunicationMechanism");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.CommunicationMechanism.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata", ">ServiceMetadata>hostingResearchCenter");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.ServiceMetadataHostingResearchCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetParentHierarchyRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "Operation");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.common", "ResearchCenter");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.common.ResearchCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.service", "Service");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.service.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourceUnknownFaultType");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.ResourceUnknownFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", ">QueryResourcePropertiesResponse");
            cachedSerQNames.add(qName);
            cls = org.oasis.wsrf.properties.QueryResourcePropertiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity", ">GetServiceSecurityMetadataResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">AddSiteRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.AddSiteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>ReplaceKeyValuesRequest>identifier");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyDataResponse");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>DeleteKeysRequest>keyNames");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestKeyNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/types", "NamingAuthoritySecurityFault");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">DeleteKeysRequest");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyData");
            cachedSerQNames.add(qName);
            cls = namingauthority.KeyData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("gme://caGrid.caBIG/1.0/gov.nih.nci.cagrid.metadata.security", "Operation");
            cachedSerQNames.add(qName);
            cls = gov.nih.nci.cagrid.metadata.security.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call =
                    (org.apache.axis.client.Call) super.service.createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse createIdentifier(gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/CreateIdentifierRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createIdentifier"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse resolveIdentifier(gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/ResolveIdentifierRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resolveIdentifier"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.ResolveIdentifierResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse deleteKeys(gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/DeleteKeysRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteKeys"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse createKeys(gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/CreateKeysRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createKeys"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.CreateKeysResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse replaceKeyValues(gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/ReplaceKeyValuesRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "replaceKeyValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse getKeyNames(gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/GetKeyNamesRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getKeyNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse getKeyData(gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/GetKeyDataRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getKeyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse registerGSID(gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/RegisterGSIDRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "registerGSID"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.RegisterGSIDResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse addSite(gov.nih.nci.cagrid.identifiers.stubs.AddSiteRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/AddSiteRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addSite"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.AddSiteResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse generateIdentifiers(gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/GenerateIdentifiersRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateIdentifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.GenerateIdentifiersResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse getParentHierarchy(gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/GetParentHierarchyRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getParentHierarchy"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.GetParentHierarchyResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse getChildHierarchy(gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/GetChildHierarchyRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getChildHierarchy"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.GetChildHierarchyResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse registerSite(gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteRequest parameters) throws java.rmi.RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/RegisterSiteRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "registerSite"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.identifiers.stubs.RegisterSiteResponse.class);
            }
        }
    }

    public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element getMultipleResourcePropertiesRequest) throws java.rmi.RemoteException, org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType, org.oasis.wsrf.properties.ResourceUnknownFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties/GetMultipleResourceProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMultipleResourceProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMultipleResourcePropertiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse.class);
            }
        }
    }

    public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName getResourcePropertyRequest) throws java.rmi.RemoteException, org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType, org.oasis.wsrf.properties.ResourceUnknownFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties/GetResourceProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetResourceProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getResourcePropertyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.oasis.wsrf.properties.GetResourcePropertyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.oasis.wsrf.properties.GetResourcePropertyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.oasis.wsrf.properties.GetResourcePropertyResponse.class);
            }
        }
    }

    public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element queryResourcePropertiesRequest) throws java.rmi.RemoteException, org.oasis.wsrf.properties.UnknownQueryExpressionDialectFaultType, org.oasis.wsrf.properties.QueryEvaluationErrorFaultType, org.oasis.wsrf.properties.InvalidQueryExpressionFaultType, org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType, org.oasis.wsrf.properties.ResourceUnknownFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties/QueryResourceProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryResourceProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryResourcePropertiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.oasis.wsrf.properties.QueryResourcePropertiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.oasis.wsrf.properties.QueryResourcePropertiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.oasis.wsrf.properties.QueryResourcePropertiesResponse.class);
            }
        }
    }

    public gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse getServiceSecurityMetadata(gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://security.introduce.cagrid.nci.nih.gov/ServiceSecurity/GetServiceSecurityMetadataRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServiceSecurityMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.nci.cagrid.introduce.security.stubs.GetServiceSecurityMetadataResponse.class);
            }
        }
    }

}
