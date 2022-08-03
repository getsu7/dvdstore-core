package com.mycompany.dvdstore.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.entity.Movie;

public class MovieRepository {
    
    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }
}
