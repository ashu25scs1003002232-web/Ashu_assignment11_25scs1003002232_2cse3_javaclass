class Employee {
    int employeeId;
    String name;
    String designation;
    double salary;

    Employee() {
        employeeId = 101;
        name = "Ashu";
        designation = "Developer";
        salary = 25000;
    }

    Employee(int id, String n, String d, double s) {
        employeeId = id;
        name = n;
        designation = d;
        salary = s;
    }

    Employee(Employee e) {
        employeeId = e.employeeId;
        name = e.name;
        designation = e.designation;
        salary = e.salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(
            102, "Rahul", "Manager", 40000
        );

        Employee e3 = new Employee(e2);

        System.out.println("Default Constructor:");
        e1.displayDetails();

        System.out.println("Parameterized Constructor:");
        e2.displayDetails();

        System.out.println("Copy Constructor:");
        e3.displayDetails();
    }
}

