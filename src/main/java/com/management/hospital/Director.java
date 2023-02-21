package com.management.hospital;

public class Director {
	 private HospitalBuilder builder;
	 private EmployeeBuilder empBuilder;
	 private PatientBuilder patientBuilder;
	 private InvoiceBuilder invoiceBuilder;

	    public void makeGeneralHospital(HospitalBuilder builder){
	    	this.builder = builder;
	        this.builder.buildId();
	        this.builder.buildName();
	        this.builder.buildAddress();
	        this.builder.buildPhone();
	        this.builder.buildServices();
	    }

	    public void makeSpecialityHospital(HospitalBuilder builder){
	    	this.builder = builder;
	        this.builder.buildId();
	        this.builder.buildName();
	        this.builder.buildAddress();
	        this.builder.buildPhone();
	        this.builder.buildSpeciality();
	    }
	    
	    public void makeEmployee(EmployeeBuilder builder) {
	    	this.empBuilder = builder;
	    	this.empBuilder.buildEid();
	    	this.empBuilder.buildName();
	    	this.empBuilder.buildDob();
	    	this.empBuilder.buildGender();
	    	this.empBuilder.buildMobileNo();
	    	this.empBuilder.buildJoinDate();
	    	this.empBuilder.buildRole();
	    	this.empBuilder.buildQualification();
	    	this.empBuilder.buildSalary();
	    }
	    
	    public void makePatient(PatientBuilder builder) {
	    	this.patientBuilder = builder;
	    	this.patientBuilder.buildPid();
	    	this.patientBuilder.buildName();
	    	this.patientBuilder.buildDob();
	    	this.patientBuilder.buildGender();
	    	this.patientBuilder.buildMobileNo();
	    	this.patientBuilder.buildRegistrationDate();
	    	this.patientBuilder.buildBloodGroup();
	    	this.patientBuilder.buildDoctorId();
	    }
}
