package com.furiouskitten.amiel.solidarity.Models;

public class MainMenuModel {

    private int mMainMenuImage;
    private String mMainMenuTitle;
    private String mMainMenuDescription;
    private String mMainMenuButtonName;

    public MainMenuModel(int mainMenuImage, String mainMenuTitle, String mainMenuDescription, String mainMenuButtonName) {
        mMainMenuImage = mainMenuImage;
        mMainMenuTitle = mainMenuTitle;
        mMainMenuDescription = mainMenuDescription;
        mMainMenuButtonName = mainMenuButtonName;
    }

    public int getMainMenuImage() {
        return mMainMenuImage;
    }

    public void setMainMenuImage(int mainMenuImage) {
        mMainMenuImage = mainMenuImage;
    }

    public String getMainMenuTitle() {
        return mMainMenuTitle;
    }

    public void setMainMenuTitle(String mainMenuTitle) {
        mMainMenuTitle = mainMenuTitle;
    }

    public String getMainMenuDescription() {
        return mMainMenuDescription;
    }

    public void setMainMenuDescription(String mainMenuDescription) {
        mMainMenuDescription = mainMenuDescription;
    }

    public String getMainMenuButtonName() {
        return mMainMenuButtonName;
    }

    public void setMainMenuButtonName(String mainMenuButtonName) {
        mMainMenuButtonName = mainMenuButtonName;
    }
}