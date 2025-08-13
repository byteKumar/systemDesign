package com.chamankumar.lld.oop.day04.abstraction;

import chamankumar.lld.oop.day04.abstraction.code.AbstractPasswordEncoder;
import chamankumar.lld.oop.day04.abstraction.code.SubStringEncoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * AbstractPasswordEncoderTest is a test class designed to validate the functionality of the AbstractPasswordEncoder
 * and its concrete implementation, SubStringEncoder.
 *
 * Key Features:
 * - Tests the encoding logic of SubStringEncoder to ensure it correctly combines the substring of the password
 *   with the public key.
 * - Validates the static method behavior of AbstractPasswordEncoder for printing the key prefix.
 */
public class AbstractPasswordEncoderTest {

    /**
     * Tests the encoding functionality of SubStringEncoder.
     * Verifies that the encoded password is a combination of the first two characters of the input password
     * and the public key.
     */
    @Test
    public void testEncoder() {
        AbstractPasswordEncoder encoder = new SubStringEncoder("public");
        String encoded = encoder.encode("abc");
        String expected = "abpublic";

        assertEquals(expected, encoded, "If encoder is called, substring + key should be returned");
    }

    /**
     * Tests the static method printKeyPrefix() of AbstractPasswordEncoder.
     * Ensures that the static key prefix is printed correctly.
     */
    @Test
    public void testStatic() {
        //System.out.println(AbstractPasswordEncoder.KEY_PREFIX);
//        AbstractPasswordEncoder encoder1 = new SubStringEncoder("public");
//        AbstractPasswordEncoder.KEY_PREFIX = "encoder 1";
//        AbstractPasswordEncoder encoder2 = new SubStringEncoder("public");
//        AbstractPasswordEncoder.KEY_PREFIX = "encoder 2";
//
//        System.out.println(AbstractPasswordEncoder.KEY_PREFIX +" " + AbstractPasswordEncoder.KEY_PREFIX);

        AbstractPasswordEncoder.printKeyPrefix();
    }
}