package com.springboot.myapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUpdateAdminUserDto {

//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Long getMob() {
//		return mob;
//	}
//
//	public void setMob(Long mob) {
//		this.mob = mob;
//	}

	@NotNull(message="user id can not be null")
	@JsonProperty("user_id")
	private Integer userId;
	
	@NotBlank(message="user email can not be blank")
	@JsonProperty("user_email")
	private String userEmail;
	
	@NotBlank(message="first name can not be blank")
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("mob")
	private Long mob;
	
	@JsonProperty("user_pass")
	private String userPass;
}
