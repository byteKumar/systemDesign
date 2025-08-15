package chamankumar.lld.oop.day06.solid02.LID.code.abstact;

import chamankumar.lld.oop.day06.solid02.LID.code.Bird;

/**
 * Abstract class representing birds that can fly.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - Subclasses of `FlyableBird` should be substitutable for `Bird` without altering the correctness of the program.
 * - This ensures that `FlyableBird` can be used wherever `Bird` is expected, maintaining program behavior.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Focuses on flying behavior, segregating it from other behaviors.
 * - Ensures that subclasses only implement methods relevant to flying.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - High-level modules depend on abstractions (`fly` method) rather than concrete implementations.
 * - Promotes flexibility and decoupling between high-level and low-level modules.
 */
public abstract class FlyableBird extends Bird {

    /**
     * Constructor to initialize common attributes of a flyable bird.
     *
     * @param weight   Weight of the bird
     * @param colour   Color of the bird
     * @param size     Size of the bird
     * @param beakType Type of the bird's beak
     */
    public FlyableBird(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    /**
     * Abstract method to define flying behavior.
     * Subclasses must implement this method to provide specific flying behavior.
     */
    public abstract void fly();
}