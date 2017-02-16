/**
 * UserProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class UserProfileResponse  implements java.io.Serializable {
    private com.allmerica.security.userprofile.service.ResponseHeader responseHeader;

    private com.allmerica.security.userprofile.service.to.UserProfileTO userProfileTO;

    public UserProfileResponse() {
    }

    public UserProfileResponse(
           com.allmerica.security.userprofile.service.ResponseHeader responseHeader,
           com.allmerica.security.userprofile.service.to.UserProfileTO userProfileTO) {
           this.responseHeader = responseHeader;
           this.userProfileTO = userProfileTO;
    }


    /**
     * Gets the responseHeader value for this UserProfileResponse.
     * 
     * @return responseHeader
     */
    public com.allmerica.security.userprofile.service.ResponseHeader getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this UserProfileResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(com.allmerica.security.userprofile.service.ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the userProfileTO value for this UserProfileResponse.
     * 
     * @return userProfileTO
     */
    public com.allmerica.security.userprofile.service.to.UserProfileTO getUserProfileTO() {
        return userProfileTO;
    }


    /**
     * Sets the userProfileTO value for this UserProfileResponse.
     * 
     * @param userProfileTO
     */
    public void setUserProfileTO(com.allmerica.security.userprofile.service.to.UserProfileTO userProfileTO) {
        this.userProfileTO = userProfileTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfileResponse)) return false;
        UserProfileResponse other = (UserProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.userProfileTO==null && other.getUserProfileTO()==null) || 
             (this.userProfileTO!=null &&
              this.userProfileTO.equals(other.getUserProfileTO())));
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
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getUserProfileTO() != null) {
            _hashCode += getUserProfileTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ResponseHeader"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userProfileTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userProfileTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "UserProfileTO"));
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
