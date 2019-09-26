package com.alumniassociation.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumniassociation.operation.entity.OperationRecord;

public interface OperationRecordRepository extends JpaRepository<OperationRecord, Integer> {

}
