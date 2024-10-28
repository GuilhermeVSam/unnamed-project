package com.guilherme.unnamedproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.unnamedproject.objects.Movie;
import com.guilherme.unnamedproject.services.MoviesService;

@RestController
@RequestMapping("/content")
public class MoviesController {
    private final MoviesService moviesService;

    public MoviesController(MoviesService moviesService){
        this.moviesService = moviesService;
    }

    @GetMapping("/movie/{name}")
    public Movie getMovie(@PathVariable String name){
        return moviesService.getMovieByName(name);
    }
}
