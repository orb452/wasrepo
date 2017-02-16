/**
 * Agency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class Agency  implements java.io.Serializable {
    private java.lang.String aciLocationCode;

    private com.allmerica.security.userprofile.service.to.BusinessSegmentList businessSegmentList;

    private java.lang.String locationCode;

    private com.allmerica.security.userprofile.service.to.MasterProducerList masterProducerList;

    private java.lang.String PCSCode;

    public Agency() {
    }

    public Agency(
           java.lang.String aciLocationCode,
           com.allmerica.security.userprofile.service.to.BusinessSegmentList businessSegmentList,
           java.lang.String locationCode,
           com.allmerica.security.userprofile.service.to.MasterProducerList masterProducerList,
           java.lang.String PCSCode) {
           this.aciLocationCode = aciLocationCode;
           this.businessSegmentList = businessSegmentList;
           this.locationCode = locationCode;
           this.masterProducerList = masterProducerList;
           this.PCSCode = PCSCode;
    }


    /**
     * Gets the aciLocationCode value for this Agency.
     * 
     * @return aciLocationCode
     */
    public java.lang.String getAciLocationCode() {
        return aciLocationCode;
    }


    /**
     * Sets the aciLocationCode value for this Agency.
     * 
     * @param aciLocationCode
     */
    public void setAciLocationCode(java.lang.String aciLocationCode) {
        this.aciLocationCode = aciLocationCode;
    }


    /**
     * Gets the businessSegmentList value for this Agency.
     * 
     * @return businessSegmentList
     */
    public com.allmerica.security.userprofile.service.to.BusinessSegmentList getBusinessSegmentList() {
        return businessSegmentList;
    }


    /**
     * Sets the businessSegmentList value for this Agency.
     * 
     * @param businessSegmentList
     */
    public void setBusinessSegmentList(com.allmerica.security.userprofile.service.to.BusinessSegmentList businessSegmentList) {
        this.businessSegmentList = businessSegmentList;
    }


    /**
     * Gets the locationCode value for this Agency.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this Agency.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the masterProducerList value for this Agency.
     * 
     * @return masterProducerList
     */
    public com.allmerica.security.userprofile.service.to.MasterProducerList getMasterProducerList() {
        return masterProducerList;
    }


    /**
     * Sets the masterProducerList value for this Agency.
     * 
     * @param masterProducerList
     */
    public void setMasterProducerList(com.allmerica.security.userprofile.service.to.MasterProducerList masterProducerList) {
        this.masterProducerList = masterProducerList;
    }


    /**
     * Gets the PCSCode value for this Agency.
     * 
     * @return PCSCode
     */
    public java.lang.String getPCSCode() {
        return PCSCode;
    }


    /**
     * Sets the PCSCode value for this Agency.
     * 
     * @param PCSCode
     */
    public void setPCSCode(java.lang.String PCSCode) {
        this.PCSCode = PCSCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Agency)) return false;
        Agency other = (Agency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aciLocationCode==null && other.getAciLocationCode()==null) || 
             (this.aciLocationCode!=null &&
              this.aciLocationCode.equals(other.getAciLocationCode()))) &&
            ((this.businessSegmentList==null && other.getBusinessSegmentList()==null) || 
             (this.businessSegmentList!=null &&
              this.businessSegmentList.equals(other.getBusinessSegmentList()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.masterProducerList==null && other.getMasterProducerList()==null) || 
             (this.masterProducerList!=null &&
              this.masterProducerList.equals(other.getMasterProducerList()))) &&
            ((this.PCSCode==null && other.getPCSCode()==null) || 
             (this.PCSCode!=null &&
              this.PCSCode.equals(other.getPCSCode())));
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
        if (getAciLocationCode() != null) {
            _hashCode += getAciLocationCode().hashCode();
        }
        if (getBusinessSegmentList() != null) {
            _hashCode += getBusinessSegmentList().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getMasterProducerList() != null) {
            _hashCode += getMasterProducerList().hashCode();
        }
        if (getPCSCode() != null) {
            _hashCode += getPCSCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Agency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "Agency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aciLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aciLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessSegmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessSegmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "BusinessSegmentList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterProducerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterProducerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducerList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PCSCode"));
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
