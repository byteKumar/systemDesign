package chamankumar.lld.oop.day03.polymorphism.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// The User class serves as a base class for other entities like Mentor and Student.
// It provides common properties and methods that can be inherited and reused.
@Getter // Lombok annotation to automatically generate getter methods for all fields.
@Setter // Lombok annotation to automatically generate setter methods for all fields.
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields as parameters.
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor.
public class User {
    private String name; // Represents the name of the user.
    private String email; // Represents the email of the user.

    // The commented-out constructor is replaced by the @AllArgsConstructor and @NoArgsConstructor annotations.

    // Method overloading is demonstrated in this class.
    // Method signature is determined by:
    // 1. Method name
    // 2. Number of arguments
    // 3. Data type of arguments

    // A placeholder method to print user information.
    public void printInfo() {
    }

    // Overloaded method to print user information with a title.
    public void printInfo(String title) {
        System.out.println(" \n User: " + title + " " + this.getName());
    }

    // Method to update the email of the user.
    public void changeEmail(String email) {
        this.email = email;
    }
}


// Interfaces
// Class - Blueprint
// Interface - Blue print of behaviour
// Database db = new MySqlDB();
// Interfaces - define methods with an impl.
// Abstract - mixture of interface and class
// implemented methods + not-implemented
// Abstract classes - state