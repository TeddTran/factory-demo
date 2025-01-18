package com.example.factory;

import java.util.HashMap;
import java.util.Map;

public class Account {
    private Map<BalanceType, BalanceAction> balances = new HashMap<>();

    public Account() {
        this.balances = new HashMap<>();
    }

    // Constructor to initialize the balances
    public Account(int initialDebitBalance, int initialCreditBalance) {
        balances.put(BalanceType.DEBIT, new DebitBalanceAction(initialDebitBalance));
        balances.put(BalanceType.CREDIT, new CreditBalanceAction(initialCreditBalance));
    }

    public Map<BalanceType, BalanceAction> getBalances() {
        return balances;
    }
}
