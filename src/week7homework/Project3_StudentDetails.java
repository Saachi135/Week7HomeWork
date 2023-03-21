package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Project3_StudentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your Roll No :");
        int rollno = scanner.nextInt();

        System.out.println("Enter marks for Maths (1 to 100) : ");
        int maths = scanner.nextInt();
        System.out.println("Enter marks for Science (1 to 100 :");
        int science = scanner.nextInt();
        System.out.println("Enter marks for English (1 to 100 :");
        int english = scanner.nextInt();
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid Marks input");
        }
        int total = maths + science + english;
        int percentage = total / 3;

        //
        String result;
        if (maths <= 35) {
            result = "Fail";
        } else if (science <= 35) {
            result = "Fail";
        } else if (english <= 35) {
            result = "Fail";
        } else {
            result = "PASS";
        }

        String grade;
        if (percentage >= 35) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "A+";
        } else {
            grade = "D";
        }

        System.out.println("__________________________________________");
        System.out.println("|               Marks Sheet              |");
        System.out.println("| Name           :    " + name + "       |");
        System.out.println("| Roll No        :    " + rollno + "     |");
        System.out.println("| _______________________________________|");
        System.out.println("| Subjects       :     Marks             |");
        System.out.println("|________________________________________|");
        System.out.println("| Maths          :    " + maths + "      |");
        System.out.println("| Science        :    " + science + "    |");
        System.out.println("| English        :    " + english + "    |");
        System.out.println("|________________________________________|");
        System.out.println("| Total          :    " + total + "      |");
        System.out.println("|________________________________________|");
        System.out.println("| Percentage     :    " + percentage + " |");
        System.out.println("| Result         :    " + result + "     |");
        System.out.println("| Grade          :    " + grade + "      |");
        System.out.println("__________________________________________");


        scanner.close();
    }
}
