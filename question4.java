import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Month ka number daalo (1-12): ");
        int month = sc.nextInt(); // User se number liya

        // Yahan se switch ka magic shuru
        switch (month) {
            case 1:
                System.out.println("January");
                break; // Kaam khatam, bahar niklo
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                // Agar user ne 1-12 ke alawa kuch aur daala
                System.out.println("Invalid Month! Sahi number daalo bhai.");
        }

        sc.close(); // Scanner ko close karna acchi aadat hoti hai
    }
}