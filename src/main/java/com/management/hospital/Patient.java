package com.management.hospital;

//import java.io.InputStreamReader;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person{
    private String pid;
    private Date registrationDate;
    private String bloodGroup;
    private String doctorId;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String toString(){
        return this.pid + " " + this.getName() + " " + this.getDob() + " " + 
        this.getGender() + " " + this.getMobileNo() + " " + this.bloodGroup + " " +
        this.doctorId;
    }
}