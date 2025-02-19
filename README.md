# Super Market Billing Software

## Overview
Super Market Billing Software is a simple Java-based console application that allows users to generate a bill for purchased items. Users can enter item details, calculate the total bill including tax, and display a formatted bill.

## Features
- Allows users to enter multiple items with name, price, and quantity.
- Automatically calculates the total cost for each item.
- Computes the subtotal, tax (18%), and final total.
- Displays a well-formatted bill.

## Technologies Used
- Java
- Scanner class for user input
- ArrayList for dynamic item storage

## How to Run
1. Install Java (JDK 8 or later).
2. Compile the Java program:
   ```sh
   javac SuperMarketBilling.java
   ```
3. Run the program:
   ```sh
   java SuperMarketBilling
   ```
4. Follow the prompts to enter item details and generate a bill.

## Sample Output
```
Welcome to Super Market Billing Software!

Enter item name: Apple
Enter price per unit: Rs50
Enter quantity: 2
Do you want to add another item? (yes/no): yes

Enter item name: Milk
Enter price per unit: Rs40
Enter quantity: 1
Do you want to add another item? (yes/no): no

---------------------------------
         Super Market Bill       
---------------------------------
Item            Price      Quantity   Total     
Apple           Rs50.00    2          Rs100.00  
Milk            Rs40.00    1          Rs40.00   
---------------------------------
Subtotal: Rs140.00
Tax (18%): Rs25.20
Total: Rs165.20
---------------------------------
```

## Future Enhancements
- Add discount functionality.
- Generate printable bill receipts.
- Implement a GUI version using Java Swing or JavaFX.

## License
This project is open-source and free to use.

