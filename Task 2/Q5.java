// Write a method to calculate the compound interest given principal, rate, and time

import java.util.Scanner;

public class Q5 {
    public static double CompoundInterest(double principal, double rate, double time) {
      
        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;
        return compoundInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double interest = CompoundInterest(principal, rate, time);

        System.out.printf("Compound Interest = %.2f\n", interest);

        sc.close();
    }
}