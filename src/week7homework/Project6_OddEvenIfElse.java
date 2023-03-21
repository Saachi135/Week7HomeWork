package week7homework;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Project6_OddEvenIfElse {
    public static void main(String[] args) {   // main method
        System.out.println("User Enter Valid Number "); // print statement
    Scanner scanner = new Scanner(System.in);  // scanner method
    int n = scanner.nextInt();  // user input data

    if (n % 2 == 0) {  // % is used to check reminder
        System.out.println("This is Even Number");
    } else {
        System.out.println("This is odd Number");
    }

        scanner.close(); // close scanner
    }
}
