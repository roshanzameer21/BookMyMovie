package com.bookmymovie.repository;

import com.bookmymovie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMyMovieRepository extends JpaRepository<Movie, Long> {
}
