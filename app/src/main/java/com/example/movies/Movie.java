package com.example.movies;

public class Movie {
    private int image;
    private String title;
    private String rating;

    public Movie(int image, String title, String rating) {
        this.image = image;
        this.title = title;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }
}

