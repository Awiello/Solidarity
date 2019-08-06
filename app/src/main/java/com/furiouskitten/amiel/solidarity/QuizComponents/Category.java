package com.furiouskitten.amiel.solidarity.QuizComponents;

public class Category {
    public static final int CHAPTER_ONE = 1;
    public static final int CHAPTER_TWO  = 2;
    public static final int CHAPTER_THREE  = 3;
    public static final int CHAPTER_FOUR  = 4;
    public static final int CHAPTER_FIVE  = 5;
    public static final int CHAPTER_SIX  = 6;
    public static final int CHAPTER_SEVEN  = 7;
    public static final int CHAPTER_EIGHT  = 8;
    public static final int CHAPTER_NINE  = 9;
    public static final int CHAPTER_TEN  = 10;
    public static final int CHAPTER_ELEVEN  = 11;
    public static final int CHAPTER_TWELVE  = 12;
    public static final int CHAPTER_THIRTEEN  = 13;
    public static final int CHAPTER_FOURTEEN  = 14;
    public static final int CHAPTER_FIFTEEN  = 15;

    private int id;
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}