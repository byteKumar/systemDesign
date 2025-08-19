package chamankumar.lld.oop.day08.Builder.code;

import lombok.Builder;
import lombok.Getter;

/**
 * The `Student` class demonstrates the Builder design pattern.
 * This pattern is used to create complex objects step-by-step while ensuring immutability and validation.
 */
@Getter
@Builder
public class Student {

    // Fields representing the Student's attributes
    public String fname;    // First name of the student
    public String lname;    // Last name of the student
    public String email;    // Email address of the student
    public String phone;    // Phone number of the student
    public String address;  // Address of the student
    public int age;         // Age of the student

    // Private constructor to prevent direct instantiation
    private Student() {}

    /**
     * Static method to create a builder instance.
     * This method is static because it allows access to the builder without needing an instance of the `Student` class.
     * @return A new instance of `StudentBuilder`.
     */
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    /**
     * Static inner class implementing the Builder pattern.
     * Responsible for constructing `Student` objects.
     */
    public static class StudentBuilder {

        // Using a single instance of the outer class to avoid duplicate fields
        private final Student student;

        // Initialize the builder with a new `Student` instance
        public StudentBuilder() {
            this.student = new Student();
        }

        /**
         * Getter for the `fname` field.
         * @return The first name of the student.
         */
        public String getFname() {
            return student.fname;
        }

        /**
         * Setter for the `fname` field using a fluent interface.
         * @param fname The first name of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setFname(String fname) {
            student.fname = fname;
            return this;
        }

        /**
         * Getter for the `lname` field.
         * @return The last name of the student.
         */
        public String getLname() {
            return student.lname;
        }

        /**
         * Setter for the `lname` field using a fluent interface.
         * @param lname The last name of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setLname(String lname) {
            student.lname = lname;
            return this;
        }

        /**
         * Getter for the `email` field.
         * @return The email address of the student.
         */
        public String getEmail() {
            return student.email;
        }

        /**
         * Setter for the `email` field using a fluent interface.
         * @param email The email address of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setEmail(String email) {
            student.email = email;
            return this;
        }

        /**
         * Getter for the `phone` field.
         * @return The phone number of the student.
         */
        public String getPhone() {
            return student.phone;
        }

        /**
         * Setter for the `phone` field using a fluent interface.
         * @param phone The phone number of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setPhone(String phone) {
            student.phone = phone;
            return this;
        }

        /**
         * Getter for the `address` field.
         * @return The address of the student.
         */
        public String getAddress() {
            return student.address;
        }

        /**
         * Setter for the `address` field using a fluent interface.
         * @param address The address of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setAddress(String address) {
            student.address = address;
            return this;
        }

        /**
         * Getter for the `age` field.
         * @return The age of the student.
         */
        public Integer getAge() {
            return student.age;
        }

        /**
         * Setter for the `age` field using a fluent interface.
         * @param age The age of the student.
         * @return The current builder instance.
         */
        public StudentBuilder setAge(Integer age) {
            student.age = age;
            return this;
        }

        /**
         * Build method to create the `Student` object.
         * Validates the object before creation.
         * @return A valid `Student` object.
         * @throws IllegalArgumentException If validation fails.
         */
        public Student build() {
            if (!isValid()) {
                throw new IllegalArgumentException("Object is not valid");
            }
            return student;
        }

        /**
         * Validation hook to ensure the `Student` object is valid.
         * @return True if the object is valid, false otherwise.
         */
        public boolean isValid() {
            return student.fname != null && student.lname != null;
        }
    }
}