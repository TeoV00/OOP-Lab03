package oop.lab03.bank;

import oop.lab03.bank.interfaces.*;

public class SimpleBankAccount implements BankAccount{

    private static double ATM_TRANSACTION_FEE = 1.0;
    private int userID;
    private double balance;
    private int nTransactions;

    public SimpleBankAccount(final int userId, final double balance) {
        this.userID = userId;
	    this.balance = balance;
	    this.nTransactions = 0;
	}

	public int getUserId() {
	    return this.userID;
	}
	
	public int getTransactionsCount() {
	    return this.nTransactions;
	}
	
	public double getBalance() {
	    return this.balance;
	}

    public void deposit(final int usrID, final double amount) {
        if (this.checkUser(usrID)) {
            this.nTransactions = this.nTransactions + 1;
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(final int usrID, final double amount) {
        if (this.checkUser(usrID)) {
            this.nTransactions = this.nTransactions + 1;
            this.balance = this.balance - amount;
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        if (this.checkUser(usrID)) {
            this.nTransactions = this.nTransactions + 1;
            this.balance = this.balance + amount - ATM_TRANSACTION_FEE;
        }
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        if (this.checkUser(usrID)) {
            this.nTransactions = this.nTransactions + 1;
            this.balance = this.balance - amount - ATM_TRANSACTION_FEE;
        }
    }

    private boolean checkUser(final int id) {
        return this.userID == id;
    }

    public void chargeManagementFees(final int usrID) {
        // TODO Auto-generated method stub
    }
}
