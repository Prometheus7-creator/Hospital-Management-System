package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.entity.Hospital;

public interface IHospitalRepository extends JpaRepository<Hospital, Long> {
	
}
