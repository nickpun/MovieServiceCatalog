package com.myApp.MovieServiceCatalog.entity;

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

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "User_Movie",
            joinColumns = { @JoinColumn(name = "movieId") },
            inverseJoinColumns = { @JoinColumn(name = "userId") }
    )
    private List<User> users;

    public Movie() {
    }

    public Movie(Long movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

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
