package com.springboot.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.myapp.entity.admin.AdminUserEntity;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUserEntity, Integer> {

}
