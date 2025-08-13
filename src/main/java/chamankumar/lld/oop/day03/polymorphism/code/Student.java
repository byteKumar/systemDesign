package chamankumar.lld.oop.day03.polymorphism.code;

import lombok.Getter;
import lombok.Setter;

// The Student class extends the User class, inheriting its properties and methods.
// It represents a student with additional attributes like batch name, PSP (percentage score points), and status.
@Getter // Lombok annotation to automatically generate getter methods for all fields.
@Setter // Lombok annotation to automatically generate setter methods for all fields.
//@NoArgsConstructor // Lombok annotation to generate a no-argument constructor.
// @AllArgsConstructor is commented out as it is not used in this class.
public class Student extends User {

    private String batchName; // The name of the batch the student belongs to.
    private Double psp; // The student's percentage score points (PSP), which must be between 0 and 100.
    private StudentStatus status = StudentStatus.ACTIVE; // The current status of the student, defaulting to ACTIVE.

    // Constructor to initialize a Student object with name, email, batch name, and PSP.
    // Validates that PSP is within the range of 0 to 100.
    public Student(String name, String email, String batchName, Double psp) {
        super(name, email); // Calls the constructor of the parent User class to set name and email.
        if (psp > 100 || psp < 0) { // Validates PSP value.
            throw new IllegalArgumentException("PSP should be between 0 and 100");
        }
        this.batchName = batchName; // Sets the batch name.
        this.psp = psp; // Sets the PSP value.
    }

    // Default constructor is explicitly defined but commented out as @NoArgsConstructor is used.
    public Student() {}

    // Method to change the student's status.
    // If the current status is DONE, it cannot be changed further.
    public StudentStatus changeStatus(StudentStatus newStatus) {
        if (this.status == StudentStatus.DONE) { // Prevents changing status if it is already DONE.
            return StudentStatus.DONE;
        }
        this.status = newStatus; // Updates the status to the new value.
        return this.status;
    }

    // Method to change the batch name of the student.
    void changeBatch(String batchName) {
        this.batchName = batchName;
    }

    // Overrides the printInfo method from the User class to display student-specific information.
    @Override
    public void printInfo() {
        System.out.println("\nStudent: " + getName() + " " + getBatchName());
    }
}