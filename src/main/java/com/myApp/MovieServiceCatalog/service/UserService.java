package com.myApp.MovieServiceCatalog.service;

import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.model.User;

import java.util.List;

public interface UserService {

    public List<Movie> getMoviesByUserId(long id);

    public void addUser(User user);

}
