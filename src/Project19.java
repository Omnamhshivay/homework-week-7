public class Project19 {
    //Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int a[] = {12, 30, 16, 24, 60};

        int sum = 0;
        for(int i=0; i < a.length ; i++)
            sum = sum + a[i];

        double average = sum / a.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
