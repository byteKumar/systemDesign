package chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * The `IdentityUserRegistry` class serves as a registry for storing and retrieving
 * prototype instances of `IdentityUserObject` based on their type.
 * It is part of the Prototype Design Pattern implementation.
 *
 * This class uses a `HashMap` to map `IdentityUserObjectType` to their corresponding
 * `IdentityUserObject` prototypes.
 */
public class IdentityUserRegistry {

    // A map to store prototypes of IdentityUserObject by their type
    private Map<IdentityUserObjectType, IdentityUserObject> registry = new HashMap<>();

    /**
     * Stores a prototype object in the registry.
     *
     * @param type The type of the user object (e.g., STUDENT, MENTOR, TA).
     * @param identityUserObject The prototype object to be stored.
     */
    public void store(IdentityUserObjectType type, IdentityUserObject identityUserObject) {
        registry.put(type, identityUserObject);
    }

    /**
     * Retrieves a prototype object from the registry based on its type.
     *
     * @param type The type of the user object to retrieve.
     * @return The prototype object associated with the given type, or null if not found.
     */
    public IdentityUserObject get(IdentityUserObjectType type) {
        return registry.get(type);
    }
}