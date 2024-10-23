package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Movie extends Content{
    List<String> whereToFind;
    List<String> oscar;
    

    public Movie(String name, String autor, String description, int year, List<String> genre, String rating, List<String> whereToFind, List<String> oscar) {
        super(name, autor, description, year, genre, rating);
        this.whereToFind = whereToFind;
        this.oscar = oscar;
    }

    public List<String> getWhereToFind() {
        return whereToFind;
    }
    
    public List<String> getOscar() {
        return oscar;
    }

    public void setWhereToFind(List<String> whereToFind) {
        this.whereToFind = whereToFind;
    }

    public void setOscar(List<String> oscar) {
        this.oscar = oscar;
    }
}
