/**
 * IdentifiersNAServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs.service;

public class IdentifiersNAServiceLocator extends org.apache.axis.client.Service implements gov.nih.nci.cagrid.identifiers.stubs.service.IdentifiersNAService {

    public IdentifiersNAServiceLocator() {
    }


    public IdentifiersNAServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IdentifiersNAServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IdentifiersNAServicePortTypePort
    private java.lang.String IdentifiersNAServicePortTypePort_address = "http://localhost:8080/wsrf/services/";

    public java.lang.String getIdentifiersNAServicePortTypePortAddress() {
        return IdentifiersNAServicePortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IdentifiersNAServicePortTypePortWSDDServiceName = "IdentifiersNAServicePortTypePort";

    public java.lang.String getIdentifiersNAServicePortTypePortWSDDServiceName() {
        return IdentifiersNAServicePortTypePortWSDDServiceName;
    }

    public void setIdentifiersNAServicePortTypePortWSDDServiceName(java.lang.String name) {
        IdentifiersNAServicePortTypePortWSDDServiceName = name;
    }

    public gov.nih.nci.cagrid.identifiers.stubs.IdentifiersNAServicePortType getIdentifiersNAServicePortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IdentifiersNAServicePortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIdentifiersNAServicePortTypePort(endpoint);
    }

    public gov.nih.nci.cagrid.identifiers.stubs.IdentifiersNAServicePortType getIdentifiersNAServicePortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.nih.nci.cagrid.identifiers.stubs.bindings.IdentifiersNAServicePortTypeSOAPBindingStub _stub = new gov.nih.nci.cagrid.identifiers.stubs.bindings.IdentifiersNAServicePortTypeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getIdentifiersNAServicePortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIdentifiersNAServicePortTypePortEndpointAddress(java.lang.String address) {
        IdentifiersNAServicePortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.nih.nci.cagrid.identifiers.stubs.IdentifiersNAServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.nih.nci.cagrid.identifiers.stubs.bindings.IdentifiersNAServicePortTypeSOAPBindingStub _stub = new gov.nih.nci.cagrid.identifiers.stubs.bindings.IdentifiersNAServicePortTypeSOAPBindingStub(new java.net.URL(IdentifiersNAServicePortTypePort_address), this);
                _stub.setPortName(getIdentifiersNAServicePortTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IdentifiersNAServicePortTypePort".equals(inputPortName)) {
            return getIdentifiersNAServicePortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/service", "IdentifiersNAService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService/service", "IdentifiersNAServicePortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("IdentifiersNAServicePortTypePort".equals(portName)) {
            setIdentifiersNAServicePortTypePortEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
