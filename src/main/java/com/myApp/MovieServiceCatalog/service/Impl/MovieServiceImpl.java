package com.myApp.MovieServiceCatalog.service.Impl;

import com.myApp.MovieServiceCatalog.entity.Movie;
import com.myApp.MovieServiceCatalog.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl {

    @Autowired
    private MovieRepository movieRepository;

    public Optional<Movie> getMovieByMovieId(long id) {
        return movieRepository.findById(id);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
