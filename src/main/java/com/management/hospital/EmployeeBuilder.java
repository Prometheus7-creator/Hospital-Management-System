package com.management.hospital;

import java.util.*;

public class EmployeeBuilder {
    private Employee employee;

    EmployeeBuilder(){
        this.employee = new Employee();
    }

    public void buildEid(){
        employee.setEid("101");
    }
    public void buildName(){
        employee.setName("Test");
    }
    
    public void buildDob(){
    	Date date = new Date();
        employee.setDob(date);
    }
    
    public void buildGender(){
        employee.setGender("Male");
    }
    
    public void buildMobileNo(){
        employee.setMobileNo("999-999-9999");
    }
    
    public void buildJoinDate(){
    	Date date = new Date();
        employee.setJoinDate(date);
    }
    public void buildRole(){
        employee.setRole("Surgeon");
    }
    public void buildQualification(){
        employee.setQualification("MD");
    }
    public void buildSalary(){
        employee.setSalary("50000");
    }

    public Employee getEmployee(){
        return this.employee;
    }
}
