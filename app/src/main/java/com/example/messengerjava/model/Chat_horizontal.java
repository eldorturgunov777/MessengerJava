package com.example.messengerjava.model;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class Chat_horizontal {
    int img;
    String fullName;

    public Chat_horizontal(int img, String fullName) {
        this.img = img;
        this.fullName = fullName;
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
}
