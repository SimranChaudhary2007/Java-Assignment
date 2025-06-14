/* You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:
calculateVolume(): This method should calculate and return the area of the shape
calculateArea(): This method should calculate and return the area of the shape.
calculatePerimeter(): This method should calculate and return the perimeter of the shape.
Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for different shapes such as 
"Cube," "Cuboid," and "Cylinder." Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters. */

package Task5;

abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double s) {
        this.side = s;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }    
}

class Cuboid extends Draw {
    double l, w, h;

    Cuboid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    double calculateVolume() {
        return l * w * h;
    }

    @Override
    double calculateArea() {
        return 2 * (l * w + w * h + h * l);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (l + w + h);
    }    
}

class Cylinder extends Draw {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double calculateVolume() {
        return Math.PI * r * r * h;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r * 2;
    } 
}

public class DrawTest {
    public static void main(String[] args) {
        Draw cube = new Cube(4);
        Draw cuboid = new Cuboid(2, 3, 4);
        Draw cylinder = new Cylinder(3, 5);

        System.out.println("Cube - Volume: " + cube.calculateVolume() + ", Area: " + cube.calculateArea() + ", Perimeter: " + cube.calculatePerimeter());
        System.out.println("Cuboid - Volume: " + cuboid.calculateVolume() + ", Area: " + cuboid.calculateArea() + ", Perimeter: " + cuboid.calculatePerimeter());
        System.out.println("Cylinder - Volume: " + cylinder.calculateVolume() + ", Area: " + cylinder.calculateArea() + ", Perimeter: " + cylinder.calculatePerimeter());
    }
}
