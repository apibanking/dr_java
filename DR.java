import javax.xml.ws.Holder;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext; 
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.math.BigInteger;
import java.util.UUID;

import java.math.BigDecimal;

import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URL;
import java.util.Iterator;

import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.KeyManagementException;
import java.security.UnrecoverableKeyException;

import javax.xml.soap.SOAPException;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.SOAPFault;
import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;

import javax.xml.datatype.XMLGregorianCalendar;

import com.quantiguous.services.DomesticRemittanceByPartnerService;
import com.quantiguous.services.DomesticRemittanceByPartnerServiceHttpService;

import com.quantiguous.services.CurrencyCodeType;

import org.kohsuke.args4j.*;

class ApiBankingFault
{
   String faultCode;
   String faultSubCode;
   String faultReason;
}

@SuppressWarnings("unchecked")
public class DR {


   @Option(name="-?", usage="display this page")
   private boolean showUsage = false;
   
   @Option(name="-disableClientAuth", usage="to disable client auth (2-way ssl)")
   private boolean disableClientAuth = false;

   public static void main(String[] argv) throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
     new DR().doMain(argv);
  }
   public void doMain(String[] argv) throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
      CmdLineParser parser = new CmdLineParser(this);

      try {
          // parse the arguments.
          parser.parseArgument(argv);
          if( showUsage ) {
             parser.printUsage(System.err);
             System.err.println();
             return;
          }

      } catch( Exception e ) {
          parser.printUsage(System.err);
          System.err.println();
          return;
      }

      enableTrace();
      setTrustStore();
      setClientCertificate();

      Path currentRelativePath = Paths.get("");
      String wsdlFilePath = currentRelativePath.toAbsolutePath().toString() + "/DomesticRemittanceService.wsdl";

      DomesticRemittanceByPartnerServiceHttpService svc = new DomesticRemittanceByPartnerServiceHttpService(new URL("file://" + wsdlFilePath));
      DomesticRemittanceByPartnerService client = svc.getDomesticRemittanceByPartnerServiceHttpPort();
 

      Holder<String> version                          = new Holder<String>();
      String partnerCode, customerID, debitAccountNo;
      Holder<CurrencyCodeType> accountCurrencyCode    = new Holder<CurrencyCodeType>();
      Holder<BigDecimal>  accountBalanceAmount        = new Holder<BigDecimal>();
      Holder<Boolean> lowBalanceAlert                 = new Holder<Boolean>();

      version.value                          = "1.0";
      partnerCode                            = "smb1";
      customerID                             = "857552";
      debitAccountNo                         = "001587700000054";

      // set the url, the URL for clientAuth (2-way SSL) & simple SSL are different
      if (disableClientAuth) {
        ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://uatsky.yesbank.in/app/uat/DomesticRemittanceService");

      } else {
        ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://uatsky.yesbank.in:444/app/uat/ssl/DomesticRemittanceService");        
      }

      // set the user & password
      ((BindingProvider)client).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "testclient");
      ((BindingProvider)client).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "test@123");

      // set the headers
      Map<String, List<String>> headers = new HashMap<String, List<String>>();
      headers.put("X-IBM-Client-Id", Collections.singletonList("83e60ab6-2ced-4de9-9a04-2ab91988578f"));
      headers.put("X-IBM-Client-Secret", Collections.singletonList("kG1vU7cO6gR8dH0eD1iT7qD6xM8vA8fS0bI4gB0aL0iQ4qF5cS"));
      ((BindingProvider)client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);

      // send the request
      try {
         client.getBalance(version, partnerCode, customerID, debitAccountNo, accountCurrencyCode, accountBalanceAmount, lowBalanceAlert);
      }
      catch(SOAPFaultException e) {
        printFault(e.getFault());
      }
      catch(Exception e) {
        e.printStackTrace(System.out); 
      };

    
   }

   private String parseQName(QName val) {
      if ( val != null ) {
         if ( val.getNamespaceURI() == "http://www.quantiguous.com/services" ) {
            return "ns:" + val.getLocalPart();
         }
         return val.toString();
      }
      return null;
   }

   private ApiBankingFault parseFault(SOAPFault f) {
      boolean first = false;
      ApiBankingFault apiFault = new ApiBankingFault();

      for (Iterator<QName> subCodesIterator = (Iterator<QName>)f.getFaultSubcodes(); subCodesIterator.hasNext();) {
         if (first == false) { 
            apiFault.faultCode = parseQName(subCodesIterator.next());
            first = true;
         } else {
           apiFault.faultSubCode = parseQName(subCodesIterator.next());
         }
      }
      try {
         for (Iterator<String> reasonTextsIterator = (Iterator<String>)f.getFaultReasonTexts(); reasonTextsIterator.hasNext();) {
            apiFault.faultReason = reasonTextsIterator.next();
         }
      } catch (SOAPException x) {
         x.printStackTrace(System.out); 
      }
      if ( f.hasDetail() ) {
         for (Iterator<DetailEntry> detailEntriesIterator = (Iterator<DetailEntry>)f.getDetail().getDetailEntries(); detailEntriesIterator.hasNext();) {
            System.out.println(detailEntriesIterator.next());
         }
      }
 
      return apiFault;
   }

   private void printFault(SOAPFault f) {
      ApiBankingFault apiFault = parseFault(f);

      System.out.println(apiFault.faultCode);
      System.out.println(apiFault.faultSubCode);
      System.out.println(apiFault.faultReason);
   }

   private void enableTrace() {
     System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
   }

   private void setTrustStore() {
     System.setProperty("javax.net.ssl.trustStore", "ybl.jks");
     System.setProperty("javax.net.ssl.trustStorePassword", "password");
   }

   private void setClientCertificate() {
     System.setProperty("javax.net.ssl.keyStore", "qg-client.jks");
     System.setProperty("javax.net.ssl.keyStorePassword", "apibanking");
   }


   /* the following method doesnt work with the oracle jdk, it may work when this runs within an app-server, 
      the idea is to find out where is JAXWSProperties */
   private void setSocketFactory(BindingProvider client) 
      throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
      SSLContext sc = SSLContext.getInstance("TLS");
      KeyManagerFactory factory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      keyStore.load(new FileInputStream("qg-client.jks"), "apibanking".toCharArray());
      factory.init(keyStore, "apibanking".toCharArray());
      sc.init(factory.getKeyManagers(), null, null);

      // specify a SSLSocket factory that will deal wit hthe 2 way SSL
      ((BindingProvider)client).getRequestContext().put("com.sun.xml.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY", sc);
      ((BindingProvider)client).getRequestContext().put("com.sun.xml.internal.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY", sc);
   }
}
