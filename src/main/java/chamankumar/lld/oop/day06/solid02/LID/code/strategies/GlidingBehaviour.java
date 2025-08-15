package chamankumar.lld.oop.day06.solid02.LID.code.strategies;

/**
 * Class representing a specific flying behavior: gliding.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - This class can be used as a substitute for `FlyingBehaviour` without altering the correctness of the program.
 * - Ensures that the behavior is consistent with the abstraction it implements.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Implements only the `FlyingBehaviour` interface, focusing on flying-related behavior.
 * - Avoids forcing the implementation of unrelated methods.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - High-level modules depend on the abstraction (`FlyingBehaviour`) rather than this concrete implementation.
 * - Promotes flexibility and decoupling between modules.
 */
public class GlidingBehaviour implements FlyingBehaviour {

    /**
     * Method to define the flying behavior by gliding.
     * This method can be customized to provide specific details about how the bird glides.
     */
    @Override
    public void fly() {
        // Implementation of gliding behavior
        System.out.println("Gliding smoothly through the air.");
    }
}