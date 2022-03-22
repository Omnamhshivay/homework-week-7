import java.util.Arrays;

public class Project17 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int[] my_array1 = {
                50, 20, 40, 10,30,};

        String[] my_array2 = {
                "mitesh", "Bhavesh", "Pinakin", "Nidhi","Vimal"};
        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
