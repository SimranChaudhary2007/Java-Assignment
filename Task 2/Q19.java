// Create a method that accepts a character and returns its ASCII value

import java.util.Scanner;

public class Q19 {
    public static int AsciiValue(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = AsciiValue(inputChar);
        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        scanner.close();
    }
}
