package com.wsnit.examples;

import java.util.Scanner;

public class MarksheetGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // consume newline character

        // Generate marksheet for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("===================================");
            System.out.println("           Student " + i + "            ");
            System.out.println("===================================");

            // Input student details
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            System.out.print("Enter roll number: ");
            int rollNumber = input.nextInt();
            input.nextLine(); // consume newline character

            // Input marks for three subjects
            System.out.print("Enter marks for subject 1: ");
            int subject1Marks = input.nextInt();
            System.out.print("Enter marks for subject 2: ");
            int subject2Marks = input.nextInt();
            System.out.print("Enter marks for subject 3: ");
            int subject3Marks = input.nextInt();

            // Calculate total marks and percentage
            int totalMarks = subject1Marks + subject2Marks + subject3Marks;
            float percentage = (float) totalMarks / 3;

            // Determine grade based on percentage
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Print marksheet
            System.out.println("===================================");
            System.out.println("               Marksheet            ");
            System.out.println("===================================");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("-----------------------------------");
            System.out.println("Subject 1: " + subject1Marks);
            System.out.println("Subject 2: " + subject2Marks);
            System.out.println("Subject 3: " + subject3Marks);
            System.out.println("-----------------------------------");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("===================================");
        }
    }
}

