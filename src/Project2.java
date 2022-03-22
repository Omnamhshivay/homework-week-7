import java.util.Scanner;

public class Project2 {
    // a java program to input any year like (ex.2007) and find out if it is leap year or
    //not?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any year");
        int year= scan.nextInt();
        if (year%4==0){
            System.out.println(" is leap year");
        }else{
            System.out.println("is not leap year");
        }
    }

}
