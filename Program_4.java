package recruitment;

import java.util.*;

public class Program_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split input into individual number strings
        String[] parts = input.trim().split("\\s+");

        // Convert input strings to integers
        int[] inputNumbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            inputNumbers[i] = Integer.parseInt(parts[i]); // No exception handling here
        }

        // Count the multiples from 1 to 9
        int[] count = new int[9]; // count[0] for 1, count[8] for 9

        for (int num : inputNumbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    count[i - 1]++;
                }
            }
        }

        // Print the result
        System.out.print("Output: {");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + "=" + count[i]);
            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}
