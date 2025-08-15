package chamankumar.lld.oop.day06.solid02.LID.code;

import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Flyable;

/**
 * Class representing a Parrot, which is a type of bird that can fly.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - `Parrot` can be used wherever `Bird` is expected, ensuring substitutability without altering program correctness.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Implements the `Flyable` interface, ensuring that it only provides behavior relevant to flying birds.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - Depends on abstractions (`Bird` and `Flyable`) rather than concrete implementations, promoting flexibility and decoupling.
 */
public class Parrot extends Bird implements Flyable {

    /**
     * Constructor to initialize attributes specific to a Parrot.
     *
     * @param weight   Weight of the parrot
     * @param colour   Color of the parrot
     * @param size     Size of the parrot
     * @param beakType Type of the parrot's beak
     */
    public Parrot(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    /**
     * Implementation of the flying behavior for a parrot.
     * Demonstrates the ability of the parrot to fly.
     */
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    /**
     * Implementation of the sound behavior for a parrot.
     * Demonstrates the sound a parrot makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Parrot is making a sound");
    }
}