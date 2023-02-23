package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.entity.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Long> {
	
}
