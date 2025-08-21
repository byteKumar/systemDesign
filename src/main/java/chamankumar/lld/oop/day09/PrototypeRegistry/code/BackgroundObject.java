package chamankumar.lld.oop.day09.PrototypeRegistry.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The `BackgroundObject` class represents a graphical object with properties such as position, dimensions, and type.
 * It implements the `GraphicalObject` interface, making it cloneable as part of the Prototype Design Pattern.
 *
 * This class uses Lombok annotations for boilerplate code:
 * - `@AllArgsConstructor` generates a constructor with all fields as parameters.
 * - `@Getter` and `@Setter` generate getter and setter methods for all fields.
 */
@AllArgsConstructor
@Setter
@Getter
public class BackgroundObject implements GraphicalObject {

    // The x-coordinate of the object
    private int x;

    // The y-coordinate of the object
    private int y;

    // The height of the object
    private int height;

    // The width of the object
    private int width;

    // The type of the object (e.g., TREE, BUILDING, etc.)
    private BackgroundObjectType type;

    /**
     * Creates and returns a copy of the current object.
     * This method is part of the Prototype Design Pattern implementation.
     * @return A new `BackgroundObject` instance with the same properties as the current object.
     */
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, height, width, type);
    }
}