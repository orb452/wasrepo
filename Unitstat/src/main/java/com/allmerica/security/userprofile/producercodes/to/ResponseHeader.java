/**
 * ResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class ResponseHeader  implements java.io.Serializable {
    private java.lang.String responseApplicationId;

    private java.lang.String responseTimestamp;

    private com.allmerica.security.userprofile.producercodes.to.ReturnCodeList returnCodeList;

    private java.lang.String serviceReturnCd;

    public ResponseHeader() {
    }

    public ResponseHeader(
           java.lang.String responseApplicationId,
           java.lang.String responseTimestamp,
           com.allmerica.security.userprofile.producercodes.to.ReturnCodeList returnCodeList,
           java.lang.String serviceReturnCd) {
           this.responseApplicationId = responseApplicationId;
           this.responseTimestamp = responseTimestamp;
           this.returnCodeList = returnCodeList;
           this.serviceReturnCd = serviceReturnCd;
    }


    /**
     * Gets the responseApplicationId value for this ResponseHeader.
     * 
     * @return responseApplicationId
     */
    public java.lang.String getResponseApplicationId() {
        return responseApplicationId;
    }


    /**
     * Sets the responseApplicationId value for this ResponseHeader.
     * 
     * @param responseApplicationId
     */
    public void setResponseApplicationId(java.lang.String responseApplicationId) {
        this.responseApplicationId = responseApplicationId;
    }


    /**
     * Gets the responseTimestamp value for this ResponseHeader.
     * 
     * @return responseTimestamp
     */
    public java.lang.String getResponseTimestamp() {
        return responseTimestamp;
    }


    /**
     * Sets the responseTimestamp value for this ResponseHeader.
     * 
     * @param responseTimestamp
     */
    public void setResponseTimestamp(java.lang.String responseTimestamp) {
        this.responseTimestamp = responseTimestamp;
    }


    /**
     * Gets the returnCodeList value for this ResponseHeader.
     * 
     * @return returnCodeList
     */
    public com.allmerica.security.userprofile.producercodes.to.ReturnCodeList getReturnCodeList() {
        return returnCodeList;
    }


    /**
     * Sets the returnCodeList value for this ResponseHeader.
     * 
     * @param returnCodeList
     */
    public void setReturnCodeList(com.allmerica.security.userprofile.producercodes.to.ReturnCodeList returnCodeList) {
        this.returnCodeList = returnCodeList;
    }


    /**
     * Gets the serviceReturnCd value for this ResponseHeader.
     * 
     * @return serviceReturnCd
     */
    public java.lang.String getServiceReturnCd() {
        return serviceReturnCd;
    }


    /**
     * Sets the serviceReturnCd value for this ResponseHeader.
     * 
     * @param serviceReturnCd
     */
    public void setServiceReturnCd(java.lang.String serviceReturnCd) {
        this.serviceReturnCd = serviceReturnCd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseHeader)) return false;
        ResponseHeader other = (ResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseApplicationId==null && other.getResponseApplicationId()==null) || 
             (this.responseApplicationId!=null &&
              this.responseApplicationId.equals(other.getResponseApplicationId()))) &&
            ((this.responseTimestamp==null && other.getResponseTimestamp()==null) || 
             (this.responseTimestamp!=null &&
              this.responseTimestamp.equals(other.getResponseTimestamp()))) &&
            ((this.returnCodeList==null && other.getReturnCodeList()==null) || 
             (this.returnCodeList!=null &&
              this.returnCodeList.equals(other.getReturnCodeList()))) &&
            ((this.serviceReturnCd==null && other.getServiceReturnCd()==null) || 
             (this.serviceReturnCd!=null &&
              this.serviceReturnCd.equals(other.getServiceReturnCd())));
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
        if (getResponseApplicationId() != null) {
            _hashCode += getResponseApplicationId().hashCode();
        }
        if (getResponseTimestamp() != null) {
            _hashCode += getResponseTimestamp().hashCode();
        }
        if (getReturnCodeList() != null) {
            _hashCode += getReturnCodeList().hashCode();
        }
        if (getServiceReturnCd() != null) {
            _hashCode += getServiceReturnCd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCodeList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceReturnCd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceReturnCd"));
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
