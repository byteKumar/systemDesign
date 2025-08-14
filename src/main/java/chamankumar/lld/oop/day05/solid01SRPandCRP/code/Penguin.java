package chamankumar.lld.oop.day05.solid01SRPandCRP.code;

/**
 * The Penguin class represents a specific type of bird, inheriting common attributes and behaviors from the Bird class.
 * This class adheres to the Open/Closed Principle (OCP) by extending the Bird class to add specific implementations
 * for sound-making behavior while overriding the flying behavior to reflect that penguins cannot fly.
 */
public class Penguin extends Bird {

    /**
     * Constructor to initialize the Penguin object with specific attributes.
     *
     * @param weight   Weight of the penguin
     * @param colour   Color of the penguin
     * @param size     Size of the penguin
     * @param beakType Type of the penguin's beak
     * @param type     Enum representing the specific bird type
     */
    public Penguin(Double weight, String colour, Double size, String beakType, BeakType type) {
        super(weight, colour, size, beakType, type);
    }

    /**
     * Override the fly method to reflect that penguins cannot fly.
     */
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly, but they can swim.");
    }

    /**
     * Implementation of the makeSound method for the Penguin.
     * Demonstrates the sound-making behavior specific to penguins.
     */
    @Override
    public void makeSound() {
        System.out.println("Penguin is making a sound");
    }
}