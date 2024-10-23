package com.guilherme.unnamedproject.objects;

import java.util.List;

public abstract class Content {
    String name;
    String autor;
    String description;
    int year;
    List<String> genre;
    String rating;

    public Content(String name, String autor, String description, int year, List<String> genre, String rating) {
        this.name = name;
        this.autor = autor;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
