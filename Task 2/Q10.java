// Write a method to print all factors of a number

import java.util.Scanner;

public class Q10 {
    public static void factor(int n) {
        System.out.print("Factors of "+n+" are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        factor(num);

    }
}