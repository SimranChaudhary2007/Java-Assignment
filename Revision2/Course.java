/* Write a Java program for a basic course registration system:
● Define a class Course with courseId, courseName, and instructor.
● Allow registering multiple courses using an ArrayList.
● Display all registered courses in a formatted output. */

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    String courseId;
    String courseName;
    String instructor;

    public Course(String courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("-----------------------");
    }
}

// Main class
class CourseImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        System.out.print("Enter number of courses to register: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Course " + (i + 1));
            System.out.print("Course ID: ");
            String id = sc.nextLine();
            System.out.print("Course Name: ");
            String name = sc.nextLine();
            System.out.print("Instructor: ");
            String instructor = sc.nextLine();

            courses.add(new Course(id, name, instructor));
        }

        System.out.println("\n--- Registered Courses ---");
        for (Course c : courses) {
            c.display();
        }

        sc.close();
    }
}
