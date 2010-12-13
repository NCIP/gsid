/**
 * DeleteKeysRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class DeleteKeysRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestIdentifier identifier;
    private gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestKeyNames keyNames;

    public DeleteKeysRequest() {
    }

    public DeleteKeysRequest(
           gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestIdentifier identifier,
           gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestKeyNames keyNames) {
           this.identifier = identifier;
           this.keyNames = keyNames;
    }


    /**
     * Gets the identifier value for this DeleteKeysRequest.
     * 
     * @return identifier
     */
    public gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this DeleteKeysRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the keyNames value for this DeleteKeysRequest.
     * 
     * @return keyNames
     */
    public gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestKeyNames getKeyNames() {
        return keyNames;
    }


    /**
     * Sets the keyNames value for this DeleteKeysRequest.
     * 
     * @param keyNames
     */
    public void setKeyNames(gov.nih.nci.cagrid.identifiers.stubs.DeleteKeysRequestKeyNames keyNames) {
        this.keyNames = keyNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteKeysRequest)) return false;
        DeleteKeysRequest other = (DeleteKeysRequest) obj;
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
            ((this.keyNames==null && other.getKeyNames()==null) || 
             (this.keyNames!=null &&
              this.keyNames.equals(other.getKeyNames())));
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
        if (getKeyNames() != null) {
            _hashCode += getKeyNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteKeysRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">DeleteKeysRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>DeleteKeysRequest>identifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "keyNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>DeleteKeysRequest>keyNames"));
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
