package com.myApp.MovieServiceCatalog.dao;

import java.util.List;

import com.myApp.MovieServiceCatalog.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie, Long> {


}
