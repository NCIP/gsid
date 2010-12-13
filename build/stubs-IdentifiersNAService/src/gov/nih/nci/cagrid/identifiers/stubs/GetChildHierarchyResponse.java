/**
 * GetChildHierarchyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.identifiers.stubs;

public class GetChildHierarchyResponse  implements java.io.Serializable {
    private namingauthority.Tree tree;

    public GetChildHierarchyResponse() {
    }

    public GetChildHierarchyResponse(
           namingauthority.Tree tree) {
           this.tree = tree;
    }


    /**
     * Gets the tree value for this GetChildHierarchyResponse.
     * 
     * @return tree
     */
    public namingauthority.Tree getTree() {
        return tree;
    }


    /**
     * Sets the tree value for this GetChildHierarchyResponse.
     * 
     * @param tree
     */
    public void setTree(namingauthority.Tree tree) {
        this.tree = tree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChildHierarchyResponse)) return false;
        GetChildHierarchyResponse other = (GetChildHierarchyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tree==null && other.getTree()==null) || 
             (this.tree!=null &&
              this.tree.equals(other.getTree())));
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
        if (getTree() != null) {
            _hashCode += getTree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChildHierarchyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://identifiers.cagrid.nci.nih.gov/IdentifiersNAService", ">GetChildHierarchyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree"));
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
