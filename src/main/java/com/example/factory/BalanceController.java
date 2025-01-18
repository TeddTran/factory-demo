package com.example.factory;

public class BalanceController {
    public void updateBalance(Account account, BalanceType type, int amount, Action action) {
        BalanceAction balance = account.getBalances().get(type);
        switch (action) {
            case INCREASE:
                balance.increaseBalance(amount);
                break;
            case DECREASE:
                balance.decreaseBalance(amount);
                break;
            default:
                throw new IllegalArgumentException("Unsupported action: " + action);
        }
    }
}
