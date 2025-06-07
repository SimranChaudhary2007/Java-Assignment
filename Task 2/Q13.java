// Create a method to print the multiplication tables from 1 to 10

import java.util.Scanner;

public class Q13 {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            int multi = n * i;
            System.out.println(n+" X "+i+" = "+multi);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Multiplication table of: ");
        int num = scanner.nextInt();

        table(num);

        scanner.close();
    }
    
}
