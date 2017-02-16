/**
 * GroupMembershipList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class GroupMembershipList  implements java.io.Serializable {
    private java.lang.String[] memberOf;

    public GroupMembershipList() {
    }

    public GroupMembershipList(
           java.lang.String[] memberOf) {
           this.memberOf = memberOf;
    }


    /**
     * Gets the memberOf value for this GroupMembershipList.
     * 
     * @return memberOf
     */
    public java.lang.String[] getMemberOf() {
        return memberOf;
    }


    /**
     * Sets the memberOf value for this GroupMembershipList.
     * 
     * @param memberOf
     */
    public void setMemberOf(java.lang.String[] memberOf) {
        this.memberOf = memberOf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupMembershipList)) return false;
        GroupMembershipList other = (GroupMembershipList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberOf==null && other.getMemberOf()==null) || 
             (this.memberOf!=null &&
              java.util.Arrays.equals(this.memberOf, other.getMemberOf())));
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
        if (getMemberOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberOf(), i);
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
        new org.apache.axis.description.TypeDesc(GroupMembershipList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "GroupMembershipList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberOf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "string"));
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
