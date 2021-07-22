package com.example.bttt.Ngay_217.Rcv3_horizontal;

public class MatHang {
    String imgUrl,tensp, discount,beforeDis,afterDis;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
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

    public MatHang(String imgUrl, String tensp, String discount, String beforeDis, String afterDis) {
        this.imgUrl = imgUrl;
        this.tensp = tensp;
        this.discount = discount;
        this.beforeDis = beforeDis;
        this.afterDis = afterDis;
    }

    public MatHang() {
    }
}
