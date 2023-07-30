package com.myApp.MovieServiceCatalog.service.Impl;

import com.myApp.MovieServiceCatalog.repository.UserRepository;
import com.myApp.MovieServiceCatalog.entity.Movie;
import com.myApp.MovieServiceCatalog.entity.User;
import com.myApp.MovieServiceCatalog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<List<Movie>> getMoviesByUserId(long id) {
        Optional<List<Movie>> opMovies = Optional.empty();
        Optional<User> opUser = userRepository.findById(id);
        if (opUser.isPresent()) {
            opMovies = Optional.of(opUser.get().getMovies());
        }
        return opMovies;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
