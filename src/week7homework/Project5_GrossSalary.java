package week7homework;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –P
 */

import java.util.Scanner;

public class Project5_GrossSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Employee ID:  ");
        int id = scanner.nextInt();
        System.out.println(" Enter Basic Salary: ");
        int s = scanner.nextInt();

        double hra = s * 0.10;
        double ta = s * 0.08;
        double da = s * 0.09;
        double pf = s * 0.20;

        double sum = s+hra+ta+da-pf;


        System.out.println("---------------------------------");
        System.out.println("|           Salary Slip         |");
        System.out.println("|-------------------------------|");
        System.out.println("| Employee ID        : "+id  +" |");
        System.out.println("| Employee Name      : "+name+" |");
        System.out.println("|-------------------------------|");
        System.out.println("| Basic Salary       :"+ s + "  |");
        System.out.println("| HRA 10%            :"+ hra+ " |");
        System.out.println("| TA 8%              :"+ ta + " |");
        System.out.println("| DA 9%              :"+ da + " |");
        System.out.println("| PF 20%             :"+ pf + " |");
        System.out.println("|-------------------------------|");
        System.out.println("| Gross Salary       :"+ sum +" |");
        System.out.println("=================================");

    }
}
