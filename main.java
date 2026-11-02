class Student {
    int studentId;
    String studentName;
    String course;
    int age;

    Student() {
        studentId = 101;
        studentName = "Ashu";
        course = "B.Tech";
        age = 20;
    }

    Student(int id, String name, String c, int a) {
        studentId = id;
        studentName = name;
        course = c;
        age = a;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(102, "Rahul", "BCA", 21);

        System.out.println("Default Constructor Details:");
        s1.displayDetails();

        System.out.println("Parameterized Constructor Details:");
        s2.displayDetails();
    }
}
