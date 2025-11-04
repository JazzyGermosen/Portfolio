package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("pam", 123, 12500);
        BankAccount account2 = new BankAccount("garu", 456, 1500);

        // trying to deposite money into both accounts
        account1.deposit(100);
        account2.deposit(100);
    }
}
