package com.mycompany.quickserve_alexwolff;

/**
 *
 * @author Alex Wolff
 */
public class Order {
    // attributes for storing all the order details
    private String customerName;
    private String studentNumber;
    private String itemOrder;
    private int quantity;
    private double pricePerItem;
    private boolean discountApplied = false; // flag to check if discount was used

    // constant for VAT (15%), written in all caps because constants never change
    static final double VAT_RATE = 0.15;

    // empty constructor (object starts with no values until we set them)
    public Order() {}

    // getters (used to read private values outside this class)
    public String getCustomerName() { return customerName; }
    public String getStudentNumber() { return studentNumber; }
    public String getItemOrder() { return itemOrder; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }
    public boolean isDiscountApplied() { return discountApplied; }

    // setters (used to assign values from JOptionPane input)
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setStudentNumber(String studentNumber) { this.studentNumber = studentNumber; }
    public void setItemOrder(String itemOrder) { this.itemOrder = itemOrder; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPricePerItem(double pricePerItem) { this.pricePerItem = pricePerItem; }

    // method to calculate subtotal (quantity * price per item)
    public double calculateSubtotal() { 
        return quantity * pricePerItem; 
    }

    // method to calculate VAT (15% of subtotal after discount)
    public double calculateVAT(double subtotalAfterDiscount) {
        return subtotalAfterDiscount * VAT_RATE;
    }

    // method to check if discount applies and return discount amount
    public double applyDiscount() {
        if (quantity > 3) {
            discountApplied = true; // mark that discount was applied
            return calculateSubtotal() * 0.10; // 10% discount
        } else {
            discountApplied = false; // no discount
            return 0.0;
        }
    }

    // method to calculate the final total (subtotal - discount + VAT)
    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        double discount = applyDiscount();
        double subtotalAfterDiscount = subtotal - discount;
        double vat = calculateVAT(subtotalAfterDiscount);
        return subtotalAfterDiscount + vat;
    }
}


