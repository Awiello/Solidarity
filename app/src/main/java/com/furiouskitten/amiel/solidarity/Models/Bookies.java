package com.furiouskitten.amiel.solidarity.Models;

public class Bookies {

    private String title;
    private String description;
    private int thumbnail;
    private int coverPhoto;


    public Bookies() {
    }


    public Bookies(String title,int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public Bookies(String title, String description, int thumbnail, int coverPhoto) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.coverPhoto = coverPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(int coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
}
