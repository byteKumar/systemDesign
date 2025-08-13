package chamankumar.lld.oop.day04.abstraction.code;

/**
 * ReverseEncoder is a concrete implementation of the PasswordEncoder interface.
 * It provides an encoding mechanism where the input password is reversed.
 *
 * Key Features:
 * - Implements the `encoder(String password)` method from the PasswordEncoder interface.
 * - Uses a `StringBuilder` to reverse the input password and returns the reversed string.
 *
 * This class can be used in scenarios where reversing the password is required as part of the encoding strategy.
 */
public class ReverseEncoder implements PasswordEncoder {

    @Override
    public String encoder(String password) {
        StringBuilder sb = new StringBuilder(password);
        return sb.reverse().toString();
    }
}