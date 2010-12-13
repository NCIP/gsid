/**
 * IdentifierValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package namingauthority;

public class IdentifierValues  implements java.io.Serializable {
    private namingauthority.KeyNameValues[] keyNameValues;

    public IdentifierValues() {
    }

    public IdentifierValues(
           namingauthority.KeyNameValues[] keyNameValues) {
           this.keyNameValues = keyNameValues;
    }


    /**
     * Gets the keyNameValues value for this IdentifierValues.
     * 
     * @return keyNameValues
     */
    public namingauthority.KeyNameValues[] getKeyNameValues() {
        return keyNameValues;
    }


    /**
     * Sets the keyNameValues value for this IdentifierValues.
     * 
     * @param keyNameValues
     */
    public void setKeyNameValues(namingauthority.KeyNameValues[] keyNameValues) {
        this.keyNameValues = keyNameValues;
    }

    public namingauthority.KeyNameValues getKeyNameValues(int i) {
        return this.keyNameValues[i];
    }

    public void setKeyNameValues(int i, namingauthority.KeyNameValues _value) {
        this.keyNameValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentifierValues)) return false;
        IdentifierValues other = (IdentifierValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyNameValues==null && other.getKeyNameValues()==null) || 
             (this.keyNameValues!=null &&
              java.util.Arrays.equals(this.keyNameValues, other.getKeyNameValues())));
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
        if (getKeyNameValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyNameValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyNameValues(), i);
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
        new org.apache.axis.description.TypeDesc(IdentifierValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "IdentifierValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyNameValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameValues"));
        elemField.setMinOccurs(0);
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
