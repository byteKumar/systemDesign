package chamankumar.lld.oop.day05.solid01SRPandCRP.code;

/**
 * The Sparrow class represents a specific type of bird, inheriting common attributes and behaviors from the Bird class.
 * This class adheres to the Open/Closed Principle (OCP) by extending the Bird class to add specific implementations
 * for flying and sound-making behaviors without modifying the base class.
 */
public class Sparrow extends Bird {

    /**
     * Constructor to initialize the Sparrow object with specific attributes.
     *
     * @param weight   Weight of the sparrow
     * @param colour   Color of the sparrow
     * @param size     Size of the sparrow
     * @param beakType Type of the sparrow's beak
     * @param type     Enum representing the specific bird type
     */
    public Sparrow(Double weight, String colour, Double size, String beakType, BeakType type) {
        super(weight, colour, size, beakType, type);
    }

    /**
     * Implementation of the fly method for the Sparrow.
     * Demonstrates the flying behavior specific to sparrows.
     */
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    /**
     * Implementation of the makeSound method for the Sparrow.
     * Demonstrates the sound-making behavior specific to sparrows.
     */
    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound");
    }
}