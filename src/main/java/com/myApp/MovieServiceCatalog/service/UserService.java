package com.myApp.MovieServiceCatalog.service;

import com.myApp.MovieServiceCatalog.entity.Movie;
import com.myApp.MovieServiceCatalog.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public Optional<List<Movie>> getMoviesByUserId(long id);

    public void addUser(User user);

}
