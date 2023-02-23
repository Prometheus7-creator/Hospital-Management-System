package com.hospital.management.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Hospital{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private String address;
	private String phone;
//	private List<String> services;
//	private String speciality;
//	private List<Employee> employees = new ArrayList<>();
//	private List<Patient> patients = new ArrayList<>();
//	private List<Invoice> invoices = new ArrayList<>();
//    private static List<Hospital> hospitals =  new ArrayList<>();


//    public static void addHospital(Hospital hospital){
//        hospitals.add(hospital);
//    }
//
//    public void addEmployee(Employee emp){
//        employees.add(emp);
//    }
//
//    public void addPatient(Patient patient){
//        patients.add(patient);
//    }
//
//    public void addInvoice(Invoice invoice){
//        invoices.add(invoice);
//    }
//
//    public static List<Hospital> getHospitals(){
//        return hospitals;
//    }


    public double calculateRevenue(){
        return 0;
    }
    public double calculateTaxes(){
        return 0;
    }
}