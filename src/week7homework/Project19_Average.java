package week7homework;

import java.util.Scanner; // scanner import

/**
 * Project19_Write a Java program to calculate the average value of array elements
 */
public class Project19_Average {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : "); // user input
        int n1 = scanner.nextInt();

        System.out.println("Enter Second Number : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter Third Number : ");
        int n3 = scanner.nextInt();

        System.out.println("Enter Forth Number : ");
        int n4 = scanner.nextInt();

        System.out.println("Enter Fifth Number : ");
        int n5 = scanner.nextInt();

        System.out.println("Enter Sixth Number : ");
        int n6 = scanner.nextInt();

        System.out.println("Enter Seventh Number : ");
        int n7 = scanner.nextInt();

        int [] abc = new int[]{n1,n2,n3,n4,n5,n6,n7};
        int sum = 0;

        for (int i =0; i < abc.length; i++)
            sum = sum + abc[i];
        double average = sum / abc.length;

        System.out.println("Average value of the array elements is : " + average);

        scanner.close();
    }
}