// Write a method to generate the first n terms of the Fibonacci series

import java.util.Scanner;

public class Q18 {
    public static void Fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");

        if (n > 0) System.out.print(a + " ");
        if (n > 1) System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        Fibonacci(n);

        scanner.close();
    }
}

