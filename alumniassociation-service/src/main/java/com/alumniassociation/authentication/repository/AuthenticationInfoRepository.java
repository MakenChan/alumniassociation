package com.alumniassociation.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumniassociation.authentication.entity.AuthenticationInfo;

public interface AuthenticationInfoRepository extends JpaRepository<AuthenticationInfo, Integer> {
	public List<AuthenticationInfo> findByAuthenticatorId(Integer authenticatorId);
}
