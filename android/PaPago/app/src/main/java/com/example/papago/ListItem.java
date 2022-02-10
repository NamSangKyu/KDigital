package com.example.papago;

import android.graphics.drawable.Drawable;

public class ListItem {
    private Drawable imgLang;
    private String code;

    public Drawable getImgLang() {
        return imgLang;
    }

    public void setImgLang(Drawable imgLang) {
        this.imgLang = imgLang;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListItem(Drawable imgLang, String code) {
        this.imgLang = imgLang;
        this.code = code;
    }
}
