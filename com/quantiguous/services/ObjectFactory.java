
package com.quantiguous.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quantiguous.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PartnerCode_QNAME = new QName("http://www.quantiguous.com/services", "partnerCode");
    private final static QName _TransactionStatus_QNAME = new QName("http://www.quantiguous.com/services", "transactionStatus");
    private final static QName _UniqueRequestNo_QNAME = new QName("http://www.quantiguous.com/services", "uniqueRequestNo");
    private final static QName _UniqueResponseNo_QNAME = new QName("http://www.quantiguous.com/services", "uniqueResponseNo");
    private final static QName _Version_QNAME = new QName("http://www.quantiguous.com/services", "version");
    private final static QName _RequestReferenceNo_QNAME = new QName("http://www.quantiguous.com/services", "requestReferenceNo");
    private final static QName _LowBalanceAlert_QNAME = new QName("http://www.quantiguous.com/services", "lowBalanceAlert");
    private final static QName _CustomerID_QNAME = new QName("http://www.quantiguous.com/services", "customerID");
    private final static QName _TransferAmount_QNAME = new QName("http://www.quantiguous.com/services", "transferAmount");
    private final static QName _AttemptNo_QNAME = new QName("http://www.quantiguous.com/services", "attemptNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quantiguous.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemitResponse }
     * 
     */
    public RemitResponse createRemitResponse() {
        return new RemitResponse();
    }

    /**
     * Create an instance of {@link TransactionStatusType }
     * 
     */
    public TransactionStatusType createTransactionStatusType() {
        return new TransactionStatusType();
    }

    /**
     * Create an instance of {@link GetRemittanceStatus }
     * 
     */
    public GetRemittanceStatus createGetRemittanceStatus() {
        return new GetRemittanceStatus();
    }

    /**
     * Create an instance of {@link GetTransactions }
     * 
     */
    public GetTransactions createGetTransactions() {
        return new GetTransactions();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link Remit }
     * 
     */
    public Remit createRemit() {
        return new Remit();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link GetTransactionsResponse }
     * 
     */
    public GetTransactionsResponse createGetTransactionsResponse() {
        return new GetTransactionsResponse();
    }

    /**
     * Create an instance of {@link TransactionsArrayType }
     * 
     */
    public TransactionsArrayType createTransactionsArrayType() {
        return new TransactionsArrayType();
    }

    /**
     * Create an instance of {@link GetRemittanceStatusResponse }
     * 
     */
    public GetRemittanceStatusResponse createGetRemittanceStatusResponse() {
        return new GetRemittanceStatusResponse();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "partnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartnerCode(String value) {
        return new JAXBElement<String>(_PartnerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "transactionStatus")
    public JAXBElement<TransactionStatusType> createTransactionStatus(TransactionStatusType value) {
        return new JAXBElement<TransactionStatusType>(_TransactionStatus_QNAME, TransactionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "uniqueRequestNo")
    public JAXBElement<String> createUniqueRequestNo(String value) {
        return new JAXBElement<String>(_UniqueRequestNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "uniqueResponseNo")
    public JAXBElement<String> createUniqueResponseNo(String value) {
        return new JAXBElement<String>(_UniqueResponseNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "requestReferenceNo")
    public JAXBElement<String> createRequestReferenceNo(String value) {
        return new JAXBElement<String>(_RequestReferenceNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "lowBalanceAlert")
    public JAXBElement<Boolean> createLowBalanceAlert(Boolean value) {
        return new JAXBElement<Boolean>(_LowBalanceAlert_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "customerID")
    public JAXBElement<String> createCustomerID(String value) {
        return new JAXBElement<String>(_CustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "transferAmount")
    public JAXBElement<BigDecimal> createTransferAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TransferAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "attemptNo")
    public JAXBElement<BigInteger> createAttemptNo(BigInteger value) {
        return new JAXBElement<BigInteger>(_AttemptNo_QNAME, BigInteger.class, null, value);
    }

}
