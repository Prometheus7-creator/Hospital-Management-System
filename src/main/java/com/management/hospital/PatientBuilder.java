package com.management.hospital;

import java.util.*;

public class PatientBuilder {
    private Patient patient;

    PatientBuilder(){
        this.patient = new Patient();
    }

    public void buildPid(){
        patient.setPid("101");
    }
    public void buildName(){
        patient.setName("Test");
    }
    
    public void buildDob(){
    	Date date = new Date();
        patient.setDob(date);
    }
    
    public void buildGender(){
        patient.setGender("Male");
    }
    
    public void buildMobileNo(){
        patient.setMobileNo("999-999-9999");
    }
    
    public void buildRegistrationDate(){
    	Date date = new Date();
        patient.setRegistrationDate(date);
    }
    public void buildBloodGroup(){
        patient.setBloodGroup("B+");
    }
    public void buildDoctorId(){
        patient.setDoctorId("201");
    }

    public Patient getPatient(){
        return this.patient;
    }
}
