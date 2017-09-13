
package com.quantiguous.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.quantiguous.com/services}version"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}uniqueRequestNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}partnerCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}customerID"/>
 *         &lt;element name="debitAccountNo" type="{http://www.quantiguous.com/services}accountNoType"/>
 *         &lt;element name="remitterAccountNo" type="{http://www.quantiguous.com/services}accountNoType"/>
 *         &lt;element name="remitterIFSC" type="{http://www.quantiguous.com/services}IFSCType"/>
 *         &lt;element name="remitterName" type="{http://www.quantiguous.com/services}nameType" minOccurs="0"/>
 *         &lt;element name="remitterAddress" type="{http://www.quantiguous.com/services}AddressType" minOccurs="0"/>
 *         &lt;element name="remitterContact" type="{http://www.quantiguous.com/services}contactType" minOccurs="0"/>
 *         &lt;element name="beneficiaryName" type="{http://www.quantiguous.com/services}nameType"/>
 *         &lt;element name="beneficiaryAddress" type="{http://www.quantiguous.com/services}AddressType" minOccurs="0"/>
 *         &lt;element name="beneficiaryContact" type="{http://www.quantiguous.com/services}contactType" minOccurs="0"/>
 *         &lt;element name="beneficiaryAccountNo" type="{http://www.quantiguous.com/services}accountNoType"/>
 *         &lt;element name="beneficiaryIFSC" type="{http://www.quantiguous.com/services}IFSCType"/>
 *         &lt;element name="transferType" type="{http://www.quantiguous.com/services}transferTypeType"/>
 *         &lt;element name="transferCurrencyCode" type="{http://www.quantiguous.com/services}currencyCodeType"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}transferAmount"/>
 *         &lt;element name="remitterToBeneficiaryInfo" type="{http://www.quantiguous.com/services}remitterToBeneficiaryInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "uniqueRequestNo",
    "partnerCode",
    "customerID",
    "debitAccountNo",
    "remitterAccountNo",
    "remitterIFSC",
    "remitterName",
    "remitterAddress",
    "remitterContact",
    "beneficiaryName",
    "beneficiaryAddress",
    "beneficiaryContact",
    "beneficiaryAccountNo",
    "beneficiaryIFSC",
    "transferType",
    "transferCurrencyCode",
    "transferAmount",
    "remitterToBeneficiaryInfo"
})
@XmlRootElement(name = "remit")
public class Remit {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueRequestNo;
    @XmlElement(required = true, nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partnerCode;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String debitAccountNo;
    @XmlElement(required = true)
    protected String remitterAccountNo;
    @XmlElement(required = true)
    protected String remitterIFSC;
    protected String remitterName;
    protected AddressType remitterAddress;
    protected ContactType remitterContact;
    @XmlElement(required = true)
    protected String beneficiaryName;
    protected AddressType beneficiaryAddress;
    protected ContactType beneficiaryContact;
    @XmlElement(required = true)
    protected String beneficiaryAccountNo;
    @XmlElement(required = true)
    protected String beneficiaryIFSC;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType transferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType transferCurrencyCode;
    @XmlElement(required = true)
    protected BigDecimal transferAmount;
    @XmlElement(required = true)
    protected String remitterToBeneficiaryInfo;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uniqueRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRequestNo() {
        return uniqueRequestNo;
    }

    /**
     * Sets the value of the uniqueRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRequestNo(String value) {
        this.uniqueRequestNo = value;
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the debitAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccountNo() {
        return debitAccountNo;
    }

    /**
     * Sets the value of the debitAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccountNo(String value) {
        this.debitAccountNo = value;
    }

    /**
     * Gets the value of the remitterAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterAccountNo() {
        return remitterAccountNo;
    }

    /**
     * Sets the value of the remitterAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterAccountNo(String value) {
        this.remitterAccountNo = value;
    }

    /**
     * Gets the value of the remitterIFSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterIFSC() {
        return remitterIFSC;
    }

    /**
     * Sets the value of the remitterIFSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterIFSC(String value) {
        this.remitterIFSC = value;
    }

    /**
     * Gets the value of the remitterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterName() {
        return remitterName;
    }

    /**
     * Sets the value of the remitterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterName(String value) {
        this.remitterName = value;
    }

    /**
     * Gets the value of the remitterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRemitterAddress() {
        return remitterAddress;
    }

    /**
     * Sets the value of the remitterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRemitterAddress(AddressType value) {
        this.remitterAddress = value;
    }

    /**
     * Gets the value of the remitterContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getRemitterContact() {
        return remitterContact;
    }

    /**
     * Sets the value of the remitterContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setRemitterContact(ContactType value) {
        this.remitterContact = value;
    }

    /**
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the beneficiaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    /**
     * Sets the value of the beneficiaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBeneficiaryAddress(AddressType value) {
        this.beneficiaryAddress = value;
    }

    /**
     * Gets the value of the beneficiaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getBeneficiaryContact() {
        return beneficiaryContact;
    }

    /**
     * Sets the value of the beneficiaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setBeneficiaryContact(ContactType value) {
        this.beneficiaryContact = value;
    }

    /**
     * Gets the value of the beneficiaryAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryAccountNo() {
        return beneficiaryAccountNo;
    }

    /**
     * Sets the value of the beneficiaryAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryAccountNo(String value) {
        this.beneficiaryAccountNo = value;
    }

    /**
     * Gets the value of the beneficiaryIFSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIFSC() {
        return beneficiaryIFSC;
    }

    /**
     * Sets the value of the beneficiaryIFSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIFSC(String value) {
        this.beneficiaryIFSC = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypeType }
     *     
     */
    public TransferTypeType getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypeType }
     *     
     */
    public void setTransferType(TransferTypeType value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTransferCurrencyCode() {
        return transferCurrencyCode;
    }

    /**
     * Sets the value of the transferCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTransferCurrencyCode(CurrencyCodeType value) {
        this.transferCurrencyCode = value;
    }

    /**
     * The amount to be transferred. 
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmount(BigDecimal value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the remitterToBeneficiaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterToBeneficiaryInfo() {
        return remitterToBeneficiaryInfo;
    }

    /**
     * Sets the value of the remitterToBeneficiaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterToBeneficiaryInfo(String value) {
        this.remitterToBeneficiaryInfo = value;
    }

}
