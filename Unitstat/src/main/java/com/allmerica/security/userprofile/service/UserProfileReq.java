/**
 * UserProfileReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class UserProfileReq  implements java.io.Serializable {
    private com.allmerica.security.userprofile.service.ReqHeader reqHeader;

    private java.lang.String userID;

    public UserProfileReq() {
    }

    public UserProfileReq(
           com.allmerica.security.userprofile.service.ReqHeader reqHeader,
           java.lang.String userID) {
           this.reqHeader = reqHeader;
           this.userID = userID;
    }


    /**
     * Gets the reqHeader value for this UserProfileReq.
     * 
     * @return reqHeader
     */
    public com.allmerica.security.userprofile.service.ReqHeader getReqHeader() {
        return reqHeader;
    }


    /**
     * Sets the reqHeader value for this UserProfileReq.
     * 
     * @param reqHeader
     */
    public void setReqHeader(com.allmerica.security.userprofile.service.ReqHeader reqHeader) {
        this.reqHeader = reqHeader;
    }


    /**
     * Gets the userID value for this UserProfileReq.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this UserProfileReq.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfileReq)) return false;
        UserProfileReq other = (UserProfileReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reqHeader==null && other.getReqHeader()==null) || 
             (this.reqHeader!=null &&
              this.reqHeader.equals(other.getReqHeader()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getReqHeader() != null) {
            _hashCode += getReqHeader().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfileReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReqHeader"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
