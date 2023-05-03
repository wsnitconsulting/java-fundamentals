package com.wsnit.examples;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set up account details
        double balance = 1000;
        int pinCode = 1234;

        // Request PIN code
        System.out.print("Enter your PIN code: ");
        int enteredPin = input.nextInt();

        if (enteredPin != pinCode) {
            System.out.println("Invalid PIN code. Please try again.");
            return; // End the program if the PIN code is invalid
        }

        // PIN code is correct, proceed with banking operations
        System.out.print("Enter the amount you want to withdraw: $");
        double withdrawAmount = input.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("You do not have sufficient funds to withdraw $" + withdrawAmount + ".");
        } else {
            balance -= withdrawAmount;
            System.out.println("You have successfully withdrawn $" + withdrawAmount + ".");
            System.out.println("Your new account balance is $" + balance + ".");
        }

        System.out.print("Enter the amount you want to deposit: $");
        double depositAmount = input.nextDouble();

        balance += depositAmount;
        System.out.println("You have successfully deposited $" + depositAmount + ".");
        System.out.println("Your new account balance is $" + balance + ".");
    }
}

