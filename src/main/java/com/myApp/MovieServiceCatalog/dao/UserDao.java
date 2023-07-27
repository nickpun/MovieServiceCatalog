package com.myApp.MovieServiceCatalog.dao;

import com.myApp.MovieServiceCatalog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {


}
