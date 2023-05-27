package com.springboot.myapp.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.myapp.dto.AddUpdateAdminUserDto;
import com.springboot.myapp.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminUserController {

	@Autowired
	AdminService adminService;
	
	@PostMapping(value="/add-user",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Object addUpdateUser(@Valid @RequestBody AddUpdateAdminUserDto addUpdateAdminUserDto) {
		adminService.addUpdateAdminUser(addUpdateAdminUserDto);
		return true;
		
	}
}
