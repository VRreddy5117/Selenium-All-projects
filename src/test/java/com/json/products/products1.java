package com.json.products;

public class products1 {
    private String id;
    private String storeId;
    private String bpnId;
    private String primaryUpc;
    private String offerType;
    private String name;
    private String imageUrl;
    private String displayType;
    private String unitOfMeasure;
    private long restrictedValue;
    private String salesRank;
    private String zonecode;
    private String unitQuantity;
    private String enrichmentDesc;
    private String productErrors;


    public products1() {
    }
    public products1(String id, String storeId, String bpnId, String primaryUpc, String offerType, String name, String imageUrl,
                     String displayType, String unitOfMeasure, long restrictedValue, String salesRank, String zonecode,
                     String unitQuantity, String enrichmentDesc, String productErrors) {
        this.id = id;
        this.storeId = storeId;
        this.bpnId = bpnId;
        this.primaryUpc = primaryUpc;
        this.offerType = offerType;
        this.name = name;
        this.imageUrl = imageUrl;
        this.displayType = displayType;
        this.unitOfMeasure = unitOfMeasure;
        this.restrictedValue = restrictedValue;
        this.salesRank = salesRank;
        this.zonecode = zonecode;
        this.unitQuantity = unitQuantity;
        this.enrichmentDesc = enrichmentDesc;
        this.productErrors = productErrors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getBpnId() {
        return bpnId;
    }

    public void setBpnId(String bpnId) {
        this.bpnId = bpnId;
    }

    public String getPrimaryUpc() {
        return primaryUpc;
    }

    public void setPrimaryUpc(String primaryUpc) {
        this.primaryUpc = primaryUpc;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public long getRestrictedValue() {
        return restrictedValue;
    }

    public void setRestrictedValue(long restrictedValue) {
        this.restrictedValue = restrictedValue;
    }

    public String getSalesRank() {
        return salesRank;
    }

    public void setSalesRank(String salesRank) {
        this.salesRank = salesRank;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode;
    }

    public String getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(String unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public String getEnrichmentDesc() {
        return enrichmentDesc;
    }

    public void setEnrichmentDesc(String enrichmentDesc) {
        this.enrichmentDesc = enrichmentDesc;
    }

    public String getProductErrors() {
        return productErrors;
    }

    public void setProductErrors(String productErrors) {
        this.productErrors = productErrors;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", storeId='" + storeId + '\'' +
                ", bpnId='" + bpnId + '\'' +
                ", primaryUpc='" + primaryUpc + '\'' +
                ", offerType='" + offerType + '\'' +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", displayType='" + displayType + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", restrictedValue=" + restrictedValue +
                ", salesRank='" + salesRank + '\'' +
                ", zonecode='" + zonecode + '\'' +
                ", unitQuantity='" + unitQuantity + '\'' +
                ", enrichmentDesc='" + enrichmentDesc + '\'' +
                ", productErrors='" + productErrors + '\'' +
                '}';
    }
}
