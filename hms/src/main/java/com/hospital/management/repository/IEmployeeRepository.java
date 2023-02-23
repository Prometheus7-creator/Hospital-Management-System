package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
