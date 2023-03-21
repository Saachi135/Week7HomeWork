package week7homework;
/**
 * Write a Java program to sort a numeric array and a string array
 */

import java.util.Arrays; // arrays import
import java.util.Scanner; // scanner import

public class Project17_Array {
    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in);  // assigning scanner

        System.out.println("Enter first number n1");
        int n1 = scanner.nextInt();

        System.out.println("Enter Second number n2");
        int n2 = scanner.nextInt();

        System.out.println("Enter Third number n3");
        int n3 = scanner.nextInt();

        System.out.println("Enter Forth number n4");
        int n4 = scanner.nextInt();

        System.out.println("Enter Fifth number n5");
        int n5 = scanner.nextInt();

        int [] n = {n1,n2,n3,n4,n5};
        Arrays.sort(n); // array sort syntax for sorting numbers
        System.out.println("Sorted numeric array: " + Arrays.toString(n));

        Scanner scanner1 = new Scanner(System.in);  // new scanner is called

        System.out.println("Enter first word:  ");
        String a = scanner1.nextLine();

        System.out.println("Enter second word: ");
        String b = scanner1.nextLine();

        System.out.println("Enter third word: ");
        String c = scanner1.nextLine();

        System.out.println("Enter forth word: ");
        String d = scanner1.nextLine();

        System.out.println("Enter fifth word: ");
        String e = scanner1.nextLine();

        String [] abc = {a,b,c,d,e};
        Arrays.sort(abc);
        System.out.println("Sorted words array: " + Arrays.toString(abc));

        scanner.close();
        scanner1.close();
    }

}
