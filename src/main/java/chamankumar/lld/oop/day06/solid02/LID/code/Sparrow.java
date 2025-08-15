package chamankumar.lld.oop.day06.solid02.LID.code;

import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Flyable;
import chamankumar.lld.oop.day06.solid02.LID.code.strategies.FlyingBehaviour;

/**
 * Class representing a Sparrow, which is a type of bird that can fly.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - `Sparrow` can be used wherever `Bird` is expected, ensuring substitutability without altering program correctness.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Implements the `Flyable` interface, ensuring that it only provides behavior relevant to flying birds.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - Depends on abstractions (`Bird` and `FlyingBehaviour`) rather than concrete implementations, promoting flexibility and decoupling.
 */
public class Sparrow extends Bird implements Flyable {

    /**
     * Strategy for defining the flying behavior of the sparrow.
     * Demonstrates the use of the Strategy design pattern.
     */
    private FlyingBehaviour glidingBehaviour;

    /**
     * Constructor to initialize attributes specific to a Sparrow.
     *
     * @param weight           Weight of the sparrow
     * @param colour           Color of the sparrow
     * @param size             Size of the sparrow
     * @param beakType         Type of the sparrow's beak
     * @param glidingBehaviour Strategy for the sparrow's flying behavior
     */
    public Sparrow(Double weight, String colour, Double size, String beakType, FlyingBehaviour glidingBehaviour) {
        super(weight, colour, size, beakType);
        this.glidingBehaviour = glidingBehaviour;
    }

    /**
     * Implementation of the flying behavior for a sparrow.
     * Delegates the flying behavior to the `glidingBehaviour` strategy.
     */
    @Override
    public void fly() {
        glidingBehaviour.fly();
    }

    /**
     * Implementation of the sound behavior for a sparrow.
     * Demonstrates the sound a sparrow makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound");
    }
}