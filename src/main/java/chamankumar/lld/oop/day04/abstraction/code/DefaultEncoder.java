package chamankumar.lld.oop.day04.abstraction.code;

/**
 * DefaultEncoder is a concrete implementation of the PasswordEncoder interface.
 * It provides a basic encoding mechanism where the input password is returned as-is,
 * without any modifications or transformations.
 *
 * Key Features:
 * - Implements the `encoder(String password)` method from the PasswordEncoder interface.
 * - Returns the input password directly, making it a "no-op" encoder.
 *
 * This class can be used as a default or fallback encoder when no specific encoding logic is required.
 */
public class DefaultEncoder implements PasswordEncoder {
    @Override
    public String encoder(String password) {
        return password;
    }
}