// Input three numbers and print the largest using if-else.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" is largest number.");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" is largest number.");
        }
        else {
           System.out.println(num3+" is largest number.");
        }

        scanner.close();
    }
    
}
