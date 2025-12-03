import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            try {
                double result = 0;
                boolean validOp = true;
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
                        if(b == 0) throw new ArithmeticException();
                        result = a / b;
                        break;
                    case '%':
                        if(b == 0) throw new ArithmeticException();
                        result = a % b;
                        break;
                    default:
                        System.out.println("Invalid operator");
                        validOp = false;
                }
                if (validOp) {
                    System.out.println("Result: " + result);
                }
            } catch(ArithmeticException e) {
                System.out.println("Cannot divide by zero");
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