package com.springboot.myapp.service;

import com.springboot.myapp.dto.AddUpdateAdminUserDto;
import com.springboot.myapp.exception.CustomException;

import jakarta.validation.Valid;

public interface AdminService {

	void addUpdateAdminUser(@Valid AddUpdateAdminUserDto addUpdateAdminUserDto) throws CustomException;

	Object getAdminUserByUserId(Integer userId);

	Object getAdminUser(Integer page, Integer limit);

}
