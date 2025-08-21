package chamankumar.lld.oop.day09.PrototypeRegistry.code;

import java.util.HashMap;
import java.util.Map;

/**
 * The `BackgroundRegistry` class acts as a registry for storing and retrieving prototype objects.
 * It is part of the Prototype Design Pattern implementation, allowing efficient creation of new objects
 * by cloning existing prototypes.
 */
public class BackgroundRegistry {

    // A map to store prototype objects, keyed by their type
    private Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();

    /**
     * Stores a prototype object in the registry.
     * @param type The type of the background object.
     * @param backgroundObject The prototype object to store.
     */
    public void store(BackgroundObjectType type, BackgroundObject backgroundObject) {
        registry.put(type, backgroundObject);
    }

    /**
     * Retrieves a prototype object from the registry.
     * @param type The type of the background object.
     * @return The prototype object associated with the given type, or null if not found.
     */
    public BackgroundObject get(BackgroundObjectType type) {
        return registry.get(type);
    }
}