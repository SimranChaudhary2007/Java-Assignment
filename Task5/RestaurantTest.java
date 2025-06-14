/* You are developing a restaurant management system that handles different types of employees, such as chefs and waiters. Design an interface 
named "Employee" with the following methods:
work(): This method should define the work responsibilities of the employee.
getSalary(): This method should return the salary of the employee. */

package Task5;

interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {

    @Override
    public void work() {
        System.out.println("Chef is cooking.");
    }

    @Override
    public double getSalary() {
        return 30000;
    }  
}

class Waiter implements Employee {

    @Override
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return 20000;
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();
        chef.work();
        System.out.println("Chef Salary: " + chef.getSalary());
        waiter.work();
        System.out.println("Waiter Salary: " + waiter.getSalary());
    }
}
