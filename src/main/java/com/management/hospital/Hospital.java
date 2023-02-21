package com.management.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital{
    private String id;
    private String name;
    private String address;
    private String phone;
    private List<String> services;
    private String speciality;
    private List<Employee> employees = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();
    private static List<Hospital> hospitals =  new ArrayList<>();
    // private static Hospital instance = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getServices(){
        return this.services;
    }

    public void setServices(List<String> services){
        this.services = services;
    }

    public String getSpeciality(){
        return this.speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public static void addHospital(Hospital hospital){
        hospitals.add(hospital);
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }

    public static List<Hospital> getHospitals(){
        return hospitals;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public List<Patient> getPatients(){
        return patients;
    }

    public List<Invoice> getInvoices(){
        return invoices;
    }

    public double calculateRevenue(){
    	double amt = 0;
    	
    	for(Invoice i: invoices) {
    		amt += Double.parseDouble(i.getAmount());
    	}
    	
        return amt;
    }
    
    public double calculateNetProfit() {
    	double amt = 0;
    	
    	for(Employee e: employees) {
    		amt += Double.parseDouble(e.getSalary());
    	}
    	
    	return calculateRevenue() - amt;
    }
    
    public double calculateTaxes(){
        return calculateNetProfit() * 0.18;
    }
}