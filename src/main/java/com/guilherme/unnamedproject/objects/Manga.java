package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Manga extends Content {
    String studio;
    Seasons volumes;

    public Manga(String name, String autor, String description, int year, List<String> genre, String rating, String studio, Seasons volumes) {
        super(name, autor, description, year, genre, rating);
        this.studio = studio;
        this.volumes = volumes;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Seasons getVolumes() {
        return volumes;
    }

    public void setVolumes(Seasons volumes) {
        this.volumes = volumes;
    }
}
