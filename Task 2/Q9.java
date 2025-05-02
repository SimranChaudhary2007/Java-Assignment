// Create a method to find the sum of the first n natural numbers

import java.util.Scanner;

public class Q9 {
    public static int SumofNaturaNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int totalsum = SumofNaturaNumber(num);
        System.out.println("Sum of first "+num+" natutal number is "+totalsum);

        scanner.close();

    }
}
