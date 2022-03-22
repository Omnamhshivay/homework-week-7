import java.util.Scanner;

public class Project4 {

    public static boolean isLeapYear(int year) {
        boolean a;
        if (year <= 1 || year >= 9999) {
            a = false;
            System.out.println("since the parameter is not in the range(1-9999)");

        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            a = true;
            System.out.println(year + " is leap year");

        } else {
            a = false;
            System.out.println(year + " is Not a leap year");

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scan.nextInt();
        System.out.println("Please enter the month");
        int month = scan.nextInt();
        isLeapYear(year);
//        //Leap year 4 outputs
//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);
        System.out.println("--------------------------------------------------");

        getDaysInMonth(month, year);

        //5 outputs to get days in a month
//        getDaysInMonth(1, 2020); // should return 31 days
//        getDaysInMonth(2, 2020);// should return 29 days because 2020 is leap year
//        getDaysInMonth(2, 2018);// should return 28 days because 2018 is not leap year
//        getDaysInMonth(-1, 2020);// should return -1 as parameter month is not valid
//        getDaysInMonth(1, -2020);//should return -1 since parameter year is invalid
    }

    public static int getDaysInMonth(int month, int year) {
        int months = 12;
        switch (month) {
            case 1:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("Invalid year");
                }
                break;
            case 2:
                if (month == 2 && year % 4 == 0 && year % 100 != 0) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            case 3:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 4:
                if (year > 1 || year < 9999) {
                    System.out.println("30 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 5:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 6:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 7:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 8:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 9:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 10:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 11:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 12:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            default:
                System.out.println("Invalid month");
                System.out.println("invalid year");
                break;
        }
        return 0;
    }
}
