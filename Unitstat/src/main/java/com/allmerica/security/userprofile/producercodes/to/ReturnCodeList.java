/**
 * ReturnCodeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.producercodes.to;

public class ReturnCodeList  implements java.io.Serializable {
    private com.allmerica.security.userprofile.producercodes.to.ReturnCd[] returnCd;

    public ReturnCodeList() {
    }

    public ReturnCodeList(
           com.allmerica.security.userprofile.producercodes.to.ReturnCd[] returnCd) {
           this.returnCd = returnCd;
    }


    /**
     * Gets the returnCd value for this ReturnCodeList.
     * 
     * @return returnCd
     */
    public com.allmerica.security.userprofile.producercodes.to.ReturnCd[] getReturnCd() {
        return returnCd;
    }


    /**
     * Sets the returnCd value for this ReturnCodeList.
     * 
     * @param returnCd
     */
    public void setReturnCd(com.allmerica.security.userprofile.producercodes.to.ReturnCd[] returnCd) {
        this.returnCd = returnCd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnCodeList)) return false;
        ReturnCodeList other = (ReturnCodeList) obj;
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
              java.util.Arrays.equals(this.returnCd, other.getReturnCd())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnCd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnCd(), i);
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
        new org.apache.axis.description.TypeDesc(ReturnCodeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCodeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCd"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ReturnCd"));
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
