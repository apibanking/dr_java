
package com.quantiguous.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numDebits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="numCredits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="closingBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numTransactions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="transactionsArray" type="{http://www.quantiguous.com/services}transactionsArrayType" minOccurs="0"/>
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
    "openingBalance",
    "numDebits",
    "numCredits",
    "closingBalance",
    "numTransactions",
    "transactionsArray"
})
@XmlRootElement(name = "getTransactionsResponse")
public class GetTransactionsResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected BigDecimal openingBalance;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numDebits;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numCredits;
    @XmlElement(required = true)
    protected BigDecimal closingBalance;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numTransactions;
    protected TransactionsArrayType transactionsArray;

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
     * Gets the value of the openingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    /**
     * Sets the value of the openingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpeningBalance(BigDecimal value) {
        this.openingBalance = value;
    }

    /**
     * Gets the value of the numDebits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDebits() {
        return numDebits;
    }

    /**
     * Sets the value of the numDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDebits(BigInteger value) {
        this.numDebits = value;
    }

    /**
     * Gets the value of the numCredits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumCredits() {
        return numCredits;
    }

    /**
     * Sets the value of the numCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumCredits(BigInteger value) {
        this.numCredits = value;
    }

    /**
     * Gets the value of the closingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    /**
     * Sets the value of the closingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClosingBalance(BigDecimal value) {
        this.closingBalance = value;
    }

    /**
     * Gets the value of the numTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumTransactions() {
        return numTransactions;
    }

    /**
     * Sets the value of the numTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumTransactions(BigInteger value) {
        this.numTransactions = value;
    }

    /**
     * Gets the value of the transactionsArray property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsArrayType }
     *     
     */
    public TransactionsArrayType getTransactionsArray() {
        return transactionsArray;
    }

    /**
     * Sets the value of the transactionsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsArrayType }
     *     
     */
    public void setTransactionsArray(TransactionsArrayType value) {
        this.transactionsArray = value;
    }

}
