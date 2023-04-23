
package part.pkg1.poe;

import java.util.Scanner;


public class Registration {

   
          
     static String firstName;
     static String userName;
     static String surname;
     static String password;
 // put the scanner we have imported to use and also declaring userDetails method   
    public static void userDetails(){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter you first name");
        firstName = userInput.nextLine();
        System.out.println("Please enter your surname");
        surname = userInput.nextLine();
        System.out.println("Please enter your userName");
        userName = userInput.nextLine();
        System.out.println("Please enter your password");
        password = userInput.nextLine();
        
    }
    
 // combining our class login with userDetails and bring all our method to communicate with one another to get the result we were asked to prepare.
    public static void main(String[] args) {
        userDetails();
        Login logObject = new Login();
        
        logObject.checkUserName();
        logObject.registerUser();
        System.out.println(logObject.returnLoginStatus());
        
    }
    }
    

