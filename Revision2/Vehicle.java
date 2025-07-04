/* 1. Develop a Java program that demonstrates multi-level inheritance:
● Create a base class Animal with method makeSound().
● Create a subclass Mammal and another subclass Dog that overrides the method.
● In the main method, show how overriding works.*/

public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
}

class ElectricCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Electric car uses battery power.");
    }
}

class VehicleImp {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start(); 
        c.fuelType();

        ElectricCar e = new ElectricCar();
        e.start();
        e.fuelType();
    }
}
