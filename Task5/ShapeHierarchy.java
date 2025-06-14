/* You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:
calculateArea(): This method should calculate and return the area of the shape.
calculatePerimeter(): This method should calculate and return the perimeter of the shape.
Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for different shapes such as 
"Circle," "Rectangle," and "Triangle." Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters. */

package Task5;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
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

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
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

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
} 
public class ShapeHierarchy{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle: Area = " + circle.calculateArea() + ", Perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle: Area = " + rectangle.calculateArea() + ", Perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Triangle: Area = " + triangle.calculateArea() + ", Perimeter = " + triangle.calculatePerimeter());
    }
}