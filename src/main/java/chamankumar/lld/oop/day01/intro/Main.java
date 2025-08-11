package chamankumar.lld.oop.day01.intro;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1, "Alice", 1000);
        BankAccount acc2 = new BankAccount(2, "Bob", 500);
        acc1.transfer(200, acc2);
        System.out.println("Alice's balance: " + acc1.balance);
        System.out.println("Bob's balance: " + acc2.balance);
    }
}
