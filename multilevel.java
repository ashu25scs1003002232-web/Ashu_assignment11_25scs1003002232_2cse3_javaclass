class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID     : " + employeeId);
        System.out.println("Employee Name   : " + employeeName);
        System.out.println("Basic Salary    : $" + basicSalary);
    }
}

class Manager extends Employee {
    protected String department;
    protected int teamSize;

    public Manager(int employeeId, String employeeName, double basicSalary, String department, int teamSize) {
        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department      : " + department);
        System.out.println("Team Size       : " + teamSize);
    }
}

class ProjectManager extends Manager {
    private String projectName;
    private String projectDuration;

    public ProjectManager(int employeeId, String employeeName, double basicSalary, 
                          String department, int teamSize, String projectName, String projectDuration) {
        super(employeeId, employeeName, basicSalary, department, teamSize); 
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    public void displayProjectManagerDetails() {
        System.out.println("=== Project Manager Complete Details ===");
        displayManagerDetails(); 
        System.out.println("Project Name    : " + projectName);
        System.out.println("Project Duration: " + projectDuration);
    }
}

public class Main {
    public static void main(String[] args) {
   
        ProjectManager pm = new ProjectManager(
            101, 
            "Alice Smith", 
            85000.50, 
            "Software Engineering", 
            12, 
            "AI Cloud Migration", 
            "6 Months"
        );

        pm.displayProjectManagerDetails();
    }
}
