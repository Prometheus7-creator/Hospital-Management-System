package com.management.hospital;

import java.util.*;

public class HospitalBuilder implements Builder{
    private Hospital hospital;

    HospitalBuilder(){
        this.hospital = new Hospital();
    }

    public void buildId(){
        hospital.setId("101");
    }
    public void buildName(){
        hospital.setName("Test");
    }
    public void buildAddress(){
        hospital.setAddress("Delhi, India");
    }
    public void buildPhone(){
        hospital.setPhone("999-999-999");
    }
    public void buildServices(){
        hospital.setServices(Arrays.asList("OPD", "Pathology", "Surgery"));
    }
    public void buildSpeciality(){
        hospital.setSpeciality("Heart");
    }

    public Hospital getHospital(){
        return this.hospital;
    }
}
