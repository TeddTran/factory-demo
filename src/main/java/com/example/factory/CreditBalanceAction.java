package com.example.factory;

public class CreditBalanceAction implements BalanceAction {
    private int balance;

    public CreditBalanceAction(int balance) {
        this.balance = balance;
    }

    public CreditBalanceAction() {
    }

    @Override
    public void increaseBalance(int amount) {
        balance += amount;
    }

    @Override
    public void decreaseBalance(int amount) {
        balance -= amount;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
