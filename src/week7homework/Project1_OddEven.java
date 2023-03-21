package week7homework;
/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Project1_OddEven {  // main method in main class
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // calling user input by scanner
        System.out.println("Enter valid number: ");
        int n1 = number.nextInt(); // number input by user

        String Output = n1%2== 0 ? "This is an even Number" : "This is and odd Number"; // define result

        System.out.println(Output); // user output

        number.close(); // close scanner
    }
}
