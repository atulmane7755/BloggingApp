package com.snehal.blog.repositories;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.snehal.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
	

}
