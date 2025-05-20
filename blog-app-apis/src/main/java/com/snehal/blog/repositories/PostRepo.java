package com.snehal.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.blog.entities.Category;
import com.snehal.blog.entities.Post;
import com.snehal.blog.entities.User;



public interface PostRepo extends JpaRepository<Post, Integer> {
	
	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);

}
