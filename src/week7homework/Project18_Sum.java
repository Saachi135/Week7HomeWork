package week7homework;
/**
 * Write a Java program to sum values of an array.
 */

import java.util.Scanner;

public class Project18_Sum {
    public static void main(String[] args) {   // main method

    Scanner scanner = new Scanner(System.in);  // scanner is called

        System.out.println("Enter First number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter Third number: ");
        int n3 = scanner.nextInt();
        System.out.println("Enter Forth number: ");
        int n4 = scanner.nextInt();
        System.out.println("Enter Fifth number: ");
        int n5 = scanner.nextInt();

        int [] abc = new int[] {n1,n2,n3,n4,n5};
        int add = 0;
        for (int i = 0; i < abc.length; i++){  // loop syntax is used
            add = add + abc[i];
        }
        System.out.println("Sum of the elements: " + add); // print result

        scanner.close();
    }
}
