// Create a method to check whether a given number is a palindrome prime

import java.util.Scanner;

public class Q6 {
    public static void palindrome (int n) {
        int reverse = 0;

        for (int i = n; i != 0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }

        if (n == reverse) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = scanner.nextInt();
      
        palindrome(original);

        scanner.close();
    }
}
