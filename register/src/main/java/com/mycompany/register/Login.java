/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Login {
     private String  FirstName;
     private String  LastName;
     private String  UserName ;
     private String  Password ;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
        
    String checkUserName() {
         if (UserName.length() < 6 || !UserName.contains("_")) {
            JOptionPane.showMessageDialog(null, "Thank You");
            return "Valid username";
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username. Must contain an underscore.");
            return "Invalid username";
        }
        //https://www.w3schools.com/java/java_conditions.asp
    }
     String checkPassword() {
    if (Password.length() < 8) {
        return "Password must be at least 8 characters .";
    } else if (Password.matches(".*[A-Z].*")) {
        return "Password must contain at least one uppercase letter.";
    } else if (Password.matches(".*\\d.*")) {
        return "Password must contain at least one number.";
    } else if (Password.matches(".*[!@#$%^&*()-_=+\\|[{]};:'\",<.>/?`~].*")) {
        return "Password must contain at least one special character.";
    } else {
        return "Password is valid.";
    }
}
//https://www.w3schools.com/java/java_conditions.asp
     
   void registerUser() {
       String username = getUserName(); 
    String password = getPassword();

    if (username.equals("Username is valid.") && password.equals("Password is valid."))  {
        
        JOptionPane.showMessageDialog(null, "User registered successfully!");
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
    }
}
   //https://www.w3schools.com/java/java_conditions.asp
   
    boolean loginUser(String username, String password) {
   
    if (username.equals(UserName) && password.equals(Password)) {
        JOptionPane.showMessageDialog(null, "Login successful!");
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect username or password. Please try again.");
        return false;
    }
}
 boolean returnLoginStatus(String username, String password) {
       
        return loginUser(username, password);
    }
   
}

