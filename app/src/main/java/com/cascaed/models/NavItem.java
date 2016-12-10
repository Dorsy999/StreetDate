package com.cascaed.models;

/**
 * Created by Oniji on 27/07/2016.
 */
public class NavItem {

    private String title;
    private String subTitle;
    private int resIcon;
    public NavItem(String title, String subTitle, int resIcon) {
        super();
        this.title = title;
        this.resIcon = resIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }
}
