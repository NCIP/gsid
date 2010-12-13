/**
 * GetKeyDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class GetKeyDataRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestIdentifier identifier;
    private gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestKeyName keyName;

    public GetKeyDataRequest() {
    }

    public GetKeyDataRequest(
           gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestIdentifier identifier,
           gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestKeyName keyName) {
           this.identifier = identifier;
           this.keyName = keyName;
    }


    /**
     * Gets the identifier value for this GetKeyDataRequest.
     * 
     * @return identifier
     */
    public gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this GetKeyDataRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the keyName value for this GetKeyDataRequest.
     * 
     * @return keyName
     */
    public gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestKeyName getKeyName() {
        return keyName;
    }


    /**
     * Sets the keyName value for this GetKeyDataRequest.
     * 
     * @param keyName
     */
    public void setKeyName(gov.nih.nci.cagrid.identifiers.stubs.GetKeyDataRequestKeyName keyName) {
        this.keyName = keyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeyDataRequest)) return false;
        GetKeyDataRequest other = (GetKeyDataRequest) obj;
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
            ((this.keyName==null && other.getKeyName()==null) || 
             (this.keyName!=null &&
              this.keyName.equals(other.getKeyName())));
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
        if (getKeyName() != null) {
            _hashCode += getKeyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKeyDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyDataRequest>identifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "keyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyDataRequest>keyName"));
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
