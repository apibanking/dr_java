
package com.quantiguous.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DomesticRemittanceByPartnerServiceHttpService", targetNamespace = "http://www.quantiguous.com/services", wsdlLocation = "file:/Users/akhileshkataria/Code/java/dr/DomesticRemittanceService.wsdl")
public class DomesticRemittanceByPartnerServiceHttpService
    extends Service
{

    private final static URL DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_WSDL_LOCATION;
    private final static WebServiceException DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_EXCEPTION;
    private final static QName DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_QNAME = new QName("http://www.quantiguous.com/services", "DomesticRemittanceByPartnerServiceHttpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/akhileshkataria/Code/java/dr/DomesticRemittanceService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_WSDL_LOCATION = url;
        DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_EXCEPTION = e;
    }

    public DomesticRemittanceByPartnerServiceHttpService() {
        super(__getWsdlLocation(), DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_QNAME);
    }

    public DomesticRemittanceByPartnerServiceHttpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_QNAME, features);
    }

    public DomesticRemittanceByPartnerServiceHttpService(URL wsdlLocation) {
        super(wsdlLocation, DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_QNAME);
    }

    public DomesticRemittanceByPartnerServiceHttpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_QNAME, features);
    }

    public DomesticRemittanceByPartnerServiceHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DomesticRemittanceByPartnerServiceHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DomesticRemittanceByPartnerService
     */
    @WebEndpoint(name = "DomesticRemittanceByPartnerServiceHttpPort")
    public DomesticRemittanceByPartnerService getDomesticRemittanceByPartnerServiceHttpPort() {
        return super.getPort(new QName("http://www.quantiguous.com/services", "DomesticRemittanceByPartnerServiceHttpPort"), DomesticRemittanceByPartnerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DomesticRemittanceByPartnerService
     */
    @WebEndpoint(name = "DomesticRemittanceByPartnerServiceHttpPort")
    public DomesticRemittanceByPartnerService getDomesticRemittanceByPartnerServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.quantiguous.com/services", "DomesticRemittanceByPartnerServiceHttpPort"), DomesticRemittanceByPartnerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_EXCEPTION!= null) {
            throw DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_EXCEPTION;
        }
        return DOMESTICREMITTANCEBYPARTNERSERVICEHTTPSERVICE_WSDL_LOCATION;
    }

}
