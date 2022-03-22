import java.util.Scanner;

public class Project3 {
//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
//_______________________________
//| |
//| Mark Sheet |
//|_______________________________|
//| Name : Jay |
//| Roll No: 08 |
//|_______________________________|
//| Subjects : Marks |
//|_______________________________|
//| Math : 98 |
//| Science : 90 |
//| English : 85 |
//|_______________________________|
//| Total : 273 |
//|_______________________________|
//| Percentage : 91.0 |
//| Result : Pass |
//| Grade : A+ |
//|_______________________________|

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mathsMarks, scienceMarks, englishMarks, total;
        double percentage;
        String result, grade = null;

        System.out.println("Please enter student name:");
        String name = scan.nextLine();

        System.out.println("Please enter student roll number:");
        int rollNum = scan.nextInt();

        System.out.println("Enter Maths Marks:");

        mathsMarks = scan.nextInt();
        if(mathsMarks>0 && mathsMarks<=100) {
            System.out.println("valid input");
        }else{
            System.out.println("Invalid input");
        }
       System.out.println("Enter Science Marks");

        scienceMarks = scan.nextInt();
        if (scienceMarks>0 && scienceMarks<=100){
            System.out.println("Valid input");
        }else{
            System.out.println("Invalid input");
        }

        System.out.println("Enter English Marks");

        englishMarks = scan.nextInt();
        if(englishMarks>0 && englishMarks>=100){
            System.out.println("Valid input");
        }else {
            System.out.println("Invalid input");
        }
        double sum=(scienceMarks + englishMarks + mathsMarks);
        System.out.println(sum);
        percentage = sum / 300 * 100;
        System.out.println(percentage);

        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println(result);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println(grade);
        } else if (percentage >= 60 && percentage <= 79) {
            grade = "A";
            System.out.println(grade);
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "B";
            System.out.println(grade);
        } else if (percentage >= 35 && percentage <= 49) {
            grade = "C";
            System.out.println(grade);
        }
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + sum + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }
}