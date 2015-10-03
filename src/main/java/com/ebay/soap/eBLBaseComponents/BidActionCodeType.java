
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="NotUsed"/>
 *     &lt;enumeration value="Retraction"/>
 *     &lt;enumeration value="AutoRetraction"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="AutoCancel"/>
 *     &lt;enumeration value="Absentee"/>
 *     &lt;enumeration value="BuyItNow"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="Counter"/>
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Decline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidActionCodeType")
@XmlEnum
public enum BidActionCodeType {


    /**
     * 
     * 						This value indicates that the action or state is unknown.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This value is used if a prospective buyer wants to bid on an auction listing. If this value is used, the prospective buyer must also include the <b>MaxBid</b> field in the <b>PlaceOffer</b> call and specify the maximum amount that they are willing to bid in an attempt to win the auction. eBay will automatically rebid on behalf of the buyer each time the buyer is outbid up until the time when their <b>MaxBid</b> value threshold is met.
     * 					
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("NotUsed")
    NOT_USED("NotUsed"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was retracted. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Retraction")
    RETRACTION("Retraction"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was automatically retracted. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("AutoRetraction")
    AUTO_RETRACTION("AutoRetraction"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was cancelled. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was automatically cancelled. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("AutoCancel")
    AUTO_CANCEL("AutoCancel"),

    /**
     * 
     * 						This value indicates that an absentee bid was made, which means that eBay made a bid on the auction listing on behalf of the buyer, who has set a maximum bid threshold. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Absentee")
    ABSENTEE("Absentee"),

    /**
     * 
     * 						This value indicates that the buyer purchased an item in an auction listing using the Buy It Now feature. This action can only be done on the eBay site, and not in the API. This value is not applicable for the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNow")
    BUY_IT_NOW("BuyItNow"),

    /**
     * 
     * 						The offer is being placed, or was placed, on a fixed-price listing.
     * 						This value is used for fixed-price listings to purchase an item.
     * 						In <b>PlaceOffer</b>, for auction listings with the Buy It Now option,
     * 						specify <code>Purchase</code> to buy the item.
     * 						In the case of fixed-price listings requiring immediate payment,
     * 						<b>PlaceOffer</b> cannot be used for purchase.
     * 					
     * 
     */
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						If an item is enabled with the Best Offer feature, a prospective buyer can use this value to make a Best Offer on the item, or a seller or buyer can use this value to make a counter offer.
     * 					
     * 
     */
    @XmlEnumValue("Offer")
    OFFER("Offer"),

    /**
     * 
     * 						If an item is best-offer enabled, use this value if a buyer is making a counteroffer
     * 						to a seller's counteroffer.
     * 					
     * 
     */
    @XmlEnumValue("Counter")
    COUNTER("Counter"),

    /**
     * 
     * 						If an item is best-offer enabled, use this value if a buyer is accepting a
     * 						counteroffer of a seller.
     * 					
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * 
     * 						If an item is best-offer enabled, use this value if a buyer is declining a
     * 						counteroffer of a seller.
     * 					
     * 
     */
    @XmlEnumValue("Decline")
    DECLINE("Decline");
    private final String value;

    BidActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidActionCodeType fromValue(String v) {
        for (BidActionCodeType c: BidActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
