/**
 * CreateIdentifierRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class CreateIdentifierRequest  implements java.io.Serializable {
    private gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequestIdentifierData identifierData;

    public CreateIdentifierRequest() {
    }

    public CreateIdentifierRequest(
           gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequestIdentifierData identifierData) {
           this.identifierData = identifierData;
    }


    /**
     * Gets the identifierData value for this CreateIdentifierRequest.
     * 
     * @return identifierData
     */
    public gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequestIdentifierData getIdentifierData() {
        return identifierData;
    }


    /**
     * Sets the identifierData value for this CreateIdentifierRequest.
     * 
     * @param identifierData
     */
    public void setIdentifierData(gov.nih.nci.cagrid.identifiers.stubs.CreateIdentifierRequestIdentifierData identifierData) {
        this.identifierData = identifierData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateIdentifierRequest)) return false;
        CreateIdentifierRequest other = (CreateIdentifierRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getIdentifierData() != null) {
            _hashCode += getIdentifierData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateIdentifierRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">CreateIdentifierRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "identifierData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">>CreateIdentifierRequest>identifierData"));
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
