package com.bookmymovie.dao;

import com.bookmymovie.entity.Movie;
import com.bookmymovie.repository.BookMyMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookMyMovieDaoImpl implements BookMyMovieDao{

    @Autowired
    private BookMyMovieRepository bookMyMovieRepository;
    @Override
    public List<Movie> movieList() {
        return bookMyMovieRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        bookMyMovieRepository.save(movie);
    }
}
