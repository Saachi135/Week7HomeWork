package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Project10_Symbole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int y = scanner.nextInt();

        System.out.println("Enter operator (+, -, *, /) :");
        char input = scanner.next().charAt(0);

        double result;
// calculating input from user
        if (input == '+') {
            result = x + y;
        } else if (input == '-') {
            result = x - y;
        } else if (input == '*') {
            result = x * y;
        } else if (input == '/') {
            result = x / y;
        } else {
            // requesting user data
            System.out.println("Input valid operator");
            return;
        }
        // printing input result
        System.out.println(x + "" + input + "" + y + "=" + result);
        scanner.close(); //
    }
}