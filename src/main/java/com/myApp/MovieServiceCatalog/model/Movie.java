package com.myApp.MovieServiceCatalog.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long movieId;

    @Column
    private String movieName;

    @ManyToMany(mappedBy = "movies")
    private List<User> users;

    public Movie(Long movieId, String movieName, List<User> users) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.users = users;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<User> getUsers() {
        return users;
    }
}
