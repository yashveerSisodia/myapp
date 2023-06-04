package com.springboot.myapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageableResponseDto {

	@JsonProperty("total_elements")
	Long totalElements;
	
	@JsonProperty("total_page")
	Integer totalPages;
	
	@JsonProperty("page")
	Object page;
}
