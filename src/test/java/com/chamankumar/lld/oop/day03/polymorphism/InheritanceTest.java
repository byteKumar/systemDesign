package com.chamankumar.lld.oop.day03.polymorphism;

import chamankumar.lld.oop.day03.polymorphism.code.Mentor;
import chamankumar.lld.oop.day03.polymorphism.code.Student;
import chamankumar.lld.oop.day03.polymorphism.code.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {

    @Test
    public void testStudentInheritance() {
        // Create a Student object
        User student = new Student("John Doe", "john.doe@example.com", "Batch A", 85.0);

        // Verify that the object is an instance of User and Student
        assertTrue(student instanceof User, "Student should be an instance of User");
        assertTrue(student instanceof Student, "Student should be an instance of Student");

        // Verify overridden method
        student.printInfo(); // Should print student-specific information
    }

    @Test
    public void testMentorInheritance() {
        // Create a Mentor object
        List<Student> mentees = new ArrayList<>();
        mentees.add(new Student("Jane Doe", "jane.doe@example.com", "Batch B", 90.0));
        User mentor = new Mentor("Alice", "alice@example.com", mentees, "TechCorp");

        // Verify that the object is an instance of User and Mentor
        assertTrue(mentor instanceof User, "Mentor should be an instance of User");
        assertTrue(mentor instanceof Mentor, "Mentor should be an instance of Mentor");

        // Verify overridden method
        mentor.printInfo(); // Should print mentor-specific information
    }

    @Test
    public void testPolymorphism() {
        // Create a list of users
        List<User> users = new ArrayList<>();
        users.add(new Student("John Doe", "john.doe@example.com", "Batch A", 85.0));
        users.add(new Mentor("Alice", "alice@example.com", new ArrayList<>(), "TechCorp"));

        // Iterate through the list and call printInfo
        for (User user : users) {
            user.printInfo(); // Should call the appropriate overridden method
        }
    }
}