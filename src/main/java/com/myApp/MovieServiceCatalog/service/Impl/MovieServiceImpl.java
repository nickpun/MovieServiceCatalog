package com.myApp.MovieServiceCatalog.service.Impl;

import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl {

    @Autowired
    private MovieDao movieDao;

    public Optional<Movie> getMovieByMovieId(long id) {
        return movieDao.findById(id);
    }

    public void addMovie(Movie movie) {
        movieDao.save(movie);
    }
}
