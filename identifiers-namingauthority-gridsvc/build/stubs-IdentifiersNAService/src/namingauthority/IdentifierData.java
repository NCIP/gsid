/**
 * IdentifierData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package namingauthority;

public class IdentifierData  implements java.io.Serializable {
    private namingauthority.KeyNameData[] keyNameData;

    public IdentifierData() {
    }

    public IdentifierData(
           namingauthority.KeyNameData[] keyNameData) {
           this.keyNameData = keyNameData;
    }


    /**
     * Gets the keyNameData value for this IdentifierData.
     * 
     * @return keyNameData
     */
    public namingauthority.KeyNameData[] getKeyNameData() {
        return keyNameData;
    }


    /**
     * Sets the keyNameData value for this IdentifierData.
     * 
     * @param keyNameData
     */
    public void setKeyNameData(namingauthority.KeyNameData[] keyNameData) {
        this.keyNameData = keyNameData;
    }

    public namingauthority.KeyNameData getKeyNameData(int i) {
        return this.keyNameData[i];
    }

    public void setKeyNameData(int i, namingauthority.KeyNameData _value) {
        this.keyNameData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentifierData)) return false;
        IdentifierData other = (IdentifierData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyNameData==null && other.getKeyNameData()==null) || 
             (this.keyNameData!=null &&
              java.util.Arrays.equals(this.keyNameData, other.getKeyNameData())));
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
        if (getKeyNameData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyNameData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyNameData(), i);
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
        new org.apache.axis.description.TypeDesc(IdentifierData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "IdentifierData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyNameData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyNameData"));
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
