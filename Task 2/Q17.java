// Create a method to reverse an integer number without converting it to a string

import java.util.Scanner;

public class Q17 {
    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
