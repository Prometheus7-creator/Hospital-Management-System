package com.management.hospital;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Menu {
    private int choice;
    private String[] choices;
    private String menuTitle;

    Menu(String menuTitle, String[] choices) {
        this.menuTitle = menuTitle;
        this.choices = choices;
    }

    public void display() {
        System.out.println("----------------------" + menuTitle + "----------------------");
        for (int i = 0; i < choices.length; i++) {
            System.out.print(i+1 + ". ");
            System.out.println(choices[i]);
        }
        System.out.println();
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice() throws InputMismatchException {
        choice = Menu.readChoice();
    }

    public static int readChoice() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice; 
        
        while(true) {
            try {
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(br.readLine());
                return choice;
            }
            catch(InputMismatchException e) {
                System.out.println("Please enter a valid integer");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}