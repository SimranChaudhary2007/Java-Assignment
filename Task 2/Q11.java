// Create a method to calculate the cube of a given number

import java.util.Scanner;

public class Q11 {
    public static int Cube(int n) {
        return n * n* n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = Cube(num);
        System.out.println("Cube of "+num+" is "+result);
        
        scanner.close();
    }
}
