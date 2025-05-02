// Write a method to check if a number is a Kaprekar number

import java.util.Scanner;

public class Q16 {

    public static boolean isKaprekar(int n) {
        if (n < 1) {
            return false;
        }

        long square = (long) n * n;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();

        for (int i = 1; i < len; i++) {
            String leftPart = squareStr.substring(0, i);
            String rightPart = squareStr.substring(i);

            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);

            if (right != 0 && (left + right == n)) {
                return true;
            }
        }

        return n == 1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}

