package com.alumniassociation.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumniassociation.authentication.entity.CompanyAuthenticate;

public interface CompanyAuthenticateRepository extends JpaRepository<CompanyAuthenticate, Integer> {

}
