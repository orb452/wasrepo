/**
 * RiskUserProfileManagerSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allmerica.security.userprofile.service;

public class RiskUserProfileManagerSoapBindingStub extends org.apache.axis.client.Stub implements com.allmerica.security.userprofile.service.RiskUserProfileManager {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProducerCodeListForPCSCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getProducerCodeListForPCSCodeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProducerCodeListForPCSCodeObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeRequestObject"), com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeRequestObject.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeResponseObject"));
        oper.setReturnClass(com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getProducerCodeListForPCSCodeObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "application"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserProfileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserProfileObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileReq"), com.allmerica.security.userprofile.service.UserProfileReq.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileResponse"));
        oper.setReturnClass(com.allmerica.security.userprofile.service.UserProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserProfileObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public RiskUserProfileManagerSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RiskUserProfileManagerSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RiskUserProfileManagerSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ArrayOf_tns2_nillable_MasterProducer");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.MasterProducer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducer");
            qName2 = new javax.xml.namespace.QName("", "MasterProducer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ArrayOf_tns3_nillable_ReturnCd");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.ReturnCd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCd");
            qName2 = new javax.xml.namespace.QName("", "ReturnCd");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ArrayOf_xsd_nillable_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ArrayOfReturnCd");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ReturnCd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReturnCd");
            qName2 = new javax.xml.namespace.QName("", "ReturnCd");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReqHeader");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ReqHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReturnCd");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ReturnCd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReturnCdType");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ReturnCdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "ReturnCodeList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.ReturnCodeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileReq");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.UserProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "UserProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.UserProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeRequestObject");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeRequestObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "GetProducerCodeListForPCSCodeResponseObject");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ProducerListForPCSCode");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.ProducerListForPCSCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCd");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.ReturnCd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.producercodes.userprofile.security.allmerica.com", "ReturnCodeList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.producercodes.to.ReturnCodeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "Addr");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.Addr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "Agency");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.Agency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "BusinessSegmentList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.BusinessSegmentList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "GroupMembershipList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.GroupMembershipList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducer");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.MasterProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "MasterProducerList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.MasterProducerList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "NameType");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.NameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "PersonName");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.PersonName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "ProducerList");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.ProducerList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://to.service.userprofile.security.allmerica.com", "UserProfileTO");
            cachedSerQNames.add(qName);
            cls = com.allmerica.security.userprofile.service.to.UserProfileTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String getProducerCodeListForPCSCode(java.lang.String objXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "getProducerCodeListForPCSCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject getProducerCodeListForPCSCodeObject(com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeRequestObject req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "getProducerCodeListForPCSCodeObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.allmerica.security.userprofile.producercodes.to.GetProducerCodeListForPCSCodeResponseObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getUserProfile(java.lang.String userid, java.lang.String application) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "getUserProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userid, application});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allmerica.security.userprofile.service.UserProfileResponse getUserProfileObject(com.allmerica.security.userprofile.service.UserProfileReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.userprofile.security.allmerica.com", "getUserProfileObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allmerica.security.userprofile.service.UserProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allmerica.security.userprofile.service.UserProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allmerica.security.userprofile.service.UserProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
