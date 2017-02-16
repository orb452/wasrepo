/**
 * GetProducerCodeListForPCSCodeResponseObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class GetProducerCodeListForPCSCodeResponseObject  implements java.io.Serializable {
    private java.lang.String PCSCode;

    private com.allmerica.security.userprofile.producercodes.to.ProducerListForPCSCode producerListForPCSCode;

    private com.allmerica.security.userprofile.producercodes.to.ResponseHeader responseHeader;

    public GetProducerCodeListForPCSCodeResponseObject() {
    }

    public GetProducerCodeListForPCSCodeResponseObject(
           java.lang.String PCSCode,
           com.allmerica.security.userprofile.producercodes.to.ProducerListForPCSCode producerListForPCSCode,
           com.allmerica.security.userprofile.producercodes.to.ResponseHeader responseHeader) {
           this.PCSCode = PCSCode;
           this.producerListForPCSCode = producerListForPCSCode;
           this.responseHeader = responseHeader;
    }


    /**
     * Gets the PCSCode value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @return PCSCode
     */
    public java.lang.String getPCSCode() {
        return PCSCode;
    }


    /**
     * Sets the PCSCode value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @param PCSCode
     */
    public void setPCSCode(java.lang.String PCSCode) {
        this.PCSCode = PCSCode;
    }


    /**
     * Gets the producerListForPCSCode value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @return producerListForPCSCode
     */
    public com.allmerica.security.userprofile.producercodes.to.ProducerListForPCSCode getProducerListForPCSCode() {
        return producerListForPCSCode;
    }


    /**
     * Sets the producerListForPCSCode value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @param producerListForPCSCode
     */
    public void setProducerListForPCSCode(com.allmerica.security.userprofile.producercodes.to.ProducerListForPCSCode producerListForPCSCode) {
        this.producerListForPCSCode = producerListForPCSCode;
    }


    /**
     * Gets the responseHeader value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @return responseHeader
     */
    public com.allmerica.security.userprofile.producercodes.to.ResponseHeader getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this GetProducerCodeListForPCSCodeResponseObject.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(com.allmerica.security.userprofile.producercodes.to.ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProducerCodeListForPCSCodeResponseObject)) return false;
        GetProducerCodeListForPCSCodeResponseObject other = (GetProducerCodeListForPCSCodeResponseObject) obj;
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
            ((this.producerListForPCSCode==null && other.getProducerListForPCSCode()==null) || 
             (this.producerListForPCSCode!=null &&
              this.producerListForPCSCode.equals(other.getProducerListForPCSCode()))) &&
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader())));
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
        if (getProducerListForPCSCode() != null) {
            _hashCode += getProducerListForPCSCode().hashCode();
        }
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProducerCodeListForPCSCodeResponseObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeResponseObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PCSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerListForPCSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producerListForPCSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ProducerListForPCSCode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ResponseHeader"));
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
