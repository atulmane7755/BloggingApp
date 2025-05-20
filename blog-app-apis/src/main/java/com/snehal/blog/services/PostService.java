package com.snehal.blog.services;

import java.util.List;

import com.snehal.blog.entities.Post;
import com.snehal.blog.payloads.PostDto;

public interface PostService {

	//create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update 
	
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);

	//get all posts
	
	List<Post> getAllPost();
	
	//get single post
	Post getPosyById(Integer postId);
	
	//get  post by category
	List<Post> getPostsByCategory(Integer categoryId);
	
	//get All post by user
	List<Post> getPostsByUser(Integer userId);
	
	//search posts
	List<Post> searchPosts(String keyword);
}
