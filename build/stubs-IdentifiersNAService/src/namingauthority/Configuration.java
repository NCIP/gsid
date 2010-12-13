/**
 * Configuration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package namingauthority;

public class Configuration  implements java.io.Serializable {
    private java.lang.String naGridSvcURI;
    private java.lang.String naPrefixURI;
    private java.lang.String naBaseURI;

    public Configuration() {
    }

    public Configuration(
           java.lang.String naBaseURI,
           java.lang.String naGridSvcURI,
           java.lang.String naPrefixURI) {
           this.naGridSvcURI = naGridSvcURI;
           this.naPrefixURI = naPrefixURI;
           this.naBaseURI = naBaseURI;
    }


    /**
     * Gets the naGridSvcURI value for this Configuration.
     * 
     * @return naGridSvcURI
     */
    public java.lang.String getNaGridSvcURI() {
        return naGridSvcURI;
    }


    /**
     * Sets the naGridSvcURI value for this Configuration.
     * 
     * @param naGridSvcURI
     */
    public void setNaGridSvcURI(java.lang.String naGridSvcURI) {
        this.naGridSvcURI = naGridSvcURI;
    }


    /**
     * Gets the naPrefixURI value for this Configuration.
     * 
     * @return naPrefixURI
     */
    public java.lang.String getNaPrefixURI() {
        return naPrefixURI;
    }


    /**
     * Sets the naPrefixURI value for this Configuration.
     * 
     * @param naPrefixURI
     */
    public void setNaPrefixURI(java.lang.String naPrefixURI) {
        this.naPrefixURI = naPrefixURI;
    }


    /**
     * Gets the naBaseURI value for this Configuration.
     * 
     * @return naBaseURI
     */
    public java.lang.String getNaBaseURI() {
        return naBaseURI;
    }


    /**
     * Sets the naBaseURI value for this Configuration.
     * 
     * @param naBaseURI
     */
    public void setNaBaseURI(java.lang.String naBaseURI) {
        this.naBaseURI = naBaseURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Configuration)) return false;
        Configuration other = (Configuration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.naGridSvcURI==null && other.getNaGridSvcURI()==null) || 
             (this.naGridSvcURI!=null &&
              this.naGridSvcURI.equals(other.getNaGridSvcURI()))) &&
            ((this.naPrefixURI==null && other.getNaPrefixURI()==null) || 
             (this.naPrefixURI!=null &&
              this.naPrefixURI.equals(other.getNaPrefixURI()))) &&
            ((this.naBaseURI==null && other.getNaBaseURI()==null) || 
             (this.naBaseURI!=null &&
              this.naBaseURI.equals(other.getNaBaseURI())));
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
        if (getNaGridSvcURI() != null) {
            _hashCode += getNaGridSvcURI().hashCode();
        }
        if (getNaPrefixURI() != null) {
            _hashCode += getNaPrefixURI().hashCode();
        }
        if (getNaBaseURI() != null) {
            _hashCode += getNaBaseURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Configuration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Configuration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naGridSvcURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "naGridSvcURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naPrefixURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "naPrefixURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naBaseURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "naBaseURI"));
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
