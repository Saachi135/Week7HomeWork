package week7homework;
/**
 * . Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Project12_findInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Input: ");
        String data = scanner.next();

        if (data.matches("[0-9]+ ")) {
            System.out.println("Input is a number.");
        } else if (data.matches("[a-z A-Z]+")) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }
    }
}
