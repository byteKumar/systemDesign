package chamankumar.lld.oop.day05.solid01SRPandCRP.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Abstract class representing a generic Bird.
 * This class adheres to the Open/Closed Principle (OCP) by being open for extension
 * (subclasses can add specific behaviors) but closed for modification (core attributes and methods remain unchanged).
 * It also supports the Single Responsibility Principle (SRP) by focusing solely on bird-related attributes and behaviors.
 */
@Getter
@AllArgsConstructor
public abstract class Bird {

    // Common attributes for all birds
    private Double weight;    // Weight of the bird
    private String colour;    // Color of the bird
    private Double size;      // Size of the bird
    private String beakType;  // Type of the bird's beak
    private BeakType type;    // Enum representing specific bird types

    /**
     * Abstract method to define flying behavior.
     * Subclasses must implement this method to provide specific flying behavior.
     */
    public abstract void fly();

    /**
     * Abstract method to define sound-making behavior.
     * Subclasses must implement this method to provide specific sound-making behavior.
     */
    public abstract void makeSound();
}