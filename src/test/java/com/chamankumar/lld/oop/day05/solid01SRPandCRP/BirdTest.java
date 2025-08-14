package com.chamankumar.lld.oop.day05.solid01SRPandCRP;


import chamankumar.lld.oop.day05.solid01SRPandCRP.code.BeakType;
import chamankumar.lld.oop.day05.solid01SRPandCRP.code.Bird;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Bird abstract class.
 * A concrete subclass is used to test the abstract methods and attributes.
 */

public class BirdTest {

    // Concrete subclass for testing
    private static class TestBird extends Bird {
        public TestBird(Double weight, String colour, Double size, String beakType, BeakType type) {
            super(weight, colour, size, beakType, type);
        }

        @Override
        public void fly() {
            // Test-specific implementation
            System.out.println("TestBird is flying");
        }

        @Override
        public void makeSound() {
            // Test-specific implementation
            System.out.println("TestBird is making sound");
        }
    }

    @Test
    public void testBirdAttributes() {
        Bird bird = new TestBird(1.5, "Red", 10.0, "Sharp", BeakType.PARROT);
        assertEquals(1.5, bird.getWeight(), "Weight should match");
        assertEquals("Red", bird.getColour(), "Colour should match");
        assertEquals(10.0, bird.getSize(), "Size should match");
        assertEquals("Sharp", bird.getBeakType(), "BeakType should match");
        assertEquals(BeakType.PARROT, bird.getType(), "BeakType enum should match");
    }

    @Test
    public void testFlyMethod() {
        Bird bird = new TestBird(1.5, "Red", 10.0, "Sharp", BeakType.PARROT);
        assertDoesNotThrow(() -> bird.fly(), "Fly method should execute without exceptions");
    }

    @Test
    public void testMakeSoundMethod() {
        Bird bird = new TestBird(1.5, "Red", 10.0, "Sharp", BeakType.PARROT);
        assertDoesNotThrow(() -> bird.makeSound(), "MakeSound method should execute without exceptions");
    }
}