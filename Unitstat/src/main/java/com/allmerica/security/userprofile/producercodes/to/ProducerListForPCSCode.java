/**
 * ProducerListForPCSCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class ProducerListForPCSCode  implements java.io.Serializable {
    private java.lang.String[] producerCode;

    public ProducerListForPCSCode() {
    }

    public ProducerListForPCSCode(
           java.lang.String[] producerCode) {
           this.producerCode = producerCode;
    }


    /**
     * Gets the producerCode value for this ProducerListForPCSCode.
     * 
     * @return producerCode
     */
    public java.lang.String[] getProducerCode() {
        return producerCode;
    }


    /**
     * Sets the producerCode value for this ProducerListForPCSCode.
     * 
     * @param producerCode
     */
    public void setProducerCode(java.lang.String[] producerCode) {
        this.producerCode = producerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProducerListForPCSCode)) return false;
        ProducerListForPCSCode other = (ProducerListForPCSCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.producerCode==null && other.getProducerCode()==null) || 
             (this.producerCode!=null &&
              java.util.Arrays.equals(this.producerCode, other.getProducerCode())));
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
        if (getProducerCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducerCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducerCode(), i);
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
        new org.apache.axis.description.TypeDesc(ProducerListForPCSCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ProducerListForPCSCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producerCode"));
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
