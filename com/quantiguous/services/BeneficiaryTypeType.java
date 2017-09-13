
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beneficiaryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="beneficiaryTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "beneficiaryTypeType")
@XmlEnum
public enum BeneficiaryTypeType {

    I,
    C;

    public String value() {
        return name();
    }

    public static BeneficiaryTypeType fromValue(String v) {
        return valueOf(v);
    }

}
