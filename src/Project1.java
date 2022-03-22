import java.util.Scanner;

public class Project1 {
    //a java program that tells us that Input number is odd or even

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number");
        int number= scn.nextInt();
        String resut=(number%2==0)? "even" : "odd";
        System.out.println(number  + " is " + resut);

    }
}
