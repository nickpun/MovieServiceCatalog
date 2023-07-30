package com.myApp.MovieServiceCatalog.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;

    @Column
    private String fullName;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "User_Movie",
            joinColumns = { @JoinColumn(name = "userId") },
            inverseJoinColumns = { @JoinColumn(name = "movieId") }
    )
    private List<Movie> movies;

    public User() {
    }

    public User(Long userId, String fullName) {
        this.userId = userId;
        this.fullName = fullName;
    }

    public User(Long userId, String fullName, List<Movie> movies) {
        this.userId = userId;
        this.fullName = fullName;
        this.movies = movies;
    }

    public Long getUserID() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
