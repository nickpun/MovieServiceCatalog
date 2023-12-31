package com.myApp.MovieServiceCatalog.controller;

import com.myApp.MovieServiceCatalog.entity.Movie;
import com.myApp.MovieServiceCatalog.service.Impl.MovieServiceImpl;
import com.myApp.MovieServiceCatalog.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path = "/movies/user/{userId}")
    public ResponseEntity<List<Movie>> getMoviesByUserId(@PathVariable("userId") long id) {
        Optional<List<Movie>> movies = userService.getMoviesByUserId(id);
        if (movies.isPresent()) {
            return new ResponseEntity<>(movies.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/movies/movie/{movieId}")
    public ResponseEntity<Movie> getMovieByMovieId(@PathVariable("movieId") long id) {
        Optional<Movie> movie = movieService.getMovieByMovieId(id);
        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/add/newMovie", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

}
