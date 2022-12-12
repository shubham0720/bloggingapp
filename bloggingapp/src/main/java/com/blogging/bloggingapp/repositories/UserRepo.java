package com.blogging.bloggingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.bloggingapp.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
