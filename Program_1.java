package recruitment;

import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a (double): ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b (double): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation\nadd \nsubtract \nmultiply \ndivide: \n");
        String operation = scanner.next();

        Program_1.calculate(a, b, operation);
        scanner.close();
    }

    public static void calculate(double a, double b, String operation) {
        switch(operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println("Result: " + (a / b));
                }   break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }


}
