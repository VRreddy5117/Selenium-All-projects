package com.comparing.json;

public class ShoppingList {

    private int id;
    private String label;
    private boolean current;
    private int nb_reference;
    public ShoppingList () {
    }

    public ShoppingList(int id, String label, boolean current, int nb_reference) {
        this.id = id;
        this.label = label;
        this.current = current;
        this.nb_reference = nb_reference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getNb_reference() {
        return nb_reference;
    }

    public void setNb_reference(int nb_reference) {
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

