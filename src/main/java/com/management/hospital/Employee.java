package com.management.hospital;
import java.util.*;
//import java.io.*;
//import java.text.SimpleDateFormat;

public class Employee extends Person{
    
    private String eid;
    private Date joinDate;
    private String role;
    private String qualification;
    private String salary;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString(){
        return this.eid + " " + this.getName() + " " + this.getDob() + " " + 
        this.getGender() + " " + this.getMobileNo() + " " + this.role + " " +
        this.qualification + " " + this.salary;
    }
}