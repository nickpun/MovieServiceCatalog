package com.myApp.MovieServiceCatalog.service;

import com.myApp.MovieServiceCatalog.model.Movie;

import java.util.Optional;

public interface MovieService {

    public Optional<Movie> getMovieByMovieId(long id);

    public void addMovie(Movie movie);
}
