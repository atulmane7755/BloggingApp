package com.snehal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
