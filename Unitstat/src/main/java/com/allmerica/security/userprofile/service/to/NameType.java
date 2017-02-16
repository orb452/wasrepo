/**
 * NameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class NameType  implements java.io.Serializable {
    private java.lang.String agencyName;

    private com.allmerica.security.userprofile.service.to.PersonName personName;

    public NameType() {
    }

    public NameType(
           java.lang.String agencyName,
           com.allmerica.security.userprofile.service.to.PersonName personName) {
           this.agencyName = agencyName;
           this.personName = personName;
    }


    /**
     * Gets the agencyName value for this NameType.
     * 
     * @return agencyName
     */
    public java.lang.String getAgencyName() {
        return agencyName;
    }


    /**
     * Sets the agencyName value for this NameType.
     * 
     * @param agencyName
     */
    public void setAgencyName(java.lang.String agencyName) {
        this.agencyName = agencyName;
    }


    /**
     * Gets the personName value for this NameType.
     * 
     * @return personName
     */
    public com.allmerica.security.userprofile.service.to.PersonName getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this NameType.
     * 
     * @param personName
     */
    public void setPersonName(com.allmerica.security.userprofile.service.to.PersonName personName) {
        this.personName = personName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameType)) return false;
        NameType other = (NameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencyName==null && other.getAgencyName()==null) || 
             (this.agencyName!=null &&
              this.agencyName.equals(other.getAgencyName()))) &&
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName())));
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
        if (getAgencyName() != null) {
            _hashCode += getAgencyName().hashCode();
        }
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "NameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "PersonName"));
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
