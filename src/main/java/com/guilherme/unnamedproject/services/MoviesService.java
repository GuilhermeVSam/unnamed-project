package com.guilherme.unnamedproject.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.guilherme.unnamedproject.objects.Movie;

@Service
public class MoviesService {
    private final RestTemplate restTemplate;

    @Autowired
    public MoviesService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    
    public Movie getMovieByName(String name){
        String url = "https://www.omdbapi.com/?t=" + name + "&apikey={$OMDB_API_KEY}";
        return restTemplate.getForObject(url, Movie.class);
    }
}
