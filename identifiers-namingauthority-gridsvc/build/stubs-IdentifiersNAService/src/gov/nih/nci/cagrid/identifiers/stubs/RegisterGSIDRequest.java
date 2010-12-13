/**
 * RegisterGSIDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class RegisterGSIDRequest  implements java.io.Serializable {
    private java.lang.String suggestedIdentifer;
    private java.lang.String[] parentIdentifiers;

    public RegisterGSIDRequest() {
    }

    public RegisterGSIDRequest(
           java.lang.String[] parentIdentifiers,
           java.lang.String suggestedIdentifer) {
           this.suggestedIdentifer = suggestedIdentifer;
           this.parentIdentifiers = parentIdentifiers;
    }


    /**
     * Gets the suggestedIdentifer value for this RegisterGSIDRequest.
     * 
     * @return suggestedIdentifer
     */
    public java.lang.String getSuggestedIdentifer() {
        return suggestedIdentifer;
    }


    /**
     * Sets the suggestedIdentifer value for this RegisterGSIDRequest.
     * 
     * @param suggestedIdentifer
     */
    public void setSuggestedIdentifer(java.lang.String suggestedIdentifer) {
        this.suggestedIdentifer = suggestedIdentifer;
    }


    /**
     * Gets the parentIdentifiers value for this RegisterGSIDRequest.
     * 
     * @return parentIdentifiers
     */
    public java.lang.String[] getParentIdentifiers() {
        return parentIdentifiers;
    }


    /**
     * Sets the parentIdentifiers value for this RegisterGSIDRequest.
     * 
     * @param parentIdentifiers
     */
    public void setParentIdentifiers(java.lang.String[] parentIdentifiers) {
        this.parentIdentifiers = parentIdentifiers;
    }

    public java.lang.String getParentIdentifiers(int i) {
        return this.parentIdentifiers[i];
    }

    public void setParentIdentifiers(int i, java.lang.String _value) {
        this.parentIdentifiers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterGSIDRequest)) return false;
        RegisterGSIDRequest other = (RegisterGSIDRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suggestedIdentifer==null && other.getSuggestedIdentifer()==null) || 
             (this.suggestedIdentifer!=null &&
              this.suggestedIdentifer.equals(other.getSuggestedIdentifer()))) &&
            ((this.parentIdentifiers==null && other.getParentIdentifiers()==null) || 
             (this.parentIdentifiers!=null &&
              java.util.Arrays.equals(this.parentIdentifiers, other.getParentIdentifiers())));
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
        if (getSuggestedIdentifer() != null) {
            _hashCode += getSuggestedIdentifer().hashCode();
        }
        if (getParentIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterGSIDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterGSIDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedIdentifer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "suggestedIdentifer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "parentIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
