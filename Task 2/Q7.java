// Write a method to swap two numbers using a temporary variable

import java.util.Scanner;

public class Q7 {
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:  a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number (a): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number (b): ");
        int num2 = scanner.nextInt();

        swap(num1, num2);

        scanner.close();
    }
}
