package week7homework;
/**
 * . Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Project8_CityName {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);

        System.out.println("Enter an Character from A to F : ");
        char alphabet = Data.next().charAt(0);

        if (alphabet == 'A') {
            System.out.println("City Name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City Name: Bombay");
        } else if (alphabet == 'C') {
            System.out.println("City Name: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City Name: Delhi");
        } else if (alphabet == 'E') {
            System.out.println("City Name: England");
        } else if (alphabet == 'F') {
            System.out.println("City Name: France");
        }  else {
            System.out.println("Invalid entry. Please Enter Valid Data from A to F.");

     }
    }
}


