package com.myApp.MovieServiceCatalog.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer movieId;

    @Column
    private String movieName;

    @Column
    private List<User> users;

    public Integer getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<User> getUsers() {
        return users;
    }
}
