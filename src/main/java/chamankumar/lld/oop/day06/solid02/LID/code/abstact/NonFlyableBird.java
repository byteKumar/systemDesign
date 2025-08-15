package chamankumar.lld.oop.day06.solid02.LID.code.abstact;

import chamankumar.lld.oop.day06.solid02.LID.code.Bird;

/**
 * Abstract class representing birds that cannot fly.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - Subclasses of `NonFlyableBird` should be substitutable for `Bird` without altering the correctness of the program.
 * - This ensures that `NonFlyableBird` can be used wherever `Bird` is expected, maintaining program behavior.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Focuses on non-flying behavior, segregating it from flying behavior.
 * - Ensures that subclasses only implement methods relevant to non-flying birds.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - High-level modules depend on abstractions (`Bird` class) rather than concrete implementations.
 * - Promotes flexibility and decoupling between high-level and low-level modules.
 */
public abstract class NonFlyableBird extends Bird {

    /**
     * Constructor to initialize common attributes of a non-flyable bird.
     *
     * @param weight   Weight of the bird
     * @param colour   Color of the bird
     * @param size     Size of the bird
     * @param beakType Type of the bird's beak
     */
    public NonFlyableBird(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }
}