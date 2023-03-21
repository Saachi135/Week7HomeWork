package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Project2_LeapYear {
    public static void main(String[] args) { // main method declared
        System.out.println("Enter a Valid Year: "); // user input request

        Scanner data = new Scanner(System.in); // user input data
        int n = data.nextInt();
        String year = n % 4 == 0 ? "This is a Leap year" : "This is not Leap year"; // Ternary operator is use with moduler

        System.out.println(year); // printing user data
    data.close(); // scanner close
    }
}
