package com.example.factory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {

		// Khởi tạo Account
		Account account = new Account();
		account.getBalances().put(BalanceType.DEBIT, new DebitBalanceAction(200));
		account.getBalances().put(BalanceType.CREDIT, new CreditBalanceAction(200));
		System.out.println("Debit balance: " +
				account.getBalances().get(BalanceType.DEBIT).getBalance());

		// Sử dụng BalanceController
		BalanceController controller = new BalanceController();

		// Tăng số dư
		controller.updateBalance(account, BalanceType.DEBIT, 100, Action.INCREASE);
		System.out.println("Debit balance: " +
				account.getBalances().get(BalanceType.DEBIT).getBalance());

		// Giảm số dư
		controller.updateBalance(account, BalanceType.DEBIT, 50, Action.DECREASE);

		// Kiểm tra số dư
		System.out.println("Debit balance: " +
				account.getBalances().get(BalanceType.DEBIT).getBalance());
	}

}
