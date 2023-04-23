/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1.poe;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
    // checking condition for the input we recieved from the user if they meet the requement as set.
    // check Username if it contains underscore and is no more then 5 characters long.
    public boolean checkUserName(){
        return Registration.userName.contains("_") && Registration.userName.length()<=5;
        }
    // check password meet the password complexity rules. if it has >= 8 character,contain a capital letter, contain a number and a special character.
    public boolean checkPasswordComplexity(){
        
    boolean passwordStatus = false;
    boolean length = false;
    boolean number = false;
    boolean specialCharacter = false;
    boolean upperCase = false;
    char ch;
    
    if(Registration.password.length() >= 8){
        length = true;
    }
    for(int i =0; i < Registration.password.length(); i = i+1 ){
        ch = Registration.password.charAt(i);
        
        if(Character.isDigit(ch)){
            number = true;
        }
        if(Character.isUpperCase(ch)){
            upperCase = true;
        }
        if(!Character.isLetterOrDigit(ch)){
             specialCharacter = true;
        }
    passwordStatus = specialCharacter && number && length && upperCase;
    }
    return passwordStatus;
    }
    //User's conditions for login details that have been provided. were supposed to create a string method but don't know how to swop them around to get to were it can display one massage for two strings
    public void registerUser(){
    if(checkUserName()){
        System.out.println("Username successfully captured");
    }
    else{
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in lenght");
    }
    if(checkPasswordComplexity()){
        System.out.println("Password successfully captured");
    }
    else{
        System.out.println("Password is not correctly formatted, please ensure the password contains at least 8 characters, a capital letter, a number and a special character. ");
    }
 }
  // User authentication to check if they are the same as the one entered when creating the account.  
 boolean loginUser(){
    Scanner in = new Scanner(System.in);
    
     System.out.println("Enter the user name you used to create an account");
     String username2 = in.nextLine();
      System.out.println("Enter the password you used to create an account");
    String password2 = in.nextLine();
     
        return Registration.userName.equals(username2)&& Registration.password.equals(password2);
 } 
// User return statement or massages for authentication username2 & password2
public String returnLoginStatus(){
    if(loginUser()){
        return "Welcome " + Registration.firstName + " " + Registration.surname + " it is great to see you again.";
    }
    else{
        return "Username or password incorrect, please try again.";
    }
} 
    
}
