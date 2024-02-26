/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String companySuffix = "company.com";
    
    //constructor which recieve frist and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        
        //call a method asking for dep.
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        
        //call a method that returns random pass
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
        //generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + this.email);
    }
    
    // Ask for department 
    private String setDepartment(){
        System.out.println("New employee: " + firstName + ". DEPARTMENTS CODE:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:  ");
        Scanner s = new Scanner(System.in);
        int depChoise = s.nextInt();
        if (depChoise == 1){return "sales";}
        else if (depChoise == 2) {return "dev";}
        else if (depChoise == 3) {return "acct";}
        else { return "";}
    }
    
    // Generate a random password
    private String randomPassword(int length){
        String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random()* passSet.length());
            password[i] = passSet.charAt(rand);
        }
        return new String(password);
    }
    
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    
    // Set the alterntive email
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }
    
    // Change the password
    public void chnagePassword(String password){
        this.password = password;
    }
    
    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getaltEmail() {return alternativeEmail;}
    public String getPassword() {return password;}
    
    
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + 
               "\nCOMPANY EMAIL: " + email + 
               "\nMAILBOX CAPACITY: " + mailboxCapacity;
    }
    
    
    
    
}
