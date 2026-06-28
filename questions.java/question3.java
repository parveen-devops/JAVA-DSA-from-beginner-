import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: (a)");
        double a = scanner.nextDouble();
        System.out.print("Enter a second number: (b)");
        double b = scanner.nextDouble();

        System.out.println("\nSelect an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("\nEnter your choice (1-5): ");

        int choice = scanner.nextInt();
        double result = 0;
        boolean validOperation = true;
        String operator = "";

        switch (choice) {
            case 1:
                result = a + b;
                operator = "+";
                break;
            case 2:
                result = a - b;
                operator = "-";
                break;
            case 3:
                result = a * b;
                operator = "*";
                break;
            case 4:
                if (b == 0) {
                    System.out.println("\nError: Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = a / b;
                    operator = "/";
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("\nError: Cannot perform modulo by zero!");
                    validOperation = false;
                } else {
                    result = a % b;
                    operator = "%";
                }
                break;
            default:
                System.out.println("\nError: Invalid operation choice! Please select 1-5.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("\nResult: " + a + " " + operator + " " + b + " = " + result);
        }

        scanner.close();
    }
}
