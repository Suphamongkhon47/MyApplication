package com.example.myapplication1;

public class Item {

    String name;
    String price;
    String detailss;
    int image;


    public Item(String name, String price, String detailss, int image) {
        this.name = name;
        this.price = price;
        this.detailss = detailss;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public String getDetailss() {return detailss;}

    public void setDetailss(String details) {
        this.detailss = details;
    }

    public void setPrice(String email) {
        this.price = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
