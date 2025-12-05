import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        try {
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created successfully.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Negative array size is not allowed.");
        }
    }
}
