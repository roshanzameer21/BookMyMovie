package com.bookmymovie.dao;

import com.bookmymovie.entity.Movie;

import java.util.List;

public interface BookMyMovieDao {

    public List<Movie> movieList();

    public void addMovie(Movie movie);
}
