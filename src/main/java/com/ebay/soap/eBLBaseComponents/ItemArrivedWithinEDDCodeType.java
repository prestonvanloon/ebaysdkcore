
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemArrivedWithinEDDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemArrivedWithinEDDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EddQuestionWasNotAsked"/>
 *     &lt;enumeration value="BuyerDidntProvideAnswer"/>
 *     &lt;enumeration value="BuyerIndicatedItemArrivedWithinEDDRange"/>
 *     &lt;enumeration value="BuyerIndicatedItemNotArrivedWithinEDDRange"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemArrivedWithinEDDCodeType")
@XmlEnum
public enum ItemArrivedWithinEDDCodeType {


    /**
     * 
     * 						This value indicates that the question about the order line item arriving within the estimated delivery time was never surfaced to the buyer when the buyer left feedback for the transaction.
     * 					
     * 
     */
    @XmlEnumValue("EddQuestionWasNotAsked")
    EDD_QUESTION_WAS_NOT_ASKED("EddQuestionWasNotAsked"),

    /**
     * 
     * 						This value indicates that the question about the order line item arriving within the estimated delivery time was surfaced to the buyer, but the buyer did not answer this question when they left feedback for the transaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerDidntProvideAnswer")
    BUYER_DIDNT_PROVIDE_ANSWER("BuyerDidntProvideAnswer"),

    /**
     * 
     * 						This value indicates that the buyer indicated that the order line item did arrive within the estimated delivery date when they left feedback for the transaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerIndicatedItemArrivedWithinEDDRange")
    BUYER_INDICATED_ITEM_ARRIVED_WITHIN_EDD_RANGE("BuyerIndicatedItemArrivedWithinEDDRange"),

    /**
     * 
     * 						This value indicates that the buyer indicated that the order line item did not arrive within the estimated delivery date when they left feedback for the transaction.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b> A new "on-time shipping metric" will be a new component of Seller Standards beginning in February of 2016. On-time shipping will mean that the seller shipped the item before the "handling time" expired and/or the item was received by the buyer within the estimated delivery window, which is established once the buyer purchases or commits to buy the item. Previously, a seller's account could be dinged just for getting a low rating for the "shippping time" Detailed Seller Rating. </span>
     * 					
     * 
     */
    @XmlEnumValue("BuyerIndicatedItemNotArrivedWithinEDDRange")
    BUYER_INDICATED_ITEM_NOT_ARRIVED_WITHIN_EDD_RANGE("BuyerIndicatedItemNotArrivedWithinEDDRange"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemArrivedWithinEDDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemArrivedWithinEDDCodeType fromValue(String v) {
        for (ItemArrivedWithinEDDCodeType c: ItemArrivedWithinEDDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
