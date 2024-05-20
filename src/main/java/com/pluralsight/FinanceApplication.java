package com.pluralsight;

public class FinanceApplication {

    public static void main(String[] args) {
        // Create instances of BankAccount and Valuable
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        ValuableInterface account2 = new BankAccount(456, "Gary", 1500);


        // Try to deposit money into both accounts
        account1.deposit(100);
        ValuableInterface.deposit(100);

    }


}
