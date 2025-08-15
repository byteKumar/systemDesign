package chamankumar.lld.oop.day06.solid02.LID.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Abstract class representing a generic bird.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - Subclasses of `Bird` should be substitutable for `Bird` without altering the correctness of the program.
 * - This ensures that any specific type of bird can be used wherever `Bird` is expected.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - High-level modules depend on abstractions (`Bird` class) rather than concrete implementations.
 * - Promotes flexibility and decoupling between high-level and low-level modules.
 */
@Getter
@AllArgsConstructor
public abstract class Bird {

    /**
     * Weight of the bird in kilograms.
     */
    private Double weight;

    /**
     * Color of the bird.
     */
    private String colour;

    /**
     * Size of the bird in meters.
     */
    private Double size;

    /**
     * Type of the bird's beak.
     */
    private String beakType;

    /**
     * Abstract method to define the sound a bird makes.
     * Subclasses must implement this method to provide specific sound behavior.
     */
    public abstract void makeSound();
}