package week7homework;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement.
 */

import java.util.Scanner;

public class Project9_Switch {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet A to F: ");
// user input data
        Scanner scanner = new Scanner(System.in);
        char User = scanner.next().charAt(0);
        switch (User) {   // switch syntax
            case 'A':    // variable in assigned
                System.out.println("Ahmedabad");
                break;   // java will stop if found user requirement or else more to next case
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C' :
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:  // is used to define other than requirement assigned characters
                System.out.println("Enter Valid Input please"); // console will print message
        }
    }
}
