package com.chamankumar.lld.oop.day07.DPSingleton;

import chamankumar.lld.oop.day07.DPSingleton.code.CollectionPool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for verifying the Singleton behavior of the CollectionPool class.
 * Ensures that only one instance of CollectionPool is created and reused.
 */
public class CollectionPoolTest {

    /**
     * Test method to verify the Singleton implementation of CollectionPool.
     * Ensures that the same instance is returned for multiple calls to getInstance().
     */
    @Test
    public void testSingleton() {
        // Retrieve the first instance of CollectionPool
        CollectionPool collectionPool = CollectionPool.getInstance();
        assertNotNull(collectionPool, "If getInstance is called, instance should not be null");

        // Retrieve the second instance of CollectionPool
        CollectionPool collectionPool1 = CollectionPool.getInstance();
        assertEquals(collectionPool1, collectionPool, "If getInstance is called twice, it should return the same instance");
    }
}