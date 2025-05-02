// Write a method to count the number of words in a given string

import java.util.Scanner;

public class Q4 {
    public static void count(String a){
        for (int i = 1; i <= a.length(); i++) {
        }
        System.out.print(a.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        count(str);

        sc.close();
    }
    
}
