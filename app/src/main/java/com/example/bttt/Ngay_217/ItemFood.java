package com.example.bttt.Ngay_217;

public class ItemFood {
    String h1,h2,imgUrl;

    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ItemFood(String h1, String h2, String imgUrl) {
        this.h1 = h1;
        this.h2 = h2;
        this.imgUrl = imgUrl;
    }

    public ItemFood() {
    }
}
