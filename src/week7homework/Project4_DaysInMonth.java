package week7homework;

/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
public class Project4_DaysInMonth {
    public static boolean isleapyear(int year) {
        if (year < 1 || year > 9999) {
            return false;

        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else{
            return false;
        }
    }
public static int getDaysInMonth (int month, int year){
        if (month <1 || month >12 || year <1 || year > 9999) {
            return -1;
        } else  {
            switch (month){
                case 2:
                    if (isleapyear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
}
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020)); //31

        System.out.println(getDaysInMonth(2,2020)); //29

        System.out.println(getDaysInMonth(2,2018)); //28

        System.out.println(getDaysInMonth(-1,2020)); // -1

        System.out.println(getDaysInMonth(1,-2020)); //-1
    }
}
