public class Project20 {
    //Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int a []= {2, 57, 56, 89, 67};
        System.out.println(value(a,56));
        System.out.println(value(a,59));
    }

    public static boolean value(int a[], int item) {
        for (int x : a) {
            if (item == x) {
                return true;
            }
        }
        return false;
    }
}
