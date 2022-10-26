package com.thesis.mobiserve;

public class Product
{
    String title, des, price, img;

    public  Product (String title, String des, String price, String img){
        this.title = title;
        this.des = des;
        this.price = price;
        this.img = img;
    }

    public  String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public  String getDes(){
        return des;
    }

    public void setDes(String des){
        this.des = des;
    }

    public  String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public  String getImg(){
        return img;
    }

    public void setImg(String img){
        this.img = img;
    }
}
