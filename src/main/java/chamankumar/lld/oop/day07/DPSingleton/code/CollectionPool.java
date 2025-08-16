package chamankumar.lld.oop.day07.DPSingleton.code;

/**
 * Singleton class representing a CollectionPool.
 * Ensures that only one instance of the class is created and provides a global access point to it.
 *
 * **Steps to implement Singleton:**
 * 1. **Hide the constructor**: Make the constructor private to prevent instantiation from outside the class.
 * 2. **Global access point**: Provide a static method to return the single instance of the class.
 * 3. **Instance variable**: Use a static variable to hold the single instance.
 *
 * **Thread Safety:**
 * - Uses double-checked locking to ensure thread safety during instance creation.
 * - Synchronization is applied only when the instance is null, reducing performance overhead.
 *
 * **Cons of this approach:**
 * 1. **SRP Violation**: The class is responsible for both managing its instance and its core functionality.
 * 2. **Thread Safety Issues**: Double-checked locking may not work reliably in some JVM implementations.
 * 3. **Performance Issues**: Synchronization can impact performance in high-concurrency scenarios.
 *
 * **Alternative Approaches:**
 * - Enum-based Singleton: Provides thread safety and serialization guarantees.
 * - Inner Static Class: Lazy initialization without synchronization overhead.
 */
public class CollectionPool {

    // Step 3 - Instance variable to hold the single instance
    private static CollectionPool instance;

    // Step 1 - Private constructor to prevent instantiation
    private CollectionPool() {
    }

    /**
     * Step 2 - Global access point to get the single instance of the class.
     * Uses double-checked locking for thread safety.
     *
     * @return The single instance of CollectionPool
     */
    public static CollectionPool getInstance() {
        if (instance == null) { // First check (without locking)
            synchronized (CollectionPool.class) { // Locking
                if (instance == null) { // Second check (with locking)
                    instance = new CollectionPool();
                }
            }
        }
        return instance;
    }
}

// Cons of this approach:
// 1. SRP violation
// 2. Thread safety is not guaranteed
// 3. Performance is not guaranteed in thread-safe mode - Double checked locking
// Enum implementation, inner static class