package com.springboot.myapp.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.myaap.utils.CommonResponse;
import com.springboot.myaap.utils.ResponseUtil;
import com.springboot.myapp.dto.AddUpdateAdminUserDto;
import com.springboot.myapp.exception.CustomException;
import com.springboot.myapp.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminUserController {

	@Autowired
	AdminService adminService;

	@PostMapping(value = "/add-user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object addUpdateUser(@Valid @RequestBody AddUpdateAdminUserDto addUpdateAdminUserDto)
			throws CustomException {
		adminService.addUpdateAdminUser(addUpdateAdminUserDto);
		return true;

	}

	@GetMapping("/get-string")
	public Object getString() {
		return "yashveer.sisodia";
	}

	@GetMapping("/common-response")
	ResponseEntity<CommonResponse> getCommonResponseExample() {

		return new ResponseEntity<>(ResponseUtil.prepareSuccessResponse("common response"), HttpStatus.OK);

	}

	@GetMapping("/admin-user/{userId}")
	ResponseEntity<CommonResponse> getAdminUserByUserId(@PathVariable("userId") Integer userId) {

		return new ResponseEntity<>(ResponseUtil.prepareSuccessResponse(adminService.getAdminUserByUserId(userId)), HttpStatus.OK);

	}
}
