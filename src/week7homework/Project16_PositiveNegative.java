package week7homework;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner; // import scanner

public class Project16_PositiveNegative {
    public static void main(String[] args) {   // main method
        Scanner scanner = new Scanner(System.in);  // scanner input
        System.out.println("Enter First number: ");  // user input value
        int n1 = scanner.nextInt();

        inputValue(n1);    // calling method from static

    }
    static void inputValue(int n1) {   // if variable
        if (n1 > 0)
            System.out.println(n1 + " is a Positive number");
        else if (n1 < 0) {
            System.out.println(n1 + " is a Negative number");
        } else {
            System.out.println(n1 + " is Zero");
        }
    }
}
