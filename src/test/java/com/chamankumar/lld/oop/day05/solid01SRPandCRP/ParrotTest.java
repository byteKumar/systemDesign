package com.chamankumar.lld.oop.day05.solid01SRPandCRP;

import chamankumar.lld.oop.day05.solid01SRPandCRP.code.BeakType;
import chamankumar.lld.oop.day05.solid01SRPandCRP.code.Bird;
import chamankumar.lld.oop.day05.solid01SRPandCRP.code.Parrot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Parrot class using Bird reference.
 * Validates the attributes and specific behaviors of the Parrot class.
 */
public class ParrotTest {

    @Test
    public void testParrotAttributes() {
        Bird aa = new Parrot(1.2, "Green", 15.0, "Curved", BeakType.PARROT);
        assertEquals(1.2, aa.getWeight(), "Weight should match");
        assertEquals("Green", aa.getColour(), "Colour should match");
        assertEquals(15.0, aa.getSize(), "Size should match");
        assertEquals("Curved", aa.getBeakType(), "BeakType should match");
        assertEquals(BeakType.PARROT, aa.getType(), "BeakType enum should match");
    }

    @Test
    public void testFlyMethod() {
        Bird aa = new Parrot(1.2, "Green", 15.0, "Curved", BeakType.PARROT);
        assertDoesNotThrow(() -> aa.fly(), "Fly method should execute without exceptions");
    }

    @Test
    public void testMakeSoundMethod() {
        Bird aa = new Parrot(1.2, "Green", 15.0, "Curved", BeakType.PARROT);
        assertDoesNotThrow(() -> aa.makeSound(), "MakeSound method should execute without exceptions");
    }
}