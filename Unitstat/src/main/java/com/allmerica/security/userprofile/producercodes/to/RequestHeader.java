/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class RequestHeader  implements java.io.Serializable {
    private java.lang.String requestTimestamp;

    private java.lang.String requestTrackingNumber;

    private java.lang.String requestingApplicationId;

    private java.lang.String securityTokenId;

    private java.lang.String transactionId;

    private java.lang.String userId;

    public RequestHeader() {
    }

    public RequestHeader(
           java.lang.String requestTimestamp,
           java.lang.String requestTrackingNumber,
           java.lang.String requestingApplicationId,
           java.lang.String securityTokenId,
           java.lang.String transactionId,
           java.lang.String userId) {
           this.requestTimestamp = requestTimestamp;
           this.requestTrackingNumber = requestTrackingNumber;
           this.requestingApplicationId = requestingApplicationId;
           this.securityTokenId = securityTokenId;
           this.transactionId = transactionId;
           this.userId = userId;
    }


    /**
     * Gets the requestTimestamp value for this RequestHeader.
     * 
     * @return requestTimestamp
     */
    public java.lang.String getRequestTimestamp() {
        return requestTimestamp;
    }


    /**
     * Sets the requestTimestamp value for this RequestHeader.
     * 
     * @param requestTimestamp
     */
    public void setRequestTimestamp(java.lang.String requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }


    /**
     * Gets the requestTrackingNumber value for this RequestHeader.
     * 
     * @return requestTrackingNumber
     */
    public java.lang.String getRequestTrackingNumber() {
        return requestTrackingNumber;
    }


    /**
     * Sets the requestTrackingNumber value for this RequestHeader.
     * 
     * @param requestTrackingNumber
     */
    public void setRequestTrackingNumber(java.lang.String requestTrackingNumber) {
        this.requestTrackingNumber = requestTrackingNumber;
    }


    /**
     * Gets the requestingApplicationId value for this RequestHeader.
     * 
     * @return requestingApplicationId
     */
    public java.lang.String getRequestingApplicationId() {
        return requestingApplicationId;
    }


    /**
     * Sets the requestingApplicationId value for this RequestHeader.
     * 
     * @param requestingApplicationId
     */
    public void setRequestingApplicationId(java.lang.String requestingApplicationId) {
        this.requestingApplicationId = requestingApplicationId;
    }


    /**
     * Gets the securityTokenId value for this RequestHeader.
     * 
     * @return securityTokenId
     */
    public java.lang.String getSecurityTokenId() {
        return securityTokenId;
    }


    /**
     * Sets the securityTokenId value for this RequestHeader.
     * 
     * @param securityTokenId
     */
    public void setSecurityTokenId(java.lang.String securityTokenId) {
        this.securityTokenId = securityTokenId;
    }


    /**
     * Gets the transactionId value for this RequestHeader.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RequestHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the userId value for this RequestHeader.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RequestHeader.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestTimestamp==null && other.getRequestTimestamp()==null) || 
             (this.requestTimestamp!=null &&
              this.requestTimestamp.equals(other.getRequestTimestamp()))) &&
            ((this.requestTrackingNumber==null && other.getRequestTrackingNumber()==null) || 
             (this.requestTrackingNumber!=null &&
              this.requestTrackingNumber.equals(other.getRequestTrackingNumber()))) &&
            ((this.requestingApplicationId==null && other.getRequestingApplicationId()==null) || 
             (this.requestingApplicationId!=null &&
              this.requestingApplicationId.equals(other.getRequestingApplicationId()))) &&
            ((this.securityTokenId==null && other.getSecurityTokenId()==null) || 
             (this.securityTokenId!=null &&
              this.securityTokenId.equals(other.getSecurityTokenId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getRequestTimestamp() != null) {
            _hashCode += getRequestTimestamp().hashCode();
        }
        if (getRequestTrackingNumber() != null) {
            _hashCode += getRequestTrackingNumber().hashCode();
        }
        if (getRequestingApplicationId() != null) {
            _hashCode += getRequestingApplicationId().hashCode();
        }
        if (getSecurityTokenId() != null) {
            _hashCode += getSecurityTokenId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "RequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestingApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestingApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityTokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
