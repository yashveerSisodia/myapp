package com.springboot.myapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.springboot.myapp.dto.AddUpdateAdminUserDto;
import com.springboot.myapp.entity.admin.AdminUserEntity;
import com.springboot.myapp.exception.CustomException;
import com.springboot.myapp.repository.AdminUserRepository;
import com.springboot.myapp.service.AdminService;

import jakarta.validation.Valid;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminUserRepository adminUserRepository;

	@Override
	public void addUpdateAdminUser(@Valid AddUpdateAdminUserDto addUpdateAdminUserDto) throws CustomException {
		
		AdminUserEntity adminUserEntity = new AdminUserEntity();
		
		adminUserEntity.setUserId(addUpdateAdminUserDto.getUserId());
		adminUserEntity.setUserEmail(addUpdateAdminUserDto.getUserEmail());
		adminUserEntity.setFirstName(addUpdateAdminUserDto.getFirstName());
		adminUserEntity.setLastName(addUpdateAdminUserDto.getLastName());
		adminUserEntity.setMob(addUpdateAdminUserDto.getMob());
		adminUserRepository.save(adminUserEntity);
		
	}

}
