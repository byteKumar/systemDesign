package com.chamankumar.lld.oop.day02.accessmodifiers;

import static org.junit.jupiter.api.Assertions.*;

import chamankumar.lld.oop.day02.accessmodifiers.Student;
import chamankumar.lld.oop.day02.accessmodifiers.StudentStatus;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentInstance() {
        Student student = new Student();

        assertNotNull(student, "If default ctor is called, the instance must not be null");
        assertNull(student.getName(), "If default ctor is called, the instance name must be null");
        assertEquals(StudentStatus.ACTIVE, student.getStatus(),
                "If default ctor is called, the status should be ACTIVE");


    }
}