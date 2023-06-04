package com.springboot.myapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.myapp.entity.admin.AdminUserEntity;
import com.springboot.myapp.query.AdminQueryMetaData;
import com.springboot.myapp.repository.dto.AdminUserRepoDto;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUserEntity, Integer> {

	@Query(value=AdminQueryMetaData.GET_USER_BY_USER_ID, nativeQuery=true)
	AdminUserRepoDto getAdminUserByUserId(Integer userId);

	@Query(value=AdminQueryMetaData.GET_USER_DTL, countQuery = AdminQueryMetaData.GET_USER_DTL_COUNT ,nativeQuery=true)
	Page<AdminUserRepoDto> getAdminUser(Pageable paging);

	

}
