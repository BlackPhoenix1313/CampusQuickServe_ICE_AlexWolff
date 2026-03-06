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

        //display the receipt for my stupid user 
        JOptionPane.showMessageDialog(null,
            "Customer: " + order1.customerName +
            "\nStudent Number: " + order1.studentNumber +
            "\nItem: " + order1.itemOrder +
            "\nQuantity: " + order1.quantity +
            "\nPrice per Item: R" + order1.pricePerItem +
            "\nSubtotal: R" + subtotal +
            "\nDiscount Applied: R" + discount +
            "\nVAT (15%): R" + vat +
            "\nFinal Total: R" + total +
            "\nThank you for your order!"
                
        );
    }
}

