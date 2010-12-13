/**
 * ReplaceKeyValuesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class ReplaceKeyValuesRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifier identifier;
    private gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifierValues identifierValues;

    public ReplaceKeyValuesRequest() {
    }

    public ReplaceKeyValuesRequest(
           gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifier identifier,
           gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifierValues identifierValues) {
           this.identifier = identifier;
           this.identifierValues = identifierValues;
    }


    /**
     * Gets the identifier value for this ReplaceKeyValuesRequest.
     * 
     * @return identifier
     */
    public gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this ReplaceKeyValuesRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the identifierValues value for this ReplaceKeyValuesRequest.
     * 
     * @return identifierValues
     */
    public gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifierValues getIdentifierValues() {
        return identifierValues;
    }


    /**
     * Sets the identifierValues value for this ReplaceKeyValuesRequest.
     * 
     * @param identifierValues
     */
    public void setIdentifierValues(gov.nih.nci.cagrid.identifiers.stubs.ReplaceKeyValuesRequestIdentifierValues identifierValues) {
        this.identifierValues = identifierValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplaceKeyValuesRequest)) return false;
        ReplaceKeyValuesRequest other = (ReplaceKeyValuesRequest) obj;
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
            ((this.identifierValues==null && other.getIdentifierValues()==null) || 
             (this.identifierValues!=null &&
              this.identifierValues.equals(other.getIdentifierValues())));
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
        if (getIdentifierValues() != null) {
            _hashCode += getIdentifierValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplaceKeyValuesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">ReplaceKeyValuesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>ReplaceKeyValuesRequest>identifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifierValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>ReplaceKeyValuesRequest>identifierValues"));
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
