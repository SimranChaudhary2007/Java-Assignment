/*  Create an abstract class called Shape with an abstract method called calculateArea(). Implement two subclasses called Rectangle and Circle 
that inherit from Shape. Override the calculateArea() method in both subclasses to calculate and return the area of a rectangle and a circle, 
respectively. Write the Java code to implement this scenario with Scanner Input. */

package Task5;

import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double calculateArea() {
        return length * width;
    }    
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) {
        this.radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }    
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length and width of rectangle: ");
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        Shape rect = new Rectangle(l, w);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        
        System.out.print("Enter radius of circle: ");
        double r = scanner.nextDouble();
        Shape circle = new Circle(r);
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
