package chamankumar.lld.oop.day03.polymorphism.code;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

// The Mentor class extends the User class, inheriting its properties and methods.
// It represents a mentor who has a list of mentees (students) and is associated with a company.
@Getter // Lombok annotation to automatically generate getter methods for all fields.
public class Mentor extends User {
    private List<Student> mentees = new ArrayList<>(); // A list to store the students mentored by this mentor.
    private String company; // The company the mentor is associated with.

    // Constructor to initialize the Mentor object with name, email, mentees, and company.
    public Mentor(String name, String email, List<Student> mentees, String company) {
        super(name, email); // Calls the constructor of the parent User class to set name and email.
        this.mentees = mentees; // Initializes the list of mentees.
        this.company = company; // Sets the company name.
    }
}