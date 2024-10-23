package com.guilherme.unnamedproject.objects;

import java.util.List;

public class Book extends Content {
    int ISBN;

    public Book(int ISBN, String name, String autor, String description, int year, List<String> genre, String rating, String studio)  {
        super(name, autor, description, year, genre, rating);
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
}
