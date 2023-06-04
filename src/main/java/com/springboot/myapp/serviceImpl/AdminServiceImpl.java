package com.springboot.myapp.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.springboot.myaap.utils.BcryptEncryptionUtil;
import com.springboot.myapp.dto.AddUpdateAdminUserDto;
import com.springboot.myapp.dto.PageableResponseDto;
import com.springboot.myapp.entity.admin.AdminUserEntity;
import com.springboot.myapp.exception.CustomException;
import com.springboot.myapp.repository.AdminUserRepository;
import com.springboot.myapp.repository.dto.AdminUserRepoDto;
import com.springboot.myapp.service.AdminService;

import jakarta.validation.Valid;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminUserRepository adminUserRepository;
	
//	
//	@Autowired
//	BcryptEncryptionUtil bcryptEncryptionUtil;


	@Override
	public void addUpdateAdminUser(@Valid AddUpdateAdminUserDto addUpdateAdminUserDto) throws CustomException {

		AdminUserEntity adminUserEntity = new AdminUserEntity();

		adminUserEntity.setUserId(addUpdateAdminUserDto.getUserId());
		adminUserEntity.setUserEmail(addUpdateAdminUserDto.getUserEmail());
		adminUserEntity.setFirstName(addUpdateAdminUserDto.getFirstName());
		adminUserEntity.setLastName(addUpdateAdminUserDto.getLastName());
		adminUserEntity.setMob(addUpdateAdminUserDto.getMob());
		
		BcryptEncryptionUtil bcryptEncryptionUtil = new BcryptEncryptionUtil(); 
		
		String hashedPass = bcryptEncryptionUtil.hashPassword(addUpdateAdminUserDto.getUserPass());
		
		System.out.println(hashedPass);
		adminUserEntity.setUserPass(hashedPass);
		adminUserRepository.save(adminUserEntity);

	}

	@Override
	public Object getAdminUserByUserId(Integer userId) {

		AdminUserRepoDto adminUserRepoDto = null;

		adminUserRepoDto = adminUserRepository.getAdminUserByUserId(userId);
		return adminUserRepoDto;
	}

	@Override
	public Object getAdminUser(Integer page, Integer limit) {
		
		PageableResponseDto PageableResponseDto = new PageableResponseDto(); 
		
		Pageable paging = PageRequest.of(page, limit);
		Page<AdminUserRepoDto> pagedResult = null;
		pagedResult = adminUserRepository.getAdminUser(paging);
		
		if(!ObjectUtils.isEmpty(pagedResult)) {
			PageableResponseDto.setTotalElements(pagedResult.getTotalElements());
			PageableResponseDto.setTotalPages(pagedResult.getTotalPages());	
			PageableResponseDto.setPage(pagedResult.getContent());
		} else {
			return new ArrayList<>();
		}
		
		return PageableResponseDto;
	}
	

}
