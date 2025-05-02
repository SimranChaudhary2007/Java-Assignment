// Write a method that returns the sum of squares of digits of a number

import java.util.Scanner;

public class Q14 {

    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num= scanner.nextInt();

        int result = sumOfSquaresOfDigits(num);
        System.out.println("Sum of squares of digits: " + result);

        scanner.close();
    }
}

