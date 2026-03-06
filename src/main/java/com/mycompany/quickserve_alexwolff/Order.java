package com.mycompany.quickserve_alexwolff;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Wolff
 */
public class Order {
    String customerName;
    String studentNumber;
    String itemOrder;
    int quantity;
    double pricePerItem;
    boolean discountApplied = false;

    //constant for VAT
    static final double VAT_RATE = 0.15;

    //empty constructor
    public Order() {}

    //method for calculation of subtotal
    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }

    //method for VAT calculation
    public double calculateVAT(double subtotalAfterDiscount) {
        return subtotalAfterDiscount * VAT_RATE;
    }

    //method for discount calculation
    public double applyDiscount() {
        if (quantity > 3) {
            discountApplied = true;
            return calculateSubtotal() * 0.10; // 10% discount
        } else {
            discountApplied = false;
            return 0.0;
        }
    }

    //method for final total
    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        double discount = applyDiscount();
        double subtotalAfterDiscount = subtotal - discount;
        double vat = calculateVAT(subtotalAfterDiscount);
        return subtotalAfterDiscount + vat;
    }
}

