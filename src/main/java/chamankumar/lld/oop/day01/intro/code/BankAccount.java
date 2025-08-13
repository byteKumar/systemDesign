package chamankumar.lld.oop.day01.intro.code;

/**
 * The BankAccount class represents a simple model of a bank account.
 * It provides basic operations such as debit, credit, and transfer of funds.
 *
 * Motivation:
 * This class is designed to demonstrate object-oriented programming concepts
 * such as encapsulation and method interactions. It can be used as a foundational
 * example for financial systems or as a learning tool for understanding class design.
 */
public class BankAccount {
    // Unique identifier for the bank account
    private Integer id;

    // Name of the account holder
    private String name;

    // Current balance in the account (public for simplicity in this example)
    public Integer balance;

    /**
     * Constructor to initialize a BankAccount object with an ID, name, and initial balance.
     *
     * @param id      Unique identifier for the account
     * @param name    Name of the account holder
     * @param balance Initial balance of the account
     */
    public BankAccount(Integer id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    /**
     * Deducts a specified amount from the account balance.
     *
     * @param amount The amount to be debited
     */
    public void debit(Integer amount) {
        this.balance -= amount;
    }

    /**
     * Adds a specified amount to the account balance.
     *
     * @param amount The amount to be credited
     */
    public void credit(Integer amount) {
        this.balance += amount;
    }

    /**
     * Transfers a specified amount from this account to another account.
     *
     * @param amount      The amount to be transferred
     * @param destination The destination BankAccount object
     */
    public void transfer(Integer amount, BankAccount destination) {
        this.debit(amount); // Deduct the amount from this account
        destination.credit(amount); // Add the amount to the destination account
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance
     */
    public Integer getBalance() {
        return this.balance;
    }
}
