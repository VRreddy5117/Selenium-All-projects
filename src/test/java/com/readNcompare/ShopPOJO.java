package com.readNcompare;

public class ShopPOJO {
    private long id;
    private String label;
    private boolean current;
    private long nb_reference;

    public ShopPOJO () {
    }

    public ShopPOJO(long id, String label, boolean current, long nb_reference) {
        this.id = id;
        this.label = label;
        this.current = current;
        this.nb_reference = nb_reference;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public long getNb_reference() {
        return nb_reference;
    }

    public void setNb_reference(long nb_reference) {
        this.nb_reference = nb_reference;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", current=" + current +
                ", nb_reference=" + nb_reference +
                '}';
    }
}
