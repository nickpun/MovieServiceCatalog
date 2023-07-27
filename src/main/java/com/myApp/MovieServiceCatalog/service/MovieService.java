package com.myApp.MovieServiceCatalog.service;

import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Optional<Movie> getMovieByMovieId(long id) {
        return movieDao.findById(id);
    }

    public void addMovie(Movie movie) {
        movieDao.save(movie);
    }
}
