#CampusQuickServe ICE

## Problem Description
This is a simple Java program for a campus food vendor.  
It asks the customer for their details and order, does the math for subtotal, discount, VAT, and total, and then shows a receipt in a message box.

## Program Structure
- Order class: holds the customer info and has methods for subtotal, discount, VAT, and total.
- QuickServe_AlexWolff class: main program that gets input, calls the methods, and shows the receipt.

## Approach
I started by setting up the classes and attributes.  
Then I added input with JOptionPane, wrote the calculation methods, and tested them.  
Later I added discount logic and made the variables private with getters and setters.  
Finally I formatted the receipt output.

## OOP Concepts Used
- Class vs Object (Order is the class, order1 is the object).
- Encapsulation (private variables with getters and setters).
- Constant VAT_RAT).
- Methods (used for all the calculations).

## Screenshot

![Receipt Output With Discount](WithDiscountGUI.png)
![Receipt Output No Discount](NoDiscountGUI.png)

