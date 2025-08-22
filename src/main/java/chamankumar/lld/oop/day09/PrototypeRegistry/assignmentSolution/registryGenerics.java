package chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * The `registryGenerics` class is a generic implementation of a registry
 * that allows storing and retrieving objects based on their types.
 * It is designed to work with any entity and entity type.
 *
 * @param <ENTITY>      The type of objects to be stored in the registry.
 * @param <ENTITY_TYPE> The type used as a key to identify objects in the registry.
 */
public class registryGenerics<ENTITY, ENTITY_TYPE> {

    // A map to store entities with their corresponding types as keys
    private Map<ENTITY_TYPE, ENTITY> registry = new HashMap<>();

    /**
     * Stores an entity in the registry with the specified type as the key.
     *
     * @param type               The type used as the key to store the entity.
     * @param identityUserObject The entity to be stored in the registry.
     */
    public void store(ENTITY_TYPE type, ENTITY identityUserObject) {
        registry.put(type, identityUserObject);
    }

    /**
     * Retrieves an entity from the registry based on the specified type.
     *
     * @param type The type used as the key to retrieve the entity.
     * @return The entity associated with the specified type, or null if not found.
     */
    public ENTITY get(ENTITY_TYPE type) {
        return registry.get(type);
    }
}