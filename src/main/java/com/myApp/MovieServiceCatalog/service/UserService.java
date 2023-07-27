package com.myApp.MovieServiceCatalog.service;

import com.myApp.MovieServiceCatalog.dao.UserDao;
import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<Movie> getMoviesByUserId(long id) {
        List<Movie> movies = new ArrayList<>();
        Optional<User> op = userDao.findById(id);
        if (op.isPresent()) {
            movies = op.get().getMovies();
        }
        return movies;
    }

    public void addUser(User user) {
        userDao.save(user);
    }
}
