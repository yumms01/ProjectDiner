package com.example.tacademy.projectdiner;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-02-22.
 */
public class Other_Notice_Item {
    private Drawable icon;
    private String name;

    public Other_Notice_Item (Drawable icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public Drawable getIcon() {
        return icon;
    }
}
