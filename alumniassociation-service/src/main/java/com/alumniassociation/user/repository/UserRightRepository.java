package com.alumniassociation.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumniassociation.user.entity.UserRight;


public interface UserRightRepository extends JpaRepository<UserRight, Integer> {
	public List<UserRight> findByUserId(Integer userId);
}
