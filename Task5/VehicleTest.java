/* Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). Implement two subclasses called Car 
and Motorcycle that inherit from Vehicle. Implement the startEngine() and stopEngine() methods in both subclasses to start and stop the 
engines of a car and a motorcycle, respectively. */

package Task5;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }

}

class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
