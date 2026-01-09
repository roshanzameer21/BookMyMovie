package com.bookmymovie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookMyMovieController {

    @GetMapping("/appname")
    public String appName(){
        return "BookMyMovie";
    }
}
