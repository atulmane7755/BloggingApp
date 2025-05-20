package com.snehal.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	
	private Integer categoryId;
	
	@NotEmpty
	@Size(min=3,max=10)
	private String categoryTitle;
	
	@NotEmpty
	@Size(min=4, max=100)
	private String categoryDescription;
}
