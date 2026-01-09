package com.bookmymovie.service;

import com.bookmymovie.dao.BookMyMovieDao;
import com.bookmymovie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookMyMovieServiceImpl implements BookMyMovieService{

    @Autowired
    private BookMyMovieDao bookMyMovieDao;
    @Override
    public List<Movie> movieList() {
        return bookMyMovieDao.movieList();
    }

    @Override
    public void addMovie(Movie movie) {
        bookMyMovieDao.addMovie(movie);
    }
}
