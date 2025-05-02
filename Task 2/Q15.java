// Create a method to count uppercase and lowercase characters in a string

import java.util.Scanner;

public class Q15 {

    public static void countUpperAndLowerCase(String str) {
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        countUpperAndLowerCase(userInput);

        scanner.close();
    }
}

