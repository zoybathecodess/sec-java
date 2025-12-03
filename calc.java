import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            double a = 0, b = 0;
            char op = ' ';
            try {
                System.out.print("Enter first number: ");
                a = sc.nextDouble();
                System.out.print("Enter second number: ");
                b = sc.nextDouble();
                System.out.print("Enter operator (+, -, *, /, %): ");
                op = sc.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers and operator.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }

            try {
                double result = 0;
                switch(op) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        if(b == 0) throw new ArithmeticException("Cannot divide by zero");
                        result = a / b;
                        break;
                    case '%':
                        if(b == 0) throw new ArithmeticException("Cannot divide by zero");
                        result = a % b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }
                System.out.println("Result: " + result);
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                continueCalculating = false;
            }
        }
        System.out.println("Calculator closed.");
    }
}
