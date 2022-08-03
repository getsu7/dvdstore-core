package com.mycompany.dvdstore;

import java.util.Scanner;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Please enter the movie title: ");
        Scanner sc = new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println("Please enter the movie category: ");
        String movieCategory = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setCategory(movieCategory);
        sc.close();
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
