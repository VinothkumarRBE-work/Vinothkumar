package recruitment;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        Program_2.generateSeries(input);

        scanner.close();
    }

    //method to generate the series
    public static void generateSeries(int userInput) {
        int number = 1;

        for (int i = 0; i < userInput; i++) {
            System.out.print(number);
            if (i < userInput - 1) {
                System.out.print(", ");
            }
            number += 2;
        }
    }

   
}
