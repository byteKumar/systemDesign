package chamankumar.lld.oop.day04.abstraction.code;

import lombok.AllArgsConstructor;

/**
 * AbstractPasswordEncoder is an abstract class that provides a blueprint for password encoding mechanisms.
 * It defines a common structure for all password encoders, including a public key and a static key prefix.
 *
 * Key Features:
 * - `publicKey`: A public key used for encoding, provided during object creation.
 * - `KEY_PREFIX`: A static constant representing a prefix for keys, shared across all instances.
 * - `getPublicKey()`: A method to retrieve the public key, which also prints the static key prefix.
 * - `encode(String password)`: An abstract method that must be implemented by subclasses to define specific encoding logic.
 * - `printKeyPrefix()`: A static method to print the shared key prefix.
 *
 * This class is designed to be extended by concrete implementations that provide specific encoding strategies.
 */
@AllArgsConstructor
public abstract class AbstractPasswordEncoder {

    // Public key used for encoding
    public String publicKey;

    // Static constant prefix for keys
    public static final String KEY_PREFIX = "PUBLIC";

    /**
     * Retrieves the public key and prints the static key prefix.
     * @return The public key.
     */
    public String getPublicKey() {
        printKeyPrefix();
        return publicKey;
    }

    /**
     * Abstract method to encode a password.
     * Subclasses must provide their own implementation of this method.
     * @param password The password to be encoded.
     * @return The encoded password.
     */
    public abstract String encode(String password);

    /**
     * Prints the static key prefix to the console.
     */
    public static void printKeyPrefix() {
        System.out.println(KEY_PREFIX);
    }
}