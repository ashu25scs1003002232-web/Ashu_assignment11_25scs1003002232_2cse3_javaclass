class Person {
    String name;
    int age;
    String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, String email,
            int studentId, String course) {

        super(name, age, email);

        this.studentId = studentId;
        this.course = course;
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(
            "Ashu", 20, "ashu@gmail.com",
            101, "B.Tech CSE"
        );

        System.out.println("Personal Details:");
        s1.displayPersonDetails();

        System.out.println("\nAcademic Details:");
        s1.displayStudentDetails();
    }
}
