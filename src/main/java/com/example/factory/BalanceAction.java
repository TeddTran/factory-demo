package com.example.factory;

public interface BalanceAction {
    void increaseBalance(int amount);
    void decreaseBalance(int amount);
    int getBalance();
}
