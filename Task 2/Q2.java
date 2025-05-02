// Create a method to convert a given number of days into years, months, and days

import java.util.Scanner;

public class Q2 {
    public static void convert(int n) {
        int year = n / 365;
        System.out.println("Year = "+year);
        int months = (n % 365) / 30;
        System.out.println("Months = "+months);
        int days = (n % 365) % 30;
        System.out.println("Days = "+days);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter days: ");
        int num = scanner.nextInt();

        convert(num);

        scanner.close();
    }
    
}
