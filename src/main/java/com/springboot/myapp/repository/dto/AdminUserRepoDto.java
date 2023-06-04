package com.springboot.myapp.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface AdminUserRepoDto {

	@JsonProperty("user_id")
	Integer getUSER_ID(); 
	
	@JsonProperty("user_email")
	String getUSER_EMAIL();
	
	@JsonProperty("first_name")
	String getFIRST_NAME();
	
	@JsonProperty("last_name")
	String getLAST_NAME();
	
	@JsonProperty("mob")
	String getMOB();
	
	@JsonProperty("user_pass")
	String getUSER_PASS();
}
