/**
 * UserProfileTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service.to;

public class UserProfileTO  implements java.io.Serializable {
    private com.allmerica.security.userprofile.service.to.Addr addr;

    private com.allmerica.security.userprofile.service.to.Agency agency;

    private java.lang.String emailAddr;

    private java.lang.String faxNumber;

    private com.allmerica.security.userprofile.service.to.GroupMembershipList groupMembershipList;

    private java.lang.String lastLoginTime;

    private java.lang.String mainframeID;

    private com.allmerica.security.userprofile.service.to.NameType nameType;

    private java.lang.String operatorID;

    private java.lang.String PMSSortCode;

    private java.lang.String PMSStatCode;

    private java.lang.String phoneNumber;

    private java.lang.String profilingOverride;

    private java.lang.String returnMessage;

    private java.lang.String returnTypeCode;

    private java.lang.String titleRelationship;

    private boolean viewEmployeePolicies;

    private java.lang.String auSuMlogonID;

    public UserProfileTO() {
    }

    public UserProfileTO(
           com.allmerica.security.userprofile.service.to.Addr addr,
           com.allmerica.security.userprofile.service.to.Agency agency,
           java.lang.String emailAddr,
           java.lang.String faxNumber,
           com.allmerica.security.userprofile.service.to.GroupMembershipList groupMembershipList,
           java.lang.String lastLoginTime,
           java.lang.String mainframeID,
           com.allmerica.security.userprofile.service.to.NameType nameType,
           java.lang.String operatorID,
           java.lang.String PMSSortCode,
           java.lang.String PMSStatCode,
           java.lang.String phoneNumber,
           java.lang.String profilingOverride,
           java.lang.String returnMessage,
           java.lang.String returnTypeCode,
           java.lang.String titleRelationship,
           boolean viewEmployeePolicies,
           java.lang.String auSuMlogonID) {
           this.addr = addr;
           this.agency = agency;
           this.emailAddr = emailAddr;
           this.faxNumber = faxNumber;
           this.groupMembershipList = groupMembershipList;
           this.lastLoginTime = lastLoginTime;
           this.mainframeID = mainframeID;
           this.nameType = nameType;
           this.operatorID = operatorID;
           this.PMSSortCode = PMSSortCode;
           this.PMSStatCode = PMSStatCode;
           this.phoneNumber = phoneNumber;
           this.profilingOverride = profilingOverride;
           this.returnMessage = returnMessage;
           this.returnTypeCode = returnTypeCode;
           this.titleRelationship = titleRelationship;
           this.viewEmployeePolicies = viewEmployeePolicies;
           this.auSuMlogonID = auSuMlogonID;
    }


    /**
     * Gets the addr value for this UserProfileTO.
     * 
     * @return addr
     */
    public com.allmerica.security.userprofile.service.to.Addr getAddr() {
        return addr;
    }


    /**
     * Sets the addr value for this UserProfileTO.
     * 
     * @param addr
     */
    public void setAddr(com.allmerica.security.userprofile.service.to.Addr addr) {
        this.addr = addr;
    }


    /**
     * Gets the agency value for this UserProfileTO.
     * 
     * @return agency
     */
    public com.allmerica.security.userprofile.service.to.Agency getAgency() {
        return agency;
    }


    /**
     * Sets the agency value for this UserProfileTO.
     * 
     * @param agency
     */
    public void setAgency(com.allmerica.security.userprofile.service.to.Agency agency) {
        this.agency = agency;
    }


    /**
     * Gets the emailAddr value for this UserProfileTO.
     * 
     * @return emailAddr
     */
    public java.lang.String getEmailAddr() {
        return emailAddr;
    }


    /**
     * Sets the emailAddr value for this UserProfileTO.
     * 
     * @param emailAddr
     */
    public void setEmailAddr(java.lang.String emailAddr) {
        this.emailAddr = emailAddr;
    }


    /**
     * Gets the faxNumber value for this UserProfileTO.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this UserProfileTO.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the groupMembershipList value for this UserProfileTO.
     * 
     * @return groupMembershipList
     */
    public com.allmerica.security.userprofile.service.to.GroupMembershipList getGroupMembershipList() {
        return groupMembershipList;
    }


    /**
     * Sets the groupMembershipList value for this UserProfileTO.
     * 
     * @param groupMembershipList
     */
    public void setGroupMembershipList(com.allmerica.security.userprofile.service.to.GroupMembershipList groupMembershipList) {
        this.groupMembershipList = groupMembershipList;
    }


    /**
     * Gets the lastLoginTime value for this UserProfileTO.
     * 
     * @return lastLoginTime
     */
    public java.lang.String getLastLoginTime() {
        return lastLoginTime;
    }


    /**
     * Sets the lastLoginTime value for this UserProfileTO.
     * 
     * @param lastLoginTime
     */
    public void setLastLoginTime(java.lang.String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    /**
     * Gets the mainframeID value for this UserProfileTO.
     * 
     * @return mainframeID
     */
    public java.lang.String getMainframeID() {
        return mainframeID;
    }


    /**
     * Sets the mainframeID value for this UserProfileTO.
     * 
     * @param mainframeID
     */
    public void setMainframeID(java.lang.String mainframeID) {
        this.mainframeID = mainframeID;
    }


    /**
     * Gets the nameType value for this UserProfileTO.
     * 
     * @return nameType
     */
    public com.allmerica.security.userprofile.service.to.NameType getNameType() {
        return nameType;
    }


    /**
     * Sets the nameType value for this UserProfileTO.
     * 
     * @param nameType
     */
    public void setNameType(com.allmerica.security.userprofile.service.to.NameType nameType) {
        this.nameType = nameType;
    }


    /**
     * Gets the operatorID value for this UserProfileTO.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this UserProfileTO.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the PMSSortCode value for this UserProfileTO.
     * 
     * @return PMSSortCode
     */
    public java.lang.String getPMSSortCode() {
        return PMSSortCode;
    }


    /**
     * Sets the PMSSortCode value for this UserProfileTO.
     * 
     * @param PMSSortCode
     */
    public void setPMSSortCode(java.lang.String PMSSortCode) {
        this.PMSSortCode = PMSSortCode;
    }


    /**
     * Gets the PMSStatCode value for this UserProfileTO.
     * 
     * @return PMSStatCode
     */
    public java.lang.String getPMSStatCode() {
        return PMSStatCode;
    }


    /**
     * Sets the PMSStatCode value for this UserProfileTO.
     * 
     * @param PMSStatCode
     */
    public void setPMSStatCode(java.lang.String PMSStatCode) {
        this.PMSStatCode = PMSStatCode;
    }


    /**
     * Gets the phoneNumber value for this UserProfileTO.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this UserProfileTO.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the profilingOverride value for this UserProfileTO.
     * 
     * @return profilingOverride
     */
    public java.lang.String getProfilingOverride() {
        return profilingOverride;
    }


    /**
     * Sets the profilingOverride value for this UserProfileTO.
     * 
     * @param profilingOverride
     */
    public void setProfilingOverride(java.lang.String profilingOverride) {
        this.profilingOverride = profilingOverride;
    }


    /**
     * Gets the returnMessage value for this UserProfileTO.
     * 
     * @return returnMessage
     */
    public java.lang.String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this UserProfileTO.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(java.lang.String returnMessage) {
        this.returnMessage = returnMessage;
    }


    /**
     * Gets the returnTypeCode value for this UserProfileTO.
     * 
     * @return returnTypeCode
     */
    public java.lang.String getReturnTypeCode() {
        return returnTypeCode;
    }


    /**
     * Sets the returnTypeCode value for this UserProfileTO.
     * 
     * @param returnTypeCode
     */
    public void setReturnTypeCode(java.lang.String returnTypeCode) {
        this.returnTypeCode = returnTypeCode;
    }


    /**
     * Gets the titleRelationship value for this UserProfileTO.
     * 
     * @return titleRelationship
     */
    public java.lang.String getTitleRelationship() {
        return titleRelationship;
    }


    /**
     * Sets the titleRelationship value for this UserProfileTO.
     * 
     * @param titleRelationship
     */
    public void setTitleRelationship(java.lang.String titleRelationship) {
        this.titleRelationship = titleRelationship;
    }


    /**
     * Gets the viewEmployeePolicies value for this UserProfileTO.
     * 
     * @return viewEmployeePolicies
     */
    public boolean isViewEmployeePolicies() {
        return viewEmployeePolicies;
    }


    /**
     * Sets the viewEmployeePolicies value for this UserProfileTO.
     * 
     * @param viewEmployeePolicies
     */
    public void setViewEmployeePolicies(boolean viewEmployeePolicies) {
        this.viewEmployeePolicies = viewEmployeePolicies;
    }


    /**
     * Gets the auSuMlogonID value for this UserProfileTO.
     * 
     * @return auSuMlogonID
     */
    public java.lang.String getAuSuMlogonID() {
        return auSuMlogonID;
    }


    /**
     * Sets the auSuMlogonID value for this UserProfileTO.
     * 
     * @param auSuMlogonID
     */
    public void setAuSuMlogonID(java.lang.String auSuMlogonID) {
        this.auSuMlogonID = auSuMlogonID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfileTO)) return false;
        UserProfileTO other = (UserProfileTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addr==null && other.getAddr()==null) || 
             (this.addr!=null &&
              this.addr.equals(other.getAddr()))) &&
            ((this.agency==null && other.getAgency()==null) || 
             (this.agency!=null &&
              this.agency.equals(other.getAgency()))) &&
            ((this.emailAddr==null && other.getEmailAddr()==null) || 
             (this.emailAddr!=null &&
              this.emailAddr.equals(other.getEmailAddr()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.groupMembershipList==null && other.getGroupMembershipList()==null) || 
             (this.groupMembershipList!=null &&
              this.groupMembershipList.equals(other.getGroupMembershipList()))) &&
            ((this.lastLoginTime==null && other.getLastLoginTime()==null) || 
             (this.lastLoginTime!=null &&
              this.lastLoginTime.equals(other.getLastLoginTime()))) &&
            ((this.mainframeID==null && other.getMainframeID()==null) || 
             (this.mainframeID!=null &&
              this.mainframeID.equals(other.getMainframeID()))) &&
            ((this.nameType==null && other.getNameType()==null) || 
             (this.nameType!=null &&
              this.nameType.equals(other.getNameType()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
            ((this.PMSSortCode==null && other.getPMSSortCode()==null) || 
             (this.PMSSortCode!=null &&
              this.PMSSortCode.equals(other.getPMSSortCode()))) &&
            ((this.PMSStatCode==null && other.getPMSStatCode()==null) || 
             (this.PMSStatCode!=null &&
              this.PMSStatCode.equals(other.getPMSStatCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.profilingOverride==null && other.getProfilingOverride()==null) || 
             (this.profilingOverride!=null &&
              this.profilingOverride.equals(other.getProfilingOverride()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage()))) &&
            ((this.returnTypeCode==null && other.getReturnTypeCode()==null) || 
             (this.returnTypeCode!=null &&
              this.returnTypeCode.equals(other.getReturnTypeCode()))) &&
            ((this.titleRelationship==null && other.getTitleRelationship()==null) || 
             (this.titleRelationship!=null &&
              this.titleRelationship.equals(other.getTitleRelationship()))) &&
            this.viewEmployeePolicies == other.isViewEmployeePolicies() &&
            ((this.auSuMlogonID==null && other.getAuSuMlogonID()==null) || 
             (this.auSuMlogonID!=null &&
              this.auSuMlogonID.equals(other.getAuSuMlogonID())));
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
        if (getAddr() != null) {
            _hashCode += getAddr().hashCode();
        }
        if (getAgency() != null) {
            _hashCode += getAgency().hashCode();
        }
        if (getEmailAddr() != null) {
            _hashCode += getEmailAddr().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getGroupMembershipList() != null) {
            _hashCode += getGroupMembershipList().hashCode();
        }
        if (getLastLoginTime() != null) {
            _hashCode += getLastLoginTime().hashCode();
        }
        if (getMainframeID() != null) {
            _hashCode += getMainframeID().hashCode();
        }
        if (getNameType() != null) {
            _hashCode += getNameType().hashCode();
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
        }
        if (getPMSSortCode() != null) {
            _hashCode += getPMSSortCode().hashCode();
        }
        if (getPMSStatCode() != null) {
            _hashCode += getPMSStatCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getProfilingOverride() != null) {
            _hashCode += getProfilingOverride().hashCode();
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        if (getReturnTypeCode() != null) {
            _hashCode += getReturnTypeCode().hashCode();
        }
        if (getTitleRelationship() != null) {
            _hashCode += getTitleRelationship().hashCode();
        }
        _hashCode += (isViewEmployeePolicies() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAuSuMlogonID() != null) {
            _hashCode += getAuSuMlogonID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfileTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "UserProfileTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "Addr"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "Agency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembershipList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupMembershipList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "GroupMembershipList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastLoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainframeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainframeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "NameType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMSSortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMSSortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMSStatCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMSStatCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilingOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilingOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewEmployeePolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewEmployeePolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auSuMlogonID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuSuMlogonID"));
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
