package org.example.core.lesson5;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.balance = 50;
        bankAccount.replenishment(90);
        System.out.println(bankAccount.balance);
        bankAccount.withdrawal(70);
        System.out.println(bankAccount.balance);
    }
}
