package com.allmerica.security.userprofile.service;

public class RiskUserProfileManagerProxy implements com.allmerica.security.userprofile.service.RiskUserProfileManager {
  private String _endpoint = null;
  private com.allmerica.security.userprofile.service.RiskUserProfileManager riskUserProfileManager = null;
  
  public RiskUserProfileManagerProxy() {
    _initRiskUserProfileManagerProxy();
  }
  
  public RiskUserProfileManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initRiskUserProfileManagerProxy();
  }
  
  private void _initRiskUserProfileManagerProxy() {
    try {
      riskUserProfileManager = (new com.allmerica.security.userprofile.service.RiskUserProfileManagerServiceLocator()).getRiskUserProfileManager();
      if (riskUserProfileManager != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)riskUserProfileManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)riskUserProfileManager)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (riskUserProfileManager != null)
      ((javax.xml.rpc.Stub)riskUserProfileManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.allmerica.security.userprofile.service.RiskUserProfileManager getRiskUserProfileManager() {
    if (riskUserProfileManager == null)
      _initRiskUserProfileManagerProxy();
    return riskUserProfileManager;
  }
  
  public java.lang.String getProducerCodeListForPCSCode(java.lang.String objXML) throws java.rmi.RemoteException{
    if (riskUserProfileManager == null)
      _initRiskUserProfileManagerProxy();
    return riskUserProfileManager.getProducerCodeListForPCSCode(objXML);
  }
  
  public com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject getProducerCodeListForPCSCodeObject(com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeRequestObject req) throws java.rmi.RemoteException{
    if (riskUserProfileManager == null)
      _initRiskUserProfileManagerProxy();
    return riskUserProfileManager.getProducerCodeListForPCSCodeObject(req);
  }
  
  public java.lang.String getUserProfile(java.lang.String userid, java.lang.String application) throws java.rmi.RemoteException{
    if (riskUserProfileManager == null)
      _initRiskUserProfileManagerProxy();
    return riskUserProfileManager.getUserProfile(userid, application);
  }
  
  public com.allmerica.security.userprofile.service.UserProfileResponse getUserProfileObject(com.allmerica.security.userprofile.service.UserProfileReq req) throws java.rmi.RemoteException{
    if (riskUserProfileManager == null)
      _initRiskUserProfileManagerProxy();
    return riskUserProfileManager.getUserProfileObject(req);
  }
  
  
}