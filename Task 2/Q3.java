// Write a method to determine whether a number is a Harshad number or not

import java.util.Scanner;

public class Q3 {
    public static boolean Harshad(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return originalNum % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (Harshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        scanner.close();
    }
}