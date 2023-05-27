package com.springboot.myapp.service;

import com.springboot.myapp.dto.AddUpdateAdminUserDto;

import jakarta.validation.Valid;

public interface AdminService {

	void addUpdateAdminUser(@Valid AddUpdateAdminUserDto addUpdateAdminUserDto);

}
