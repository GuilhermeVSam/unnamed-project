package com.guilherme.unnamedproject.entity;

import java.util.Date;

public class Review {
    private int rating;
    private String comment;
    private String username;
    private Date date;

    public Review(int rating, String comment, String username, Date date) {
        this.rating = rating;
        this.comment = comment;
        this.username = username;
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}