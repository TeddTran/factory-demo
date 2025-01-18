package com.example.factory;

public class BalanceActionFactory {
    public static BalanceAction getBalanceAction(BalanceType type) {
        switch (type) {
            case DEBIT:
                return new DebitBalanceAction();
            case CREDIT:
                return new CreditBalanceAction();
            default:
                throw new IllegalArgumentException("Unknown balance type");
        }
    }
}
