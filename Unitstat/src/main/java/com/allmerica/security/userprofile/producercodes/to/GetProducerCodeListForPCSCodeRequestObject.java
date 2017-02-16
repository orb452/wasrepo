/**
 * GetProducerCodeListForPCSCodeRequestObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class GetProducerCodeListForPCSCodeRequestObject  implements java.io.Serializable {
    private java.lang.String PCSCode;

    private com.allmerica.security.userprofile.producercodes.to.RequestHeader requestHeader;

    public GetProducerCodeListForPCSCodeRequestObject() {
    }

    public GetProducerCodeListForPCSCodeRequestObject(
           java.lang.String PCSCode,
           com.allmerica.security.userprofile.producercodes.to.RequestHeader requestHeader) {
           this.PCSCode = PCSCode;
           this.requestHeader = requestHeader;
    }


    /**
     * Gets the PCSCode value for this GetProducerCodeListForPCSCodeRequestObject.
     * 
     * @return PCSCode
     */
    public java.lang.String getPCSCode() {
        return PCSCode;
    }


    /**
     * Sets the PCSCode value for this GetProducerCodeListForPCSCodeRequestObject.
     * 
     * @param PCSCode
     */
    public void setPCSCode(java.lang.String PCSCode) {
        this.PCSCode = PCSCode;
    }


    /**
     * Gets the requestHeader value for this GetProducerCodeListForPCSCodeRequestObject.
     * 
     * @return requestHeader
     */
    public com.allmerica.security.userprofile.producercodes.to.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this GetProducerCodeListForPCSCodeRequestObject.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.allmerica.security.userprofile.producercodes.to.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProducerCodeListForPCSCodeRequestObject)) return false;
        GetProducerCodeListForPCSCodeRequestObject other = (GetProducerCodeListForPCSCodeRequestObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSCode==null && other.getPCSCode()==null) || 
             (this.PCSCode!=null &&
              this.PCSCode.equals(other.getPCSCode()))) &&
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader())));
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
        if (getPCSCode() != null) {
            _hashCode += getPCSCode().hashCode();
        }
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProducerCodeListForPCSCodeRequestObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeRequestObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PCSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "RequestHeader"));
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
