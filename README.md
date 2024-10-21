# ATM System in Java
## This project is an ATM System Simulation developed in Java, designed to emulate the basic functionalities of an Automated Teller Machine (ATM). The system includes features like cash withdrawal, money deposit, and balance inquiries, all while ensuring proper validation of user inputs and maintaining consistency between user and ATM balances.

## Features:
## PIN Authentication: 
Secure user access with a 4-digit PIN system, ensuring only authorized users can interact with the ATM.
## Withdrawals:
Checks both user account balance and ATM machine balance before processing the withdrawal.

Deducts the withdrawal amount from both the user’s account and the ATM’s available cash.

Ensures the amount entered is valid and within available limits.
## Deposits:
Users can deposit up to ₹50,000 at a time.

The system checks for valid input and updates both the user's balance and the ATM's balance after successful deposits.

## Balance Inquiry: 
Users can check their current account balance and the total available cash in the ATM.
## Input Validations: 
All user inputs are carefully validated, including checking for negative amounts, exceeding ATM or user limits, and ensuring proper data entry.

User-Friendly Menu: A simple menu interface guides users to withdraw, deposit, check balances, or exit the application.

## How the ATM System Works:
## 1.PIN Verification:
The user is prompted to enter a PIN to access the ATM system.
## 2.Transaction Menu:
Once authenticated, users can choose one of the following operations:
### .Withdraw:
Deducts the specified amount from the user's balance, if valid, and reduces ATM cash.
### .Deposit: 
Allows deposits up to ₹50,000, updating both user and ATM balances.
### .Check Balance:
Displays both the user’s account balance and the ATM’s available cash.
### .Exit:
Ends the session and exits the program.
## 3.Input Checks: Every input (whether for withdrawal or deposit) is checked for validity to ensure a smooth and secure transaction experience.

if (withdrawAmount > userBalance) {

    System.out.println("Insufficient account balance. Your current balance is: " + userBalance);
    
} else if (withdrawAmount > atmBalance) {

    System.out.println("ATM doesn't have enough cash. Available ATM balance is: " + atmBalance);
    
} else {

    userBalance -= withdrawAmount;
    
    atmBalance -= withdrawAmount;
    
    System.out.println("Withdrawal successful! Please collect your cash.");
    
}

## Prerequisites:
Java JDK (1.8 or later) installed.

Basic knowledge of Java programming and Object-Oriented Principles (OOP).

## Installation:
Clone the repository to your local machine.

Compile the Java program:

javac ATMSystemV2.java

Run the program:

java ATMSystemV2












