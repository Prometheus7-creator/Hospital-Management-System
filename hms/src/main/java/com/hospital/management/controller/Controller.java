package com.hospital.management.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.entity.*;
import com.hospital.management.repository.*;

@RestController
public class Controller {
	@Autowired
	IEmployeeRepository empRepository;
	@Autowired
	IPatientRepository patientRepository;
	@Autowired
	IInvoiceRepository invoiceRepository;

	@GetMapping("/getEmployee/{id}")
	public String getEmployee(@PathVariable Long id) {
		Optional<Employee> emp = empRepository.findById(id);
		return (emp.isPresent()) ? "" + emp.get() : "Employee with id: " + id + " not found";
	}
	
	@PostMapping("insertEmployee")
	public String postEmployee(@RequestBody Employee emp) {
		empRepository.save(emp);
		return "Employee inserted successfully\n" + emp;
	}
	
	@PutMapping("updateEmployee")
	public String putEmployee(@RequestBody Employee emp) {
		Optional<Employee> obj = empRepository.findById(emp.getEid());
		
		if(obj.isPresent()) {
			Employee objToUpdate = obj.get();
			objToUpdate.setRole(emp.getRole());
			objToUpdate.setQualification(emp.getQualification());
			objToUpdate.setSalary(emp.getSalary());
			
			empRepository.save(objToUpdate);
			
			return "Employee updated successfully\n" + emp;
		}
		return "Unable to update employee\n" + emp;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		empRepository.deleteById(id);
		return "Employee with id: " + id + " deleted successfully";
	}
	
	@GetMapping("/getPatient/{id}")
	public String getPatient(@PathVariable Long id) {
		Optional<Patient> patient = patientRepository.findById(id);
		return (patient.isPresent()) ? "" + patient.get() : "Patient with id: " + id + " not found";
	}
	
	@PostMapping("insertPatient")
	public String postPatient(@RequestBody Patient patient) {
		patientRepository.save(patient);
		return "Patient inserted successfully\n" + patient;
	}
	
	@PutMapping("updatePatient")
	public String putPatient(@RequestBody Patient patient) {
		Optional<Patient> obj = patientRepository.findById(patient.getPid());
		
		if(obj.isPresent()) {
			Patient objToUpdate = obj.get();
			objToUpdate.setRegistrationDate(patient.getRegistrationDate());
			objToUpdate.setBloodGroup(patient.getBloodGroup());
			objToUpdate.setDoctorId(patient.getDoctorId());
			
			patientRepository.save(objToUpdate);
			
			return "Patient updated successfully\n" + patient;
		}
		return "Unable to update patient\n" + patient;
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable Long id) {
		patientRepository.deleteById(id);
		return "Patient with id: " + id + " deleted successfully";
	}
	
	@GetMapping("/getInvoice/{id}")
	public String getInvoice(@PathVariable Long id) {
		Optional<Invoice> invoice = invoiceRepository.findById(id);
		return (invoice.isPresent()) ? "" + invoice.get() : "Invoice with id: " + id + " not found";
	}
	
	@PostMapping("insertInvoice")
	public String postInvoice(@RequestBody Invoice invoice) {
		invoiceRepository.save(invoice);
		return "Invoice inserted successfully\n" + invoice;
	}
	
	@PutMapping("updateInvoice")
	public String putInvoice(@RequestBody Invoice invoice) {
		Optional<Invoice> obj = invoiceRepository.findById(invoice.getId());
		
		if(obj.isPresent()) {
			Invoice objToUpdate = obj.get();
			objToUpdate.setAmount(invoice.getAmount());
			objToUpdate.setPatientId(invoice.getPatientId());
			objToUpdate.setDate(invoice.getDate());
			
			invoiceRepository.save(objToUpdate);
			
			return "Invoice updated successfully\n" + invoice;
		}
		return "Unable to update invoice\n" + invoice;
	}
	
	@DeleteMapping("/deleteInvoice/{id}")
	public String deleteInvoice(@PathVariable Long id) {
		invoiceRepository.deleteById(id);
		return "Invoice with id: " + id + " deleted successfully";
	}
}
