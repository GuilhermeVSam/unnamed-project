package com.guilherme.unnamedproject.objects;

import java.util.List;


public class Album extends Content {
    String producer;
    List<String> features;

    public Album(String name, String autor, String description, int year, List<String> genre, String rating, String producer, List<String> features) {
        super(name, autor, description, year, genre, rating);
        this.producer = producer;
        this.features = features;
    }

    public String getProducer() {
        return producer;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }
}
