package week7homework;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 and 7, and it prints The Days
 * name MONDAY, TUESDAY….SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Project13_SwitchStat {
    public static void main(String[] args) { // main method
        System.out.println("Input Number from  1 to 7: ");  // input by user
        Scanner scanner = new Scanner(System.in);  // getting data from user
        int day = scanner.nextInt();

        switch (day){   // switch syntax
            case 1:
                System.out.println("Monday");  //  if its matching monday will print
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number");

                scanner.close();
        }
    }
}

