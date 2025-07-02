/* Implement a Java class Calculator that uses method overloading to perform the following:
● Add two integers
● Add two doubles
● Concatenate two strings
● Demonstrate all methods in the main method */

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

class CalcImp{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumInt = calc.add(10, 20);
        double sumDouble = calc.add(5.5, 3.3);
        String concatStr = calc.add("Hello, ", "World!");

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
        System.out.println("Concatenated String: " + concatStr);
    }
}
