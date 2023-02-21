package com.management.hospital;

import java.util.Date;
//import java.io.*;
//import java.text.SimpleDateFormat;

public class Invoice{
    private String id;
    private Date date;
    private String amount;
    private String patientId;

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAmount(){
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPatientId(){
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String toString(){
        return this.id + " " + this.date + " " + this.amount + " " + this.patientId;
    }
}