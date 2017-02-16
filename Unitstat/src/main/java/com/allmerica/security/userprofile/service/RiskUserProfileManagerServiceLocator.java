/**
 * RiskUserProfileManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class RiskUserProfileManagerServiceLocator extends org.apache.axis.client.Service implements com.allmerica.security.userprofile.service.RiskUserProfileManagerService {

    public RiskUserProfileManagerServiceLocator() {
    }


    public RiskUserProfileManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RiskUserProfileManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RiskUserProfileManager
    private java.lang.String RiskUserProfileManager_address = "http://161.182.131.251:80/uat/noauth/userprofile";

    public java.lang.String getRiskUserProfileManagerAddress() {
        return RiskUserProfileManager_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RiskUserProfileManagerWSDDServiceName = "RiskUserProfileManager";

    public java.lang.String getRiskUserProfileManagerWSDDServiceName() {
        return RiskUserProfileManagerWSDDServiceName;
    }

    public void setRiskUserProfileManagerWSDDServiceName(java.lang.String name) {
        RiskUserProfileManagerWSDDServiceName = name;
    }

    public com.allmerica.security.userprofile.service.RiskUserProfileManager getRiskUserProfileManager() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RiskUserProfileManager_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRiskUserProfileManager(endpoint);
    }

    public com.allmerica.security.userprofile.service.RiskUserProfileManager getRiskUserProfileManager(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.allmerica.security.userprofile.service.RiskUserProfileManagerSoapBindingStub _stub = new com.allmerica.security.userprofile.service.RiskUserProfileManagerSoapBindingStub(portAddress, this);
            _stub.setPortName(getRiskUserProfileManagerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRiskUserProfileManagerEndpointAddress(java.lang.String address) {
        RiskUserProfileManager_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.allmerica.security.userprofile.service.RiskUserProfileManager.class.isAssignableFrom(serviceEndpointInterface)) {
                com.allmerica.security.userprofile.service.RiskUserProfileManagerSoapBindingStub _stub = new com.allmerica.security.userprofile.service.RiskUserProfileManagerSoapBindingStub(new java.net.URL(RiskUserProfileManager_address), this);
                _stub.setPortName(getRiskUserProfileManagerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RiskUserProfileManager".equals(inputPortName)) {
            return getRiskUserProfileManager();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "RiskUserProfileManagerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "RiskUserProfileManager"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RiskUserProfileManager".equals(portName)) {
            setRiskUserProfileManagerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
