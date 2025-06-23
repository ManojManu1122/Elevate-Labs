
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose the operation which you want to perform: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int n = sc.nextInt();

            if (n == 5) {
                System.out.println("Exiting the Calculator. Thank you!");
                break;
            }

            System.out.println("Enter two numbers to perform the operation:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (n) {
                case 1:
                    addNumbers(a, b);
                    break;
                case 2:
                    subtractNumbers(a, b);
                    break;
                case 3:
                    System.out.println("The multiplication of two numbers is: " + multiplyNumbers(a, b));
                    break;
                case 4:
                    divideNumbers(a, b);
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }

        }
        sc.close();
    }

    static void addNumbers(int a, int b) {
        System.out.println("The addition of two numbers is: " + (a + b));
    }

    static void subtractNumbers(int a, int b) {
        System.out.println("The subtraction of two numbers is: " + (a - b));
    }

    static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    static void divideNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero. Kindly enter valid numbers for division.");
        } else {
            int c = a / b;
            int d = a % b;
            System.out.println("The quotient is: " + c + ", The remainder is: " + d);
        }
    }
}
