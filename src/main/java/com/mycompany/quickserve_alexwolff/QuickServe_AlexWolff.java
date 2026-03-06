package com.mycompany.quickserve_alexwolff;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex Wolff
 */
public class QuickServe_AlexWolff {

    public static void main(String[] args) {
        
        //Creating new object for orders
        Order order1 = new Order();
        
        // Geting user input through GUIs and saving them to the class
        order1.customerName = JOptionPane.showInputDialog("Enter customer name:");  
        order1.studentNumber = JOptionPane.showInputDialog("Enter student number:");
        order1.itemOrder = JOptionPane.showInputDialog("Enter item ordered:");
        order1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
        order1.pricePerItem = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item:"));
       
       
        
        
        
        
    }
}
