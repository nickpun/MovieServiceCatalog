package com.myApp.MovieServiceCatalog.service.Impl;

import com.myApp.MovieServiceCatalog.dao.UserDao;
import com.myApp.MovieServiceCatalog.model.Movie;
import com.myApp.MovieServiceCatalog.model.User;
import com.myApp.MovieServiceCatalog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Optional<List<Movie>> getMoviesByUserId(long id) {
        Optional<List<Movie>> opMovies = Optional.empty();
        Optional<User> opUser = userDao.findById(id);
        if (opUser.isPresent()) {
            opMovies = Optional.of(opUser.get().getMovies());
        }
        return opMovies;
    }

    public void addUser(User user) {
        userDao.save(user);
    }
}
