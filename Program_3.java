package recruitment;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        Program_3.generateConditionalSeries(a);

        scanner.close();
    }
    public static void generateConditionalSeries(int a) {

        int count = (a % 2 == 0) ? a - 1 : a;
        int number = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(number);
            if (i < count - 1) {
                System.out.print(", ");
            }
            number += 2;
        }
    }

}


