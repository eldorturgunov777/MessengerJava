package com.example.messengerjava.model;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class SecondModel {
    int img;
    int imgVertical;
    String title;
    int desc;

    public SecondModel(int img, int imgVertical, String title, int desc) {
        this.img = img;
        this.imgVertical = imgVertical;
        this.title = title;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImgVertical() {
        return imgVertical;
    }

    public void setImgVertical(int imgVertical) {
        this.imgVertical = imgVertical;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }
}
