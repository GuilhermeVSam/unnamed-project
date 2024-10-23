package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Series extends Content{
    List<String> whereToFind;
    Seasons seasons;

    public Series(String name, String autor, String description, int year, List<String> genre, String rating, List<String> whereToFind, Seasons seasons) {
        super(name, autor, description, year, genre, rating);
        this.whereToFind = whereToFind;
        this.seasons = seasons;
    }

    public List<String> getWhereToFind() {
        return whereToFind;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setWhereToFind(List<String> whereToFind) {
        this.whereToFind = whereToFind;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }
    
}
