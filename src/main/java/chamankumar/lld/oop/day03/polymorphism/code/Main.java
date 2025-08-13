package chamankumar.lld.oop.day03.polymorphism.code;

import java.util.List;

// The Main class demonstrates the use of polymorphism, inheritance, and type checking in Java.
public class Main {

    public static void main(String[] args) {
        // Polymorphism: A Student object is assigned to a User reference.
        User student = new Student("student", "student@ck.in", "batch1", 100.0);
        student.printInfo(); // Calls the overridden printInfo method in the Student class.
    }

    // Method to reset the email of all users in the provided list.
    // Demonstrates the use of inheritance and type checking with instanceof.
    public static void resetEmail(List<User> users) {
        for (User user : users) {
            // Calls the changeEmail method from the User class to reset the email.
            user.changeEmail("");

            // Checks if the current user is an instance of the Student class.
            if (user instanceof Student) {
                // Downcasting the User reference to a Student reference.
                Student student = (Student) user;

                // Prints the student's name and PSP (Percentage Score Points).
                System.out.println("Name :" + student.getName() + " " + student.getPsp());

                // Resets the PSP value to 0.0.
                student.setPsp(0.0);
                System.out.println("Name :" + student.getName() + " " + student.getPsp());
            }
        }
    }
}

// Reusable code
// In order to reset email, I just had to call the parent's changeEmail fn
// Instead of defining a method for each class
// instanceof
// A a = (A) b;

// 1. Subtyping
//  - Compile and run time

// Method overloading - Compile time
// 2. Generic Polymorphism
// 3. Adhoc polymorphism - Duck Typing