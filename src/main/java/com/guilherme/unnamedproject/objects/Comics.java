package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Comics extends Content {
    String artist;
    Seasons seasons;
    
    public Comics(String name, String autor, String description, int year, List<String> genre, String rating, String artist, Seasons seasons) {
        super(name, autor, description, year, genre, rating);
        this.artist = artist;
        this.seasons = seasons;
    }

    public String getArtist() {
        return artist;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }
}
