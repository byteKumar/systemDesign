package chamankumar.lld.oop.day04.abstraction.code;

/**
 * PasswordEncoder is an interface that defines the contract for password encoding mechanisms.
 * Any class implementing this interface must provide an implementation for the `encoder` method.
 *
 * Key Features:
 * - `encoder(String password)`: A method to encode a given password. The implementation can vary based on the encoding strategy.
 *
 * This interface is designed to be implemented by classes that provide specific password encoding logic.
 */
public interface PasswordEncoder {

    /**
     * Encodes the given password based on the implementation logic.
     * @param password The password to be encoded.
     * @return The encoded password.
     */
    public String encoder(String password);
}