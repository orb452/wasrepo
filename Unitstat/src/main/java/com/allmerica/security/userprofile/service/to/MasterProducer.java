/**
 * MasterProducer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class MasterProducer  implements java.io.Serializable {
    private java.lang.String masterProducerCode;

    private com.allmerica.security.userprofile.service.to.ProducerList producerList;

    public MasterProducer() {
    }

    public MasterProducer(
           java.lang.String masterProducerCode,
           com.allmerica.security.userprofile.service.to.ProducerList producerList) {
           this.masterProducerCode = masterProducerCode;
           this.producerList = producerList;
    }


    /**
     * Gets the masterProducerCode value for this MasterProducer.
     * 
     * @return masterProducerCode
     */
    public java.lang.String getMasterProducerCode() {
        return masterProducerCode;
    }


    /**
     * Sets the masterProducerCode value for this MasterProducer.
     * 
     * @param masterProducerCode
     */
    public void setMasterProducerCode(java.lang.String masterProducerCode) {
        this.masterProducerCode = masterProducerCode;
    }


    /**
     * Gets the producerList value for this MasterProducer.
     * 
     * @return producerList
     */
    public com.allmerica.security.userprofile.service.to.ProducerList getProducerList() {
        return producerList;
    }


    /**
     * Sets the producerList value for this MasterProducer.
     * 
     * @param producerList
     */
    public void setProducerList(com.allmerica.security.userprofile.service.to.ProducerList producerList) {
        this.producerList = producerList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MasterProducer)) return false;
        MasterProducer other = (MasterProducer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterProducerCode==null && other.getMasterProducerCode()==null) || 
             (this.masterProducerCode!=null &&
              this.masterProducerCode.equals(other.getMasterProducerCode()))) &&
            ((this.producerList==null && other.getProducerList()==null) || 
             (this.producerList!=null &&
              this.producerList.equals(other.getProducerList())));
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
        if (getMasterProducerCode() != null) {
            _hashCode += getMasterProducerCode().hashCode();
        }
        if (getProducerList() != null) {
            _hashCode += getProducerList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MasterProducer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterProducerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterProducerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "ProducerList"));
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
