/**
 * RiskUserProfileManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public interface RiskUserProfileManager extends java.rmi.Remote {
    public java.lang.String getProducerCodeListForPCSCode(java.lang.String objXML) throws java.rmi.RemoteException;
    public com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject getProducerCodeListForPCSCodeObject(com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeRequestObject req) throws java.rmi.RemoteException;
    public java.lang.String getUserProfile(java.lang.String userid, java.lang.String application) throws java.rmi.RemoteException;
    public com.allmerica.security.userprofile.service.UserProfileResponse getUserProfileObject(com.allmerica.security.userprofile.service.UserProfileReq req) throws java.rmi.RemoteException;
}
