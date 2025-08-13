package com.chamankumar.lld.oop.day04.abstraction;

import chamankumar.lld.oop.day04.abstraction.code.DefaultEncoder;
import chamankumar.lld.oop.day04.abstraction.code.PasswordEncoder;
import chamankumar.lld.oop.day04.abstraction.code.ReverseEncoder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * PasswordEncoderTest is a test class designed to validate the functionality of different PasswordEncoder implementations.
 *
 * Key Features:
 * - Tests individual encoder implementations for correctness.
 * - Validates multiple encoders together using a list.
 */
public class PasswordEncoderTest {

    /**
     * Tests the ReverseEncoder implementation.
     * Verifies that the encoder method correctly reverses the input string.
     */
    @Test
    public void testPasswordEncoder() {
        PasswordEncoder pass = new ReverseEncoder();
        String encoded = pass.encoder("malayalam");
        assertEquals("malayalam", encoded, "It reverse encoder is used, it should return reversed string");
    }

    /**
     * Tests the DefaultEncoder implementation.
     * Verifies that the encoder method returns the input string unchanged.
     */
    @Test
    public void testDefaultEncoder() {
        PasswordEncoder encode = new DefaultEncoder();
        String encoded = encode.encoder("malayalam");
        assertEquals(encoded, encoded, "It return the same encoder");
    }

    /**
     * Tests both ReverseEncoder and DefaultEncoder implementations together.
     * Validates that both return the expected results for the same input.
     */
    @Test
    public void testTwoInterface() {
        List<PasswordEncoder> encoders = List.of(new ReverseEncoder(), new DefaultEncoder());
        List<String> expected = List.of("malayalam", "malayalam");
//        List<String> actual = new ArrayList<>();
//        for (PasswordEncoder encode: encoders) {
//            actual.add(encode.encoder("malayalam"));
//        }

        List<String> actual = encoders.stream()
                .map(encode -> encode.encoder("malayalam"))
                .collect(Collectors.toList());

        assertArrayEquals(expected.toArray(), actual.toArray(), "If both encoder are called, both should be same");
    }
}
