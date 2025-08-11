package chamankumar.lld.oop.day01.intro;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates the usage of the BankAccount class by performing
 * basic operations such as transferring funds between accounts.
 *
 * Motivation:
 * This class is designed to showcase how the BankAccount class can be
 * utilized in a real-world scenario. It helps in understanding the
 * interaction between objects and methods in a simple banking system.
 */
public class Main {
    public static void main(String[] args) {
        // Create two bank accounts with initial balances
        BankAccount acc1 = new BankAccount(1, "Alice", 1000);
        BankAccount acc2 = new BankAccount(2, "Bob", 500);

        // Transfer 200 units from Alice's account to Bob's account
        acc1.transfer(200, acc2);

        // Print the updated balances of both accounts
        System.out.println("Alice's balance: " + acc1.balance);
        System.out.println("Bob's balance: " + acc2.balance);
    }
}