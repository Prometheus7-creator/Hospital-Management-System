package com.management.hospital;

import java.util.*;
//import java.text.SimpleDateFormat;

public abstract class Person{
    private String name;
    private Date dob;
    private String gender;
    private String mobileNo;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob(){
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo(){
        return mobileNo;
    }
    
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}