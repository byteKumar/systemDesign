package com.chamankumar.lld.oop.day08.Builder;

import chamankumar.lld.oop.day08.Builder.code.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for the `Student` class to validate the Builder design pattern implementation.
 * Contains unit tests to ensure the correctness of the `Student` class and its builder.
 */
public class StudentTest {

    /**
     * Test the builder functionality for creating a `Student` object.
     * Validates that the `fname` and `lname` fields are correctly set using the builder.
     */
    @Test
    public void testBuilder() {
        Student student = Student
                .builder()
                .setFname("chaman") // Set the first name
                .setLname("kumar")  // Set the last name
                .build();           // Build the `Student` object

        // Assert that the `fname` and `lname` fields are correctly set
        assertEquals("chaman", student.getFname(), "if fname setter is called, host should be chaman");
        assertEquals("kumar", student.getLname(), "if lname setter is called, host should be kumar");
    }

    /**
     * Test the builder functionality using Lombok's `@Builder` annotation.
     * Validates that the `fname` and `lname` fields are correctly set using the builder.
     */
    @Test
    public void testLombookBuilder() {
        Student student = Student.builder()
                .setFname("chaman") // Set the first name
                .setLname("kumar")  // Set the last name
                .build();           // Build the `Student` object

        // Assert that the `fname` and `lname` fields are correctly set
        assertEquals("chaman", student.getFname(), "if fname setter is called, host should be chaman");
        assertEquals("kumar", student.getLname(), "if lname setter is called, host should be kumar");
    }

    /**
     * Test the creation of a new `Student` object using the builder.
     * Validates that the `fname` field is correctly set and retrieved.
     */
    @Test
    public void testNewStudent() {
        Student.StudentBuilder builder = new Student.StudentBuilder(); // Create a new builder instance
        builder.setFname("John")       // Set the first name
                .setLname("Doe")       // Set the last name
                .setEmail("")          // Set the email (empty in this case)
                .setPhone("")          // Set the phone (empty in this case)
                .setAddress("");       // Set the address (empty in this case)
        Student student = builder.build(); // Build the `Student` object

        // Assert that the `fname` field is correctly set
        assertEquals("John", student.fname, "If name is set, on fetching it should be the same");
    }

    /**
     * Test the validation logic in the builder.
     * Ensures that an exception is thrown if required fields (`fname` and `lname`) are not set.
     */
    @Test
    public void testValidStudent() {
        Student.StudentBuilder builder = new Student.StudentBuilder(); // Create a new builder instance
        builder.setEmail("")          // Set the email (empty in this case)
                .setPhone("")          // Set the phone (empty in this case)
                .setAddress("");       // Set the address (empty in this case)

        // Assert that an exception is thrown when trying to build an invalid `Student` object
        assertThrows(IllegalArgumentException.class, builder::build);
    }
}