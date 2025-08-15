package com.chamankumar.lld.oop.day06.solid02LID;

import chamankumar.lld.oop.day06.solid02.LID.code.Bird;
import chamankumar.lld.oop.day06.solid02.LID.code.Parrot;
import chamankumar.lld.oop.day06.solid02.LID.code.Sparrow;
import chamankumar.lld.oop.day06.solid02.LID.code.interfaces.Flyable;
import chamankumar.lld.oop.day06.solid02.LID.code.strategies.FlappingBehaviour;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for verifying the behavior of Bird-related functionality.
 * Includes tests for releasing birds that can fly.
 */
public class BirdTest {

    /**
     * Test method for releasing all birds that implement the Flyable interface.
     * Ensures that the releaseAll method executes without throwing exceptions.
     */
    @Test
    public void testReleaseBird() {
        // Create a list of Flyable birds (Sparrow and Parrot)
        List<Flyable> birds = List.of(
                new Sparrow(1.0, "Brown", 5.0, "Small", new FlappingBehaviour()),
                new Parrot(1.2, "Green", 6.0, "Curved")
        );

        // Call the releaseAll method to release the birds
        releaseAll(birds);

        // Assert that the method executes without exceptions
        assertDoesNotThrow(() -> releaseAll(birds), "releaseAll should execute without exceptions");
    }

    /**
     * Test method for releasing a list of Bird objects.
     * Ensures that the release method executes without throwing exceptions.
     */
    @Test
    public void testReleaseBirds() {
        // Create a list of Bird objects (Sparrow and Parrot)
        List<Bird> birds = List.of(
                new Sparrow(1.0, "Brown", 5.0, "Small", new FlappingBehaviour()),
                new Parrot(1.2, "Green", 6.0, "Curved")
        );

        // Assert that the method executes without exceptions
        assertDoesNotThrow(() -> release(birds), "release should execute without exceptions");
    }

    /**
     * Method to release all birds that implement the Flyable interface.
     * Calls the fly method for each bird in the list.
     *
     * @param birds List of Flyable birds
     */
    public static void releaseAll(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }

    /**
     * Method to release a list of Bird objects.
     * Checks if each bird is an instance of Flyable and calls the fly method if applicable.
     *
     * @param birds List of Bird objects
     */
    public static void release(List<Bird> birds) {
        birds.forEach(bird -> {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        });
    }
}