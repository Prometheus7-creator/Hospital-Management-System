package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
	
}
