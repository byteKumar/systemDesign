package chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution;

/**
 * The `UserObject` interface defines a contract for objects that can be cloned.
 * It is a key part of the Prototype Design Pattern, ensuring that implementing
 * classes provide a `clone` method to create copies of themselves.
 */
public interface UserObject {

    /**
     * Creates and returns a copy of the current object.
     * @return A new instance of the object with the same properties as the original.
     */
    UserObject clone();
}