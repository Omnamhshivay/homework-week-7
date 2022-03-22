import java.util.Scanner;

public class Project9 {
    //Same as above program-8 using switch statement.
    public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter first letter of city between A to F");
            String letter=scan.next();

            switch (letter.toUpperCase()){
                case "A":
                    System.out.println("America");
                    break;
                case "B":
                    System.out.println("Belgium");
                    break;
                case "c":
                    System.out.println("Canada");
                    break;
                case "D":
                    System.out.println("Dubai");
                    break;
                case "E":
                    System.out.println("England");
                    break;
                case "F":
                    System.out.println("France");
                    break;
                default:
                    System.out.println("Invalid Entry");

            }
        }

    }

