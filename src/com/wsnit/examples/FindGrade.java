package com.wsnit.examples;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double grade = input.nextDouble();

        if (grade >= 90) {
            System.out.println("Your grade is an A.");
        } else if (grade >= 80) {
            System.out.println("Your grade is a B.");
        } else if (grade >= 70) {
            System.out.println("Your grade is a C.");
        } else if (grade >= 60) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }

    }
}
