package chamankumar.lld.oop.day09.PrototypeRegistry.code;

/**
 * The `GraphicalObject` interface defines the contract for objects that can be cloned.
 * This is the first step in implementing the Prototype Design Pattern.
 *
 * Classes implementing this interface must provide their own implementation of the `clone` method,
 * which creates and returns a copy of the object.
 */
public interface GraphicalObject {

    /**
     * Creates and returns a copy of the object.
     * @return A new instance of the object with the same properties as the original.
     */
    GraphicalObject clone();
}