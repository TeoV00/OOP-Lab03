package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount {
    private static final double FIXED_COST = 5.0;
    private static final double ATM_TRANSACTION_FEE = 0.1;
    private int userID;
    private double balance;
    private int nTransactions;

    public StrictBankAccount(final int usrID, final double balance) {
        this.userID = usrID;
        this.balance = balance;
        this.nTransactions = 0;
    }

    public void withdraw(final int usrID, final double amount) {
        if (checkID(usrID) && amount <= this.balance) {
            this.balance = this.balance - amount;
            incTrasnactionNum();
        }
    }

    public void deposit(final int usrID, final double amount) {
        if (checkID(usrID)) {
            this.balance = this.balance + amount;
            incTrasnactionNum();
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        if (checkID(usrID)) {
            deposit(usrID, amount);
        }
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        if (checkID(usrID)) {
            withdraw(usrID, amount);
        }
    }

    public void chargeManagementFees(final int usrID) {
        if (checkID(usrID)) {
            this.balance = (this.balance - FIXED_COST - (ATM_TRANSACTION_FEE * nTransactions));
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.nTransactions;
    }

    private boolean checkID(final int usrID) {
        return usrID == this.userID;
    }

    private void incTrasnactionNum() {
        this.nTransactions += 1;
    }

}
