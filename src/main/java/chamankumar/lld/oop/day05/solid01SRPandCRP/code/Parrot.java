package chamankumar.lld.oop.day05.solid01SRPandCRP.code;

/**
 * The Parrot class represents a specific type of bird, inheriting common attributes and behaviors from the Bird class.
 * This class adheres to the Open/Closed Principle (OCP) by extending the Bird class to add specific implementations
 * for flying and sound-making behaviors without modifying the base class.
 */
public class Parrot extends Bird {

    /**
     * Constructor to initialize the Parrot object with specific attributes.
     *
     * @param weight   Weight of the parrot
     * @param colour   Color of the parrot
     * @param size     Size of the parrot
     * @param beakType Type of the parrot's beak
     * @param type     Enum representing the specific bird type
     */
    public Parrot(Double weight, String colour, Double size, String beakType, BeakType type) {
        super(weight, colour, size, beakType, type);
    }

    /**
     * Implementation of the fly method for the Parrot.
     * Demonstrates the flying behavior specific to parrots.
     */
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    /**
     * Implementation of the makeSound method for the Parrot.
     * Demonstrates the sound-making behavior specific to parrots.
     */
    @Override
    public void makeSound() {
        System.out.println("Parrot is making a sound");
    }
}