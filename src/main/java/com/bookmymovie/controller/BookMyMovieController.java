package com.bookmymovie.controller;

import com.bookmymovie.entity.Movie;
import com.bookmymovie.service.BookMyMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmymovie")
public class BookMyMovieController {
    @Autowired
    private BookMyMovieService bookMyMovieService;

    @GetMapping("/appname")
    public String appName(){
        return "BookMyMovie";
    }

    @GetMapping("/movielist")
    public List<Movie> movieList(){
        return bookMyMovieService.movieList();
    }

    @PostMapping("/addmovie")
    public void addMovie(@RequestBody Movie movie){
        bookMyMovieService.addMovie(movie);
    }
}
