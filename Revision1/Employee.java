/* Create a simple Employee Management System using inheritance:
● Define a base class Employee with name and ID.
● Create subclasses FullTimeEmployee and PartTimeEmployee with additional
attributes.
● Override a method calculateSalary() in each subclass and display the salary. */

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }

    // gettr
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    void calculateSalary() {
        System.out.println("Calculating salary for employee...");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part-Time Employee: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary based on hours: $" + salary);
    }
}

class EmployeeImp{
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Ram", 101, 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Sita", 102, 15.5, 120);

        fte.calculateSalary();
        pte.calculateSalary();
    }
}
