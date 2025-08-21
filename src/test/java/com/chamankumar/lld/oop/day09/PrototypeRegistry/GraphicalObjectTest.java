package com.chamankumar.lld.oop.day09.PrototypeRegistry;

import chamankumar.lld.oop.day09.PrototypeRegistry.code.BackgroundObject;
import chamankumar.lld.oop.day09.PrototypeRegistry.code.BackgroundObjectType;
import chamankumar.lld.oop.day09.PrototypeRegistry.code.BackgroundRegistry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for the Prototype Design Pattern implementation.
 * This class tests the cloning functionality of `BackgroundObject` and the use of `BackgroundRegistry`.
 */
public class GraphicalObjectTest {

    private BackgroundRegistry registry;

    /**
     * Sets up the test environment before each test.
     * Initializes the `BackgroundRegistry` and stores a prototype object for `TREE`.
     */
    @BeforeEach
    public void setUp() {
        registry = new BackgroundRegistry();

        // Create and store a prototype object for TREE
        BackgroundObject treeProto = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);
        registry.store(BackgroundObjectType.TREE, treeProto);
    }

    /**
     * Cleans up the test environment after each test.
     * Sets the `registry` to null.
     */
    @AfterEach
    public void tearDown() {
        registry = null;
    }

    /**
     * Tests the cloning functionality of `BackgroundObject`.
     * Verifies that cloned objects are distinct from the prototype and have independent properties.
     */
    @Test
    public void testCloneObject() {

        // Step 3 - Create a prototype object
        BackgroundObject prototype = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);

        // Step 4 - Clone the prototype to create a forest
        BackgroundObject clone = prototype.clone();

        // Create a list of cloned objects (forest)
        List<BackgroundObject> forest = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            BackgroundObject treeClone = prototype.clone();
            treeClone.setX(new Random().nextInt());
            treeClone.setY(new Random().nextInt());
            forest.add(treeClone);
        }

        // Verify that the clone is not null
        assertNotNull(clone, "If clone method is called, clone should not be null");

        // Modify the clone's properties
        clone.setX(1);
        clone.setY(1);

        // Verify that the prototype and clone have independent properties
        assertNotEquals(prototype.getX(), clone.getX(), "If prototype is cloned, clone and prototype should not have the same X");
        assertNotEquals(prototype.getY(), clone.getY(), "If prototype is cloned, clone and prototype should not have the same Y");
    }

    /**
     * Tests the prototype retrieval and cloning functionality using `BackgroundRegistry`.
     * Verifies that cloned objects retrieved from the registry are distinct from the prototype.
     */
    @Test
    public void testPrototypeWithRegistry() {
        // Retrieve the prototype object from the registry
        BackgroundObject prototype = registry.get(BackgroundObjectType.TREE);

        // Verify that the prototype is not null
        assertNotNull(prototype, "If prototype was created, object should not be null");

        // Clone the prototype and modify its properties
        BackgroundObject clone = prototype.clone();
        clone.setX(new Random().nextInt());
        clone.setY(new Random().nextInt());

        // Verify that the prototype and clone have independent properties
        assertNotEquals(prototype.getX(), clone.getX(), "If prototype is cloned, clone and prototype should not have the same X");
        assertNotEquals(prototype.getY(), clone.getY(), "If prototype is cloned, clone and prototype should not have the same Y");
    }
}