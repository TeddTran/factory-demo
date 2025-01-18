package com.example.factory;

public class DebitBalanceAction implements BalanceAction {
    private int balance;

    public DebitBalanceAction(int balance) {
        this.balance = balance;
    }

    public DebitBalanceAction() {
    }

    @Override
    public void increaseBalance(int amount) {
        balance += amount;
    }

    @Override
    public void decreaseBalance(int amount) {

        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient debit balance");
        }
        balance -= amount;// Logic cho phép âm số dư
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
