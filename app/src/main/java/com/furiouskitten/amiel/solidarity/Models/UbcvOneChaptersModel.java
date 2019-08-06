package com.furiouskitten.amiel.solidarity.Models;

public class UbcvOneChaptersModel {

    //image
    int mChapterImage;
    //title
    private String mChapterTitle;


    public UbcvOneChaptersModel(int chapterImage, String chapterTitle) {
        mChapterImage = chapterImage;
        mChapterTitle = chapterTitle;

    }

    public int getChapterImage() {
        return mChapterImage;
    }

    public void setChapterImage(int chapterImage) {
        mChapterImage = chapterImage;
    }

    public String getChapterTitle() {
        return mChapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        mChapterTitle = chapterTitle;
    }
    
}
