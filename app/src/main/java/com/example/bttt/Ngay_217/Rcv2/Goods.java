package com.example.bttt.Ngay_217.Rcv2;

public class Goods {
    String imgUrl, ten, discountPercentage, beforeDis, afterDis;
    int status1;

    public Goods() {
    }

    public Goods(String imgUrl, String ten, String discountPercentage, String beforeDis, String afterDis, int status1) {
        this.imgUrl = imgUrl;
        this.ten = ten;
        this.discountPercentage = discountPercentage;
        this.beforeDis = beforeDis;
        this.afterDis = afterDis;
        this.status1 = status1;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getBeforeDis() {
        return beforeDis;
    }

    public void setBeforeDis(String beforeDis) {
        this.beforeDis = beforeDis;
    }

    public String getAfterDis() {
        return afterDis;
    }

    public void setAfterDis(String afterDis) {
        this.afterDis = afterDis;
    }

    public int getStatus1() {
        return status1;
    }

    public void setStatus1(int status1) {
        this.status1 = status1;
    }
}
