package com.mycompany.quickserve_alexwolff;
import javax.swing.JOptionPane;

public class QuickServe_AlexWolff {
    public static void main(String[] args) {
        
        //create new Order object
        Order order1 = new Order();

        //collect input from user
        order1.customerName = JOptionPane.showInputDialog("Enter customer name:");
        order1.studentNumber = JOptionPane.showInputDialog("Enter student number:");
        order1.itemOrder = JOptionPane.showInputDialog("Enter item ordered:");
        order1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
        order1.pricePerItem = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item:"));

        //perform calculations
        double subtotal = order1.calculateSubtotal();
        double discount = order1.applyDiscount();
        double subtotalAfterDiscount = subtotal - discount;
        double vat = order1.calculateVAT(subtotalAfterDiscount);
        double total = order1.calculateTotal();


    }
}

