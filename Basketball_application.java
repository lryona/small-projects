/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personal_projects;

import java.util.Scanner;

public class Basketball_application {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        int open_slots = 0;
        int min_age = 0;
        int max_age = 0;
        String[]applicants = new String[open_slots];
        String name;
        int age = 0;
        int applicant_count = 0;
        
        while(true) {
            System.out.println("Menu");
            System.out.println("-----------------");
            System.out.println("[1] Place requirements");
            System.out.println("[2] Apply for the team");
            System.out.println("[3] Exit");
            System.out.println("-----------------");
            System.out.println("Choice:");
        
            choice = scanner.nextInt();
            
            scanner.nextLine();
        
            switch(choice) {
            case 1:
                
                if(open_slots != 0 && min_age !=0 && max_age != 0) {
                    System.out.println("You are not allowed to change requirements.");
                } else {
                    System.out.println("Enter number of open slot/s:");
                    open_slots = scanner.nextInt();
                    applicants = new String[open_slots];
                
                    System.out.println("Enter minimum age:");
                    min_age = scanner.nextInt();
                    System.out.println("Enter maximum age:");
                    max_age = scanner.nextInt();
                
                    scanner.nextLine();
                }
            break;
            case 2:
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter age:");
                age = scanner.nextInt();
                
                if(applicant_count < open_slots) {
                    if(age >= min_age && age <= max_age) {
                        System.out.println("You are now applied for the team!");
                        applicants[applicant_count] = name;
                        applicant_count++;
                    } else {
                        System.out.println("You are not applicable for the team.");
                    }
                } else {
                    System.out.println("There are no open slots left.");
                }
            break;
            case 3:
                if(applicant_count != 0) {
                    for(int i=0;i<applicant_count;i++) {
                    System.out.println("Successful applicants:");
                    System.out.println(applicants[i]);
                    }
                } else {
                    System.out.println("There are no applicants.");
                }
                scanner.close();
                System.exit(0);
            break;
            default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
