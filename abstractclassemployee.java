
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    abstract double calculateSalary();

    
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee {
    double hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, double hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Alice", 101, 50000);
        PartTimeEmployee pt = new PartTimeEmployee("Bob", 102, 80, 300);

        ft.displayInfo();
        System.out.println("Full-Time Salary: " + ft.calculateSalary());

        pt.displayInfo();
        System.out.println("Part-Time Salary: " + pt.calculateSalary());
    }
}