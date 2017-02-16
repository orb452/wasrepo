/**
 * ReqHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class ReqHeader  implements java.io.Serializable {
    private java.lang.String applicationID;

    private java.lang.String messageTimeStamp;

    private java.lang.String messageTrackingNumber;

    public ReqHeader() {
    }

    public ReqHeader(
           java.lang.String applicationID,
           java.lang.String messageTimeStamp,
           java.lang.String messageTrackingNumber) {
           this.applicationID = applicationID;
           this.messageTimeStamp = messageTimeStamp;
           this.messageTrackingNumber = messageTrackingNumber;
    }


    /**
     * Gets the applicationID value for this ReqHeader.
     * 
     * @return applicationID
     */
    public java.lang.String getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this ReqHeader.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.String applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the messageTimeStamp value for this ReqHeader.
     * 
     * @return messageTimeStamp
     */
    public java.lang.String getMessageTimeStamp() {
        return messageTimeStamp;
    }


    /**
     * Sets the messageTimeStamp value for this ReqHeader.
     * 
     * @param messageTimeStamp
     */
    public void setMessageTimeStamp(java.lang.String messageTimeStamp) {
        this.messageTimeStamp = messageTimeStamp;
    }


    /**
     * Gets the messageTrackingNumber value for this ReqHeader.
     * 
     * @return messageTrackingNumber
     */
    public java.lang.String getMessageTrackingNumber() {
        return messageTrackingNumber;
    }


    /**
     * Sets the messageTrackingNumber value for this ReqHeader.
     * 
     * @param messageTrackingNumber
     */
    public void setMessageTrackingNumber(java.lang.String messageTrackingNumber) {
        this.messageTrackingNumber = messageTrackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReqHeader)) return false;
        ReqHeader other = (ReqHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.messageTimeStamp==null && other.getMessageTimeStamp()==null) || 
             (this.messageTimeStamp!=null &&
              this.messageTimeStamp.equals(other.getMessageTimeStamp()))) &&
            ((this.messageTrackingNumber==null && other.getMessageTrackingNumber()==null) || 
             (this.messageTrackingNumber!=null &&
              this.messageTrackingNumber.equals(other.getMessageTrackingNumber())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getMessageTimeStamp() != null) {
            _hashCode += getMessageTimeStamp().hashCode();
        }
        if (getMessageTrackingNumber() != null) {
            _hashCode += getMessageTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReqHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReqHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageTrackingNumber"));
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
