
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.print("Name: " + name + " | Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    double marks;

    Student(String name, int age, int rollNumber, double marks) {
        super(name, age); 
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayStudentInfo() {
        displayPersonInfo(); 
        System.out.print(" | Roll No: " + rollNumber + " | Marks: " + marks + "%");
    }
}

class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks);
        this.specialization = specialization;
    }

    void displayFullProfile() {
        displayStudentInfo(); 
        System.out.println(" | Specialization: " + specialization);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        System.out.println("--- Student Management System ---");

        // Creating an instance of the most specific class
        GraduateStudent grad = new GraduateStudent("Alice Smith", 24, 1001, 88.5, "Artificial Intelligence");
        GraduateStudent grad2 = new GraduateStudent("Bob Jones", 26, 1002, 91.0, "Cyber Security");

        // Displaying the information
        grad.displayFullProfile();
        grad2.displayFullProfile();
        
        System.out.println("---------------------------------");
    }
}
