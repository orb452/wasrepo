/**
 * MasterProducerList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class MasterProducerList  implements java.io.Serializable {
    private com.allmerica.security.userprofile.service.to.MasterProducer[] masterProducer;

    public MasterProducerList() {
    }

    public MasterProducerList(
           com.allmerica.security.userprofile.service.to.MasterProducer[] masterProducer) {
           this.masterProducer = masterProducer;
    }


    /**
     * Gets the masterProducer value for this MasterProducerList.
     * 
     * @return masterProducer
     */
    public com.allmerica.security.userprofile.service.to.MasterProducer[] getMasterProducer() {
        return masterProducer;
    }


    /**
     * Sets the masterProducer value for this MasterProducerList.
     * 
     * @param masterProducer
     */
    public void setMasterProducer(com.allmerica.security.userprofile.service.to.MasterProducer[] masterProducer) {
        this.masterProducer = masterProducer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MasterProducerList)) return false;
        MasterProducerList other = (MasterProducerList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterProducer==null && other.getMasterProducer()==null) || 
             (this.masterProducer!=null &&
              java.util.Arrays.equals(this.masterProducer, other.getMasterProducer())));
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
        if (getMasterProducer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMasterProducer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMasterProducer(), i);
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
        new org.apache.axis.description.TypeDesc(MasterProducerList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducerList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterProducer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterProducer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducer"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MasterProducer"));
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
