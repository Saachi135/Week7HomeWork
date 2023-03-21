package week7homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Project7_SalesCommission {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner called

        System.out.println("Enter Seller's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter sales id: ");
        int id = scanner.nextInt();

        System.out.println("Enter Sales amount: ");
        int amount = scanner.nextInt();

        System.out.println("Enter Salary basic: ");
        int salary = scanner.nextInt();



// commission calculation
        double commission;
        if (amount >= 50000){
            commission = (salary * 0.35);
            System.out.println("Sales Commission is " + commission);
        } else if (amount >= 30000) {
            commission = (salary * 0.20);
            System.out.println("Sales Commission is " + commission);
        } else if (amount >= 20000) {
            commission = (salary * 0.10);
            System.out.println("Sales Commission is " + commission);
        } else if (amount >= 10000) {
            commission = (salary * 0.05);
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (amount * 0.02);
            System.out.println("Sales Commission is " + commission);
        }
        System.out.println("Final Salary: " + (salary + commission));
        scanner.close();
     // return;


    }

}
