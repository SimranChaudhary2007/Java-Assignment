// Write a method to determine if a number is a Duck number

import java.util.Scanner;

public class Q12 {
    public static boolean isDuckNumber(int num) {
        String numStr = Integer.toString(num);

        if (numStr.charAt(0) == '0') {
            return false;
        }
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }

        scanner.close();
    }
}

