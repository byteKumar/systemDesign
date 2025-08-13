package com.chamankumar.lld.oop.day01.intro;

import static org.junit.jupiter.api.Assertions.*;

import chamankumar.lld.oop.day01.intro.code.BankAccount;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void testTransfer() {
        BankAccount acc1 = new BankAccount(1, "Alice", 1000);
        BankAccount acc2 = new BankAccount(2, "Bob", 500);
        acc1.transfer(200, acc2);
        assertEquals(800, acc1.getBalance());
        assertEquals(700, acc2.getBalance());
    }
}
