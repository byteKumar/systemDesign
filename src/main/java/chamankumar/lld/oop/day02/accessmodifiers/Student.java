package chamankumar.lld.oop.day02.accessmodifiers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The Student class represents a student entity with attributes such as name, email, batch name, PSP (Problem Solving Percentage),
 * and status. It provides functionality to validate PSP values and change the student's status.
 *
 * Motivation:
 * This class is designed to demonstrate the use of access modifiers, constructors, and encapsulation in object-oriented programming.
 * It also includes validation logic to ensure data integrity (e.g., PSP range validation).
 */
@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class Student {

    // Name of the student
    private String name;

    // Email address of the student
    private String email;

    // Name of the batch the student belongs to
    private String batchName;

    // Problem Solving Percentage (PSP) of the student, must be between 0 and 100
    private Double psp;

    // Current status of the student, default is ACTIVE
    private StudentStatus status = StudentStatus.ACTIVE;

    /**
     * Parameterized constructor to initialize a Student object with specific values.
     * Validates the PSP value to ensure it is within the range of 0 to 100.
     *
     * @param name      Name of the student
     * @param email     Email address of the student
     * @param batchName Name of the batch the student belongs to
     * @param psp       Problem Solving Percentage (must be between 0 and 100)
     * @param status    Current status of the student
     * @throws IllegalArgumentException if PSP is not within the valid range
     */
    public Student(String name, String email, String batchName, Double psp, StudentStatus status) {
        if (psp > 100 || psp < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.email = email;
        this.batchName = batchName;
        this.psp = psp;
        this.status = status;
    }

    // Default constructor is commented out as @NoArgsConstructor is used
    // public Student() {}

    /**
     * Changes the status of the student to a new status.
     * If the current status is DONE, it cannot be changed further.
     *
     * @param newStatus The new status to be assigned to the student
     * @return The updated status of the student
     */
    public StudentStatus changeStatus(StudentStatus newStatus) {
        if (this.status == StudentStatus.DONE) {
            return StudentStatus.DONE;
        }

        this.status = newStatus;
        return this.status;
    }
}