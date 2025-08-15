package chamankumar.lld.oop.day06.solid02.LID.code.interfaces;

/**
 * Interface representing the ability to fly.
 *
 * **Interface Segregation Principle (ISP)**:
 * - This interface is focused solely on flying behavior, ensuring that classes implementing it are not forced to implement unrelated methods.
 * - Promotes modular design by segregating specific behaviors into separate interfaces.
 *
 * **Dependency Inversion Principle (DIP)**:
 * - High-level modules depend on abstractions (like this interface) rather than concrete implementations.
 * - This allows flexibility and decoupling between high-level and low-level modules.
 */
public interface Flyable {

    /**
     * Method to define flying behavior.
     * Classes implementing this interface must provide their own implementation of this method.
     */
    public void fly();
}