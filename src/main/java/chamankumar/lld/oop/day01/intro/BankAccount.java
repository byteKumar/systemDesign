package chamankumar.lld.oop.day01.intro;

public class BankAccount {
    private Integer id;
    private String name;
    public Integer balance;

    public BankAccount(Integer id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void debit(Integer amount) {
        this.balance -= amount;
    }

    public void credit(Integer amount) {
        this.balance += amount;
    }

    public void transfer(Integer amount, BankAccount destination) {
        this.debit(amount);
        destination.credit(amount);
    }
    public Integer getBalance() {
        return this.balance;
    }
}
