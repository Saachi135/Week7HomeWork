package week7homework;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Project20_SpecificValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Search input number ");    // assigns values
        int[] input = {n1, n2, n3, n4, n5};

        int abc = scanner.nextInt();

        boolean containsValue = false;

        for (int i = 0; i < input.length; i++) {   // loop syntax
            if (input[i] == abc) {
                containsValue = true;
                break;
            }
        }
        if (containsValue) {
            System.out.println("The array contains " + abc); // print if value found

        } else {
            System.out.println("The array does not contain " + abc); // print if value not found
        }

        scanner.close();
    }
}
