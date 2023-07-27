package com.myApp.MovieServiceCatalog.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer userId;

    @Column
    private String fullName;

    @Column
    private List<Movie> movies;

    public Integer getUserID() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
