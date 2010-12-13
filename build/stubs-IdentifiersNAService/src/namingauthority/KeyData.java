/**
 * KeyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package namingauthority;

public class KeyData  extends namingauthority.KeyValues  implements java.io.Serializable {
    private org.apache.axis.types.URI policyIdentifier;

    public KeyData() {
    }

    public KeyData(
           org.apache.axis.types.URI policyIdentifier) {
           this.policyIdentifier = policyIdentifier;
    }


    /**
     * Gets the policyIdentifier value for this KeyData.
     * 
     * @return policyIdentifier
     */
    public org.apache.axis.types.URI getPolicyIdentifier() {
        return policyIdentifier;
    }


    /**
     * Sets the policyIdentifier value for this KeyData.
     * 
     * @param policyIdentifier
     */
    public void setPolicyIdentifier(org.apache.axis.types.URI policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyData)) return false;
        KeyData other = (KeyData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policyIdentifier==null && other.getPolicyIdentifier()==null) || 
             (this.policyIdentifier!=null &&
              this.policyIdentifier.equals(other.getPolicyIdentifier())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPolicyIdentifier() != null) {
            _hashCode += getPolicyIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "KeyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "PolicyIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
