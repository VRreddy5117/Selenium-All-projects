package com.json.products;

public class promotionObj {
    private String promoDescription;
    private String promoEndDate;
    private String promoType;
    private String promoText;
    private long triggerQuantity;

    public promotionObj () {
    }

    public promotionObj(String promoDescription, String promoEndDate, String promoType, String promoText, long triggerQuantity) {
        this.promoDescription = promoDescription;
        this.promoEndDate = promoEndDate;
        this.promoType = promoType;
        this.promoText = promoText;
        this.triggerQuantity = triggerQuantity;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromoEndDate() {
        return promoEndDate;
    }

    public void setPromoEndDate(String promoEndDate) {
        this.promoEndDate = promoEndDate;
    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public long getTriggerQuantity() {
        return triggerQuantity;
    }

    public void setTriggerQuantity(long triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }

    @Override
    public String toString() {
        return "{" +
                "promoDescription='" + promoDescription + '\'' +
                ", promoEndDate='" + promoEndDate + '\'' +
                ", promoType='" + promoType + '\'' +
                ", promoText='" + promoText + '\'' +
                ", triggerQuantity=" + triggerQuantity +
                '}';
    }
}
