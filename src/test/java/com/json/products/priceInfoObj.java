package com.json.products;

public class priceInfoObj {
            private String price;
            private String basePrice;
            private String pricePer;
            private String sellByWeight;
            private String averageWeight;
            private String maxWeight;

            public priceInfoObj () {
            }

    public priceInfoObj(String price, String basePrice, String pricePer, String sellByWeight, String averageWeight, String maxWeight) {
        this.price = price;
        this.basePrice = basePrice;
        this.pricePer = pricePer;
        this.sellByWeight = sellByWeight;
        this.averageWeight = averageWeight;
        this.maxWeight = maxWeight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getPricePer() {
        return pricePer;
    }

    public void setPricePer(String pricePer) {
        this.pricePer = pricePer;
    }

    public String getSellByWeight() {
        return sellByWeight;
    }

    public void setSellByWeight(String sellByWeight) {
        this.sellByWeight = sellByWeight;
    }

    public String getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(String averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "{" +
                "price='" + price + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", pricePer='" + pricePer + '\'' +
                ", sellByWeight='" + sellByWeight + '\'' +
                ", averageWeight='" + averageWeight + '\'' +
                ", maxWeight='" + maxWeight + '\'' +
                '}';
    }
}
