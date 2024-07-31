import java.util.Scanner;

public class SumPositiveOddNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of n elements
        int[] array = new int[n];

        // Read elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of positive odd numbers
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0 && array[i] % 2 != 0) {
                sum += array[i];
            }
        }

        // Print the result
        System.out.println("The sum of positive odd numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
