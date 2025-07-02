/* Write a Java program that demonstrates constructor overloading.
● Create a Product class with attributes like id, name, and price.
● Provide multiple constructors to initialize these attributes differently.
● Display the product details using a method. */

public class Product {
    int id;
    String name;
    double price;

    public Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }

    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

class ProductImp{
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Notebook");
        Product p3 = new Product(102, "Pen", 10.5);

        p1.display();
        p2.display();
        p3.display();
    }
}
