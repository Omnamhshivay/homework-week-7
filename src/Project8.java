import java.util.Scanner;

public class Project8 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
    //any other alphabet should be invalid entry
    public static void main(String[] args) {

        String a[]={"america","belgium","canada","dubai","england","france"};

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter first letter of city between A to F");
        String city=scan.next();

        if(city.startsWith("a")){
            System.out.println(a[0]);
        }else if(city.startsWith("b")){
            System.out.println(a[1]);
        }else if(city.startsWith("c")){
            System.out.println(a[2]);
        }else if(city.startsWith("d")){
            System.out.println(a[3]);
        }else if(city.startsWith("e")){
            System.out.println(a[4]);
        }else if(city.startsWith("f")){
            System.out.println(a[5]);
        }else{
            System.out.println("Invalid entry");
        }

    }
}
