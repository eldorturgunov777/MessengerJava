package com.example.messengerjava.model;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class Chat_vertical {
    int img;
    String fullName;
    String desc;
    Boolean online;

    public Chat_vertical(int img, String fullName, String desc, Boolean online) {
        this.img = img;
        this.fullName = fullName;
        this.desc = desc;
        this.online = online;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
