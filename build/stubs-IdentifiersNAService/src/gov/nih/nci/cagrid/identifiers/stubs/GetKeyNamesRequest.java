/**
 * GetKeyNamesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class GetKeyNamesRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequestIdentifier identifier;

    public GetKeyNamesRequest() {
    }

    public GetKeyNamesRequest(
           gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequestIdentifier identifier) {
           this.identifier = identifier;
    }


    /**
     * Gets the identifier value for this GetKeyNamesRequest.
     * 
     * @return identifier
     */
    public gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequestIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this GetKeyNamesRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(gov.nih.nci.cagrid.identifiers.stubs.GetKeyNamesRequestIdentifier identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKeyNamesRequest)) return false;
        GetKeyNamesRequest other = (GetKeyNamesRequest) obj;
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
              this.identifier.equals(other.getIdentifier())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKeyNamesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetKeyNamesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>GetKeyNamesRequest>identifier"));
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
