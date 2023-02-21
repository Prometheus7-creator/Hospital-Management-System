package com.management.hospital;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main Menu", new String[]{"General Hospital", "Speciality Hospital", "Exit"}),
		        subMenu = new Menu("Dashboard", new String[]{"Add", "Display", "Account", "Exit"}),
		        displayMenu = new Menu("Display", new String[]{"Employee", "Patient", "Invoice", "Exit"});
		      
		        do {
		            mainMenu.display();
		            mainMenu.setChoice();

		            HospitalBuilder builder = new HospitalBuilder();
		            EmployeeBuilder empBuilder = new EmployeeBuilder();
		            Director director = new Director();
		            
		            switch(mainMenu.getChoice()) {
		                case 1:
		                    director.makeGeneralHospital(builder);
		                    break;
		                case 2:
		                    director.makeSpecialityHospital(builder);
		            }

		            Hospital hospital = builder.getHospital();

		            Hospital.addHospital(hospital);

		            do {
		                subMenu.display();
		                subMenu.setChoice();
		                switch(subMenu.getChoice()) {
		                    case 1: 
		                        do {
		                            displayMenu.display();
		                            displayMenu.setChoice();
		                            switch(displayMenu.getChoice()) {
		                                case 1: 
		                                	director.makeEmployee(empBuilder);
		                                	hospital.addEmployee(empBuilder.getEmployee());
		                                    break;
		                                case 2: hospital.addPatient(new Patient());
		                                    break;
		                                case 3: hospital.addInvoice(new Invoice());
		                                    break;
		                            }
		    
		                        } while(displayMenu.getChoice() != 4);

		                        break;
		                    case 2: 
		                        do {
		                            displayMenu.display();
		                            displayMenu.setChoice();
		                            switch(displayMenu.getChoice()) {
		                                case 1: 
		                                    for(Employee e: hospital.getEmployees()){
		                                        System.out.println(e);
		                                    }
		                                    
		                                    break;
		                                case 2:
		                                    for(Patient p: hospital.getPatients()){
		                                        System.out.println(p);
		                                    }
		                                    break;
		                                case 3: 
		                                    for(Invoice i: hospital.getInvoices()){
		                                        System.out.println(i);
		                                    }
		                                    break;
		                            }
		    
		                        } while(displayMenu.getChoice() != 4);   

		                        break;
		                    case 3: 
		                        System.out.println("Revenue: " + hospital.calculateRevenue());
		                        System.out.println("Tax: " + hospital.calculateTaxes());
		                        break;
		                }

		            } while(subMenu.getChoice() != 4);

		        }
		        while(mainMenu.getChoice() != 3);

		        System.out.println("Thank You For Using The Hospital Management System");

	}

}
