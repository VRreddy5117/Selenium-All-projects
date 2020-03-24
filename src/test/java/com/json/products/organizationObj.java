package com.json.products;

public class organizationObj {
    private String rogCd;
    private String divisionId;

    public organizationObj() {
    }

    public organizationObj(String rogCd, String divisionId) {
        this.rogCd = rogCd;
        this.divisionId = divisionId;
    }

    public String getRogCd() {
        return rogCd;
    }

    public void setRogCd(String rogCd) {
        this.rogCd = rogCd;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    @Override
    public String toString() {
        return "{" +
                "rogCd='" + rogCd + '\'' +
                ", divisionId='" + divisionId + '\'' +
                '}';
    }
}
