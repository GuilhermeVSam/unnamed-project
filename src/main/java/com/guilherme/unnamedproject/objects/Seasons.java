package com.guilherme.unnamedproject.objects;

public class Seasons {
    int episodes;
    String name;

    public Seasons(int episodes, String name) {
        this.episodes = episodes;
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
