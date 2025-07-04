/* Create a program that demonstrates the use of static variables and methods:
● Define a class Counter that tracks how many objects have been created.
● Use a static variable and a static method to display the total count.
● Test it by creating multiple objects in the main method. */

public class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

class CounterImp {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();
    }
}

