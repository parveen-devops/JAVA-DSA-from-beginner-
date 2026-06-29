import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, operation;

        System.out.print("Enter first number (a): ");
        a = input.nextInt();

        System.out.print("Enter second number (b): ");
        b = input.nextInt();

        System.out.println("\nChoose an operation from the menu:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");
        System.out.print("Enter your choice (1-5): ");
        operation = input.nextInt();

        System.out.print("\nResult: ");
        switch (operation) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:

                if (b == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    System.out.println(a / b);
                }
                break;

            case 5:

                if (b == 0) {
                    System.out.println("Error! Modulo by zero is not allowed.");
                } else {
                    System.out.println(a % b);
                }
                break;

            default:

                System.out.println("Invalid Choice! Please select between 1 to 5.");
                break;
        }

        input.close();
    }
}