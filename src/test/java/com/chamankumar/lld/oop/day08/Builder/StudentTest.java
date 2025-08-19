package com.chamankumar.lld.oop.day08.Builder;

import chamankumar.lld.oop.day08.Builder.code.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    public void testBuilder() {
        Student student = Student
                .builder()
                .setFname("chaman")
                .setLname("kumar")
                .build();

        assertEquals("chaman", student.getFname(), "if fname setter is called, host should be chaman");
        assertEquals("kumar", student.getLname(), "if lname setter is called, host should be kumar");
    }

    @Test
    public void testLombookBuilder() {
        Student student = Student.builder().setFname("chaman").setLname("kumar").build();

        assertEquals("chaman", student.getFname(), "if fname setter is called, host should be chaman");
        assertEquals("kumar", student.getLname(), "if lname setter is called, host should be kumar");
    }

    @Test
    public void testNewStudent() {
        Student.StudentBuilder builder = new Student.StudentBuilder();
        builder.setFname("John")
                .setLname("Doe")
                .setEmail("")
                .setPhone("")
                .setAddress("");
        Student student = builder.build();
        assertEquals("John", student.fname, "If name is set, on fetching it should be the same");

    }

    @Test
    public void testValidStudent() {
        Student.StudentBuilder builder = new Student.StudentBuilder();
        builder.setEmail("")
                .setPhone("")
                .setAddress("");
        assertThrows(IllegalArgumentException.class, builder::build);
    }
}
