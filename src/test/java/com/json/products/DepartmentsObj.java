package com.json.products;

public class DepartmentsObj {
    private String id;
    private String name;
    private String image;
    private String ShortDesc;

    public DepartmentsObj () {
    }

    public DepartmentsObj(String id, String name, String image, String shortDesc) {
        this.id = id;
        this.name = name;
        this.image = image;
        ShortDesc = shortDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShortDesc() {
        return ShortDesc;
    }

    public void setShortDesc(String shortDesc) {
        ShortDesc = shortDesc;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", ShortDesc='" + ShortDesc + '\'' +
                '}';
    }
}
