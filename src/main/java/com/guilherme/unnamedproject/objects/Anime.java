package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Anime extends Content{
    String studio;
    Seasons seasons;
    List<String> whereToFind;

    public Anime(String name, String autor, String description, int year, List<String> genre, String rating, String studio, Seasons seasons, List<String> whereToFind) {
        super(name, autor, description, year, genre, rating);
        this.studio = studio;
        this.seasons = seasons;
        this.whereToFind = whereToFind;
    }

    public String getStudio() {
        return studio;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public List<String> getWhereToFind() {
        return whereToFind;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
