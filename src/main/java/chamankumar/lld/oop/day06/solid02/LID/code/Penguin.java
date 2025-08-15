package chamankumar.lld.oop.day06.solid02.LID.code;

import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Swimmable;

/**
 * Class representing a Penguin, which is a type of bird that can swim.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - `Penguin` can be used wherever `Bird` is expected, ensuring substitutability without altering program correctness.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Implements the `Swimmable` interface, ensuring that it only provides behavior relevant to swimming birds.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - Depends on abstractions (`Bird` and `Swimmable`) rather than concrete implementations, promoting flexibility and decoupling.
 */
public class Penguin extends Bird implements Swimmable {

    /**
     * Constructor to initialize attributes specific to a Penguin.
     *
     * @param weight   Weight of the penguin
     * @param colour   Color of the penguin
     * @param size     Size of the penguin
     * @param beakType Type of the penguin's beak
     */
    public Penguin(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    /**
     * Implementation of the sound behavior for a penguin.
     * Demonstrates the sound a penguin makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Penguin is making a sound");
    }

    /**
     * Implementation of the swimming behavior for a penguin.
     * Demonstrates the ability of the penguin to swim.
     */
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}