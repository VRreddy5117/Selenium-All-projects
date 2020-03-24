package com.json.products;

public class prop65Obj {
    private String prop65WarningTypeCD;
    private String prop65WarningText;
    private boolean prop65WarningIconRequired;

    public prop65Obj () {
    }

    public prop65Obj(String prop65WarningTypeCD, String prop65WarningText, boolean prop65WarningIconRequired) {
        this.prop65WarningTypeCD = prop65WarningTypeCD;
        this.prop65WarningText = prop65WarningText;
        this.prop65WarningIconRequired = prop65WarningIconRequired;
    }

    public String getProp65WarningTypeCD() {
        return prop65WarningTypeCD;
    }

    public void setProp65WarningTypeCD(String prop65WarningTypeCD) {
        this.prop65WarningTypeCD = prop65WarningTypeCD;
    }

    public String getProp65WarningText() {
        return prop65WarningText;
    }

    public void setProp65WarningText(String prop65WarningText) {
        this.prop65WarningText = prop65WarningText;
    }

    public boolean isProp65WarningIconRequired() {
        return prop65WarningIconRequired;
    }

    public void setProp65WarningIconRequired(boolean prop65WarningIconRequired) {
        this.prop65WarningIconRequired = prop65WarningIconRequired;
    }

    @Override
    public String toString() {
        return "{" +
                "prop65WarningTypeCD='" + prop65WarningTypeCD + '\'' +
                ", prop65WarningText='" + prop65WarningText + '\'' +
                ", prop65WarningIconRequired=" + prop65WarningIconRequired +
                '}';
    }
}
