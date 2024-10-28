package com.guilherme.unnamedproject.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie{
    @JsonProperty("Title")
    String title;
    @JsonProperty("Director")
    String director;
    @JsonProperty("Plot")
    String plot;
    @JsonProperty("Year")
    int year;
    @JsonProperty("Genre")
    String genre;
    @JsonProperty("imdbRating")
    String rating;
    @JsonProperty("Awards")
    String awards;    

    public Movie(String title, String director, String description, int year, String genre, String rating, String awards) {
        this.title = title;
        this.director = director;
        this.plot = description;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.awards = awards;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
