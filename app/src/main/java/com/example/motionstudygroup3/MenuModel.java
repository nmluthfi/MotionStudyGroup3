package com.example.motionstudygroup3;

public class MenuModel {

    private String mNamaMenu, mDetailMenu;
    private int mHargaMenu;

    public MenuModel() {
    }

    public MenuModel(String mNamaMenu, String mDetailMenu, int mHargaMenu) {
        this.mNamaMenu = mNamaMenu;
        this.mDetailMenu = mDetailMenu;
        this.mHargaMenu = mHargaMenu;
    }

    public String getmNamaMenu() {
        return mNamaMenu;
    }

    public void setmNamaMenu(String mNamaMenu) {
        this.mNamaMenu = mNamaMenu;
    }

    public String getmDetailMenu() {
        return mDetailMenu;
    }

    public void setmDetailMenu(String mDetailMenu) {
        this.mDetailMenu = mDetailMenu;
    }

    public int getmHargaMenu() {
        return mHargaMenu;
    }

    public void setmHargaMenu(int mHargaMenu) {
        this.mHargaMenu = mHargaMenu;
    }
}