/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.register;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Register {

    public static void main(String[] args) {
    
    Login login = new Login();

    String username = JOptionPane.showInputDialog(null, "Enter your username:");
    login.setUserName(username);
    
    String password = JOptionPane.showInputDialog(null, "Enter your password:");
    login.setPassword(password);

        login.checkUserName();
        login.registerUser();
        login.checkPassword();
}

       
       
                
        
        
        
        
        
           }
}
