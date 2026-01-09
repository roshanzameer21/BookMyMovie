package com.bookmymovie.service;

import com.bookmymovie.entity.Movie;

import java.util.List;

public interface BookMyMovieService {

    public List<Movie> movieList();

    public void addMovie(Movie movie);
}
