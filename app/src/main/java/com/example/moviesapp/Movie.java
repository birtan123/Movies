package com.example.moviesapp;

public class Movie {
    public int mImageResource;
    private String title, genre, year;

    public Movie() {
    }

    public Movie(int imageResource,String title, String genre, String year) {
        this.mImageResource=imageResource;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}