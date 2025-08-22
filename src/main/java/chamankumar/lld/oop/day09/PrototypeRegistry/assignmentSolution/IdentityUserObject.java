package chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The `IdentityUserObject` class represents a user object with properties such as ID, name, email, and type.
 * It implements the `UserObject` interface, making it cloneable as part of the Prototype Design Pattern.
 *
 * This class uses Lombok annotations for boilerplate code:
 * - `@AllArgsConstructor` generates a constructor with all fields as parameters.
 * - `@Getter` generates getter methods for all fields.
 * - `@Setter` generates setter methods for all fields.
 */
@AllArgsConstructor
@Getter
@Setter
public class IdentityUserObject implements UserObject {

    // The unique identifier for the user
    private Integer id;

    // The name of the user
    private String name;

    // The email address of the user
    private String email;

    // The type of the user (e.g., STUDENT, MENTOR, TA)
    private IdentityUserObjectType type;

    /**
     * Creates and returns a copy of the current object.
     * This method is part of the Prototype Design Pattern implementation.
     * @return A new `IdentityUserObject` instance with the same properties as the current object.
     */
    @Override
    public IdentityUserObject clone() {
        return new IdentityUserObject(id, name, email, type);
    }
}