/* Create an abstract class called Bird with an abstract method called fly(). Implement two subclasses called Eagle and Penguin that 
inherit from Bird. Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot. Implement the Java code 
for this scenario. */

package Task5;

abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {

    @Override
    void fly() {
        System.out.println("Eagle can fly high.");
    }
    
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();
        penguin.fly();
    }
}
