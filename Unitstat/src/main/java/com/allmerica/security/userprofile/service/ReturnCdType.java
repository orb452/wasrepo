/**
 * ReturnCdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class ReturnCdType  implements java.io.Serializable {
    private java.lang.String returnCd;

    private java.lang.String returnMessageTxt;

    private java.lang.String returnTypeCd;

    public ReturnCdType() {
    }

    public ReturnCdType(
           java.lang.String returnCd,
           java.lang.String returnMessageTxt,
           java.lang.String returnTypeCd) {
           this.returnCd = returnCd;
           this.returnMessageTxt = returnMessageTxt;
           this.returnTypeCd = returnTypeCd;
    }


    /**
     * Gets the returnCd value for this ReturnCdType.
     * 
     * @return returnCd
     */
    public java.lang.String getReturnCd() {
        return returnCd;
    }


    /**
     * Sets the returnCd value for this ReturnCdType.
     * 
     * @param returnCd
     */
    public void setReturnCd(java.lang.String returnCd) {
        this.returnCd = returnCd;
    }


    /**
     * Gets the returnMessageTxt value for this ReturnCdType.
     * 
     * @return returnMessageTxt
     */
    public java.lang.String getReturnMessageTxt() {
        return returnMessageTxt;
    }


    /**
     * Sets the returnMessageTxt value for this ReturnCdType.
     * 
     * @param returnMessageTxt
     */
    public void setReturnMessageTxt(java.lang.String returnMessageTxt) {
        this.returnMessageTxt = returnMessageTxt;
    }


    /**
     * Gets the returnTypeCd value for this ReturnCdType.
     * 
     * @return returnTypeCd
     */
    public java.lang.String getReturnTypeCd() {
        return returnTypeCd;
    }


    /**
     * Sets the returnTypeCd value for this ReturnCdType.
     * 
     * @param returnTypeCd
     */
    public void setReturnTypeCd(java.lang.String returnTypeCd) {
        this.returnTypeCd = returnTypeCd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnCdType)) return false;
        ReturnCdType other = (ReturnCdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCd==null && other.getReturnCd()==null) || 
             (this.returnCd!=null &&
              this.returnCd.equals(other.getReturnCd()))) &&
            ((this.returnMessageTxt==null && other.getReturnMessageTxt()==null) || 
             (this.returnMessageTxt!=null &&
              this.returnMessageTxt.equals(other.getReturnMessageTxt()))) &&
            ((this.returnTypeCd==null && other.getReturnTypeCd()==null) || 
             (this.returnTypeCd!=null &&
              this.returnTypeCd.equals(other.getReturnTypeCd())));
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
        if (getReturnCd() != null) {
            _hashCode += getReturnCd().hashCode();
        }
        if (getReturnMessageTxt() != null) {
            _hashCode += getReturnMessageTxt().hashCode();
        }
        if (getReturnTypeCd() != null) {
            _hashCode += getReturnTypeCd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnCdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReturnCdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMessageTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnMessageTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTypeCd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnTypeCd"));
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
