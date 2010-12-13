/**
 * RegisterSiteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class RegisterSiteRequest  implements java.io.Serializable {
    private java.lang.String application;
    private java.lang.String applicationURL;
    private java.lang.String applicationVersion;
    private java.lang.String contactName;
    private java.lang.String contactEmail;
    private java.lang.String contactPhone;
    private java.lang.String organization;

    public RegisterSiteRequest() {
    }

    public RegisterSiteRequest(
           java.lang.String application,
           java.lang.String applicationURL,
           java.lang.String applicationVersion,
           java.lang.String contactEmail,
           java.lang.String contactName,
           java.lang.String contactPhone,
           java.lang.String organization) {
           this.application = application;
           this.applicationURL = applicationURL;
           this.applicationVersion = applicationVersion;
           this.contactName = contactName;
           this.contactEmail = contactEmail;
           this.contactPhone = contactPhone;
           this.organization = organization;
    }


    /**
     * Gets the application value for this RegisterSiteRequest.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this RegisterSiteRequest.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the applicationURL value for this RegisterSiteRequest.
     * 
     * @return applicationURL
     */
    public java.lang.String getApplicationURL() {
        return applicationURL;
    }


    /**
     * Sets the applicationURL value for this RegisterSiteRequest.
     * 
     * @param applicationURL
     */
    public void setApplicationURL(java.lang.String applicationURL) {
        this.applicationURL = applicationURL;
    }


    /**
     * Gets the applicationVersion value for this RegisterSiteRequest.
     * 
     * @return applicationVersion
     */
    public java.lang.String getApplicationVersion() {
        return applicationVersion;
    }


    /**
     * Sets the applicationVersion value for this RegisterSiteRequest.
     * 
     * @param applicationVersion
     */
    public void setApplicationVersion(java.lang.String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }


    /**
     * Gets the contactName value for this RegisterSiteRequest.
     * 
     * @return contactName
     */
    public java.lang.String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this RegisterSiteRequest.
     * 
     * @param contactName
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contactEmail value for this RegisterSiteRequest.
     * 
     * @return contactEmail
     */
    public java.lang.String getContactEmail() {
        return contactEmail;
    }


    /**
     * Sets the contactEmail value for this RegisterSiteRequest.
     * 
     * @param contactEmail
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }


    /**
     * Gets the contactPhone value for this RegisterSiteRequest.
     * 
     * @return contactPhone
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this RegisterSiteRequest.
     * 
     * @param contactPhone
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the organization value for this RegisterSiteRequest.
     * 
     * @return organization
     */
    public java.lang.String getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this RegisterSiteRequest.
     * 
     * @param organization
     */
    public void setOrganization(java.lang.String organization) {
        this.organization = organization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSiteRequest)) return false;
        RegisterSiteRequest other = (RegisterSiteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.applicationURL==null && other.getApplicationURL()==null) || 
             (this.applicationURL!=null &&
              this.applicationURL.equals(other.getApplicationURL()))) &&
            ((this.applicationVersion==null && other.getApplicationVersion()==null) || 
             (this.applicationVersion!=null &&
              this.applicationVersion.equals(other.getApplicationVersion()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contactEmail==null && other.getContactEmail()==null) || 
             (this.contactEmail!=null &&
              this.contactEmail.equals(other.getContactEmail()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization())));
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
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getApplicationURL() != null) {
            _hashCode += getApplicationURL().hashCode();
        }
        if (getApplicationVersion() != null) {
            _hashCode += getApplicationVersion().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContactEmail() != null) {
            _hashCode += getContactEmail().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSiteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">RegisterSiteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "applicationURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "applicationVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "contactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "contactEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "contactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", "organization"));
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
