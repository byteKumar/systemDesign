package chamankumar.lld.oop.day06.solid02.LID.code;

import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Flyable;
import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Swimmable;

/**
 * Class representing a Swan, which is a type of bird that can both fly and swim.
 *
 * **Liskov Substitution Principle (LSP)**:
 * - `Swan` can be used wherever `Bird` is expected, ensuring substitutability without altering program correctness.
 *
 * **Interface Segregation Principle (ISP)**:
 * - Implements both `Flyable` and `Swimmable` interfaces, ensuring that it provides behavior relevant to flying and swimming birds.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - Depends on abstractions (`Bird`, `Flyable`, and `Swimmable`) rather than concrete implementations, promoting flexibility and decoupling.
 */
public class Swan extends Bird implements Flyable, Swimmable {

    /**
     * Constructor to initialize attributes specific to a Swan.
     *
     * @param weight   Weight of the swan
     * @param colour   Color of the swan
     * @param size     Size of the swan
     * @param beakType Type of the swan's beak
     */
    public Swan(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    /**
     * Implementation of the sound behavior for a swan.
     * Demonstrates the sound a swan makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Swan is making a sound");
    }

    /**
     * Implementation of the flying behavior for a swan.
     * Demonstrates the ability of the swan to fly.
     */
    @Override
    public void fly() {
        System.out.println("Swan is flying");
    }

    /**
     * Implementation of the swimming behavior for a swan.
     * Demonstrates the ability of the swan to swim.
     */
    @Override
    public void swim() {
        System.out.println("Swan is swimming");
    }
}