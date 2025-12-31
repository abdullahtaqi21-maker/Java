abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displaydetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private final double salary;
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeMangement {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Jack", 14335561, 60000);
        Employee emp2 = new PartTimeEmployee("Bob", 14335562, 20, 40);
        emp1.displaydetails();
        emp2.displaydetails();
    }
}