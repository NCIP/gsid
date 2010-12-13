/**
 * Tree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package namingauthority;

public class Tree  implements java.io.Serializable {
    private java.lang.String currentIdentifier;
    private namingauthority.Tree[] tree;

    public Tree() {
    }

    public Tree(
           java.lang.String currentIdentifier,
           namingauthority.Tree[] tree) {
           this.currentIdentifier = currentIdentifier;
           this.tree = tree;
    }


    /**
     * Gets the currentIdentifier value for this Tree.
     * 
     * @return currentIdentifier
     */
    public java.lang.String getCurrentIdentifier() {
        return currentIdentifier;
    }


    /**
     * Sets the currentIdentifier value for this Tree.
     * 
     * @param currentIdentifier
     */
    public void setCurrentIdentifier(java.lang.String currentIdentifier) {
        this.currentIdentifier = currentIdentifier;
    }


    /**
     * Gets the tree value for this Tree.
     * 
     * @return tree
     */
    public namingauthority.Tree[] getTree() {
        return tree;
    }


    /**
     * Sets the tree value for this Tree.
     * 
     * @param tree
     */
    public void setTree(namingauthority.Tree[] tree) {
        this.tree = tree;
    }

    public namingauthority.Tree getTree(int i) {
        return this.tree[i];
    }

    public void setTree(int i, namingauthority.Tree _value) {
        this.tree[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tree)) return false;
        Tree other = (Tree) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentIdentifier==null && other.getCurrentIdentifier()==null) || 
             (this.currentIdentifier!=null &&
              this.currentIdentifier.equals(other.getCurrentIdentifier()))) &&
            ((this.tree==null && other.getTree()==null) || 
             (this.tree!=null &&
              java.util.Arrays.equals(this.tree, other.getTree())));
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
        if (getCurrentIdentifier() != null) {
            _hashCode += getCurrentIdentifier().hashCode();
        }
        if (getTree() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTree());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTree(), i);
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
        new org.apache.axis.description.TypeDesc(Tree.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "currentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://na.cagrid.org/1.0/NamingAuthority", "Tree"));
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
