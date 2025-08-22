package com.chamankumar.lld.oop.day09.PrototypeRegistry;

import chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution.IdentityUserObject;
import chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution.IdentityUserObjectType;
import chamankumar.lld.oop.day09.PrototypeRegistry.assignmentSolution.IdentityUserRegistry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The `UserObjectTest` class contains JUnit test cases to verify the functionality
 * of the Prototype Design Pattern implementation using `IdentityUserObject` and `IdentityUserRegistry`.
 */
public class UserObjectTest {

    // Registry to store and retrieve prototypes
    private IdentityUserRegistry registry;

    /**
     * Sets up the test environment by initializing the registry and storing a prototype.
     * This method is executed before each test.
     */
    @BeforeEach
    public void setUp() {
        registry = new IdentityUserRegistry();

        // Create and store a prototype for the STUDENT type
        IdentityUserObject studentProto = new IdentityUserObject(1, "chaman", "ck@gmail.com", IdentityUserObjectType.STUDENT);
        registry.store(IdentityUserObjectType.STUDENT, studentProto);
    }

    /**
     * Cleans up the test environment by nullifying the registry.
     * This method is executed after each test.
     */
    @AfterEach
    public void tearDown() {
        registry = null;
    }

    /**
     * Tests the `clone` method of `IdentityUserObject` to ensure that cloned objects
     * are distinct from the original prototype and have unique properties.
     */
    @Test
    public void testCloneObject() {
        // Create a prototype object
        IdentityUserObject prototype = new IdentityUserObject(1, "chaman", "ck@gmail.com", IdentityUserObjectType.STUDENT);

        // Clone the prototype
        IdentityUserObject clone = prototype.clone();

        // Create a list of 1000 clones with unique IDs
        List<IdentityUserObject> identity = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            IdentityUserObject identityClone = prototype.clone();
            identityClone.setId(new Random().nextInt());
            identity.add(identityClone);
        }

        // Modify the clone's properties
        clone.setId(2);
        clone.setName("kumar");

        // Assert that the prototype is not null
        assertNotNull(prototype, "when creating a object, it should not be null");

        // Assert that the prototype and clone have different IDs and names
        assertNotEquals(prototype.getId(), clone.getId(), "If prototype is cloned, clone and prototype should not have the same id");
        assertNotEquals(prototype.getName(), clone.getName(), "If prototype is cloned, clone and prototype should not have the same name");
    }

    /**
     * Tests the `IdentityUserRegistry` to ensure that prototypes can be retrieved
     * and cloned correctly, and that the cloned objects are distinct from the prototypes.
     */
    @Test
    public void testPrototypeWithRegistry() {
        // Retrieve the prototype from the registry
        IdentityUserObject prototype = registry.get(IdentityUserObjectType.STUDENT);

        // Assert that the prototype is not null
        assertNotNull(prototype, "If prototype was created, object should not be null");

        // Clone the prototype and modify its properties
        IdentityUserObject clone = prototype.clone();
        clone.setId(2);
        clone.setName("kumar");

        // Assert that the prototype and clone have different IDs and names
        assertNotEquals(prototype.getId(), clone.getId(), "If prototype is cloned, clone and prototype should not have the same id");
        assertNotEquals(prototype.getName(), clone.getName(), "If prototype is cloned, clone and prototype should not have the same name");
    }
}