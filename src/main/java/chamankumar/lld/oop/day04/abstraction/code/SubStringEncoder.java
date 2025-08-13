package chamankumar.lld.oop.day04.abstraction.code;

/**
 * SubStringEncoder is a concrete implementation of the AbstractPasswordEncoder class.
 * It provides an encoding mechanism where the first two characters of the input password
 * are concatenated with the public key.
 *
 * Key Features:
 * - Extends the AbstractPasswordEncoder class, inheriting its properties and methods.
 * - Implements the `encode(String password)` method to define a specific encoding strategy.
 * - Uses the `getPublicKey()` method from the parent class to retrieve the public key.
 *
 * This class can be used in scenarios where partial password encoding combined with a public key is required.
 */
public class SubStringEncoder extends AbstractPasswordEncoder {

    /**
     * Constructor to initialize the SubStringEncoder with a public key.
     * @param publicKey The public key used for encoding.
     */
    public SubStringEncoder(String publicKey) {
        super(publicKey);
    }

    /**
     * Encodes the given password by concatenating the first two characters of the password
     * with the public key.
     * @param password The password to be encoded.
     * @return The encoded password.
     */
    @Override
    public String encode(String password) {
        return password.substring(0, 2) + getPublicKey();
    }
}