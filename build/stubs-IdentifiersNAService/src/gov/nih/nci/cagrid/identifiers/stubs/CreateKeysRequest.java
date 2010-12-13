/**
 * CreateKeysRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class CreateKeysRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifier identifier;
    private gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifierData identifierData;

    public CreateKeysRequest() {
    }

    public CreateKeysRequest(
           gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifier identifier,
           gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifierData identifierData) {
           this.identifier = identifier;
           this.identifierData = identifierData;
    }


    /**
     * Gets the identifier value for this CreateKeysRequest.
     * 
     * @return identifier
     */
    public gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CreateKeysRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the identifierData value for this CreateKeysRequest.
     * 
     * @return identifierData
     */
    public gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifierData getIdentifierData() {
        return identifierData;
    }


    /**
     * Sets the identifierData value for this CreateKeysRequest.
     * 
     * @param identifierData
     */
    public void setIdentifierData(gov.nih.nci.cagrid.identifiers.stubs.CreateKeysRequestIdentifierData identifierData) {
        this.identifierData = identifierData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateKeysRequest)) return false;
        CreateKeysRequest other = (CreateKeysRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.identifierData==null && other.getIdentifierData()==null) || 
             (this.identifierData!=null &&
              this.identifierData.equals(other.getIdentifierData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getIdentifierData() != null) {
            _hashCode += getIdentifierData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateKeysRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateKeysRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateKeysRequest>identifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifierData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateKeysRequest>identifierData"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
