import java.util.Scanner;

public class NameToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        try {
            int number = Integer.parseInt(name.substring(0, 3));
            System.out.println("Converted number: " + number);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters are not numeric.");
        }
    }
}

