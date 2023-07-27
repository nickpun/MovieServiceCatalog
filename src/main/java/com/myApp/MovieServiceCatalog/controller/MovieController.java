package com.myApp.MovieServiceCatalog.controller;

import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.model.User;
import com.myApp.MovieServiceCatalog.service.MovieService;
import com.myApp.MovieServiceCatalog.service.UserService;
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
    private MovieService movieService;

    @Autowired
    private UserService userService;

    @GetMapping(path = "/movies/user/{userId}")
    public List<Movie> getMoviesByUserId(@PathVariable("userId") long id) {
        return userService.getMoviesByUserId(id);
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

    @PostMapping(path = "/add/newUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping(path = "/add/newMovie", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

}
