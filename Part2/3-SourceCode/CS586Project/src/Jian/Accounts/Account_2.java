package Jian.Accounts;

import Jian.Data.Data;
import Jian.Data.Data2;
import Jian.Factories.AbstractFactory;
import Jian.Factories.Factory_Account_2;
import Jian.MDA_EFSM.MDA_EFSM;;

/**
 * This is the class which will provide operations which belongs to account 2
 * for the clients.
 */

public class Account_2 {
	Data data;
	AbstractFactory af;
	MDA_EFSM mda;

	final int MIN = 500;
	final int MAX_ATTEMPTS = 2;
	final int PENALTY = 20;

	// This is the constructor.
	// Initialize data, abstract factory and MDA-EFSM class.
	public Account_2() {
		data = new Data2();
		af = new Factory_Account_2(data);
		mda = new MDA_EFSM();
		mda.setStart();
	}

	// return the current state and attempts number.
	public void getInformation() {
		mda.getInformation();
	}

	// Open an account-2
	// p is pin, y is user ID, a is balance
	public void OPEN(int p, int y, int a) {
		((Data2) data).setTemp_pin(p);
		((Data2) data).setTemp_userID(y);
		((Data2) data).setTemp_balance(a);

		mda.Open(af);
	}

	// Provide pin number
	public void PIN(int x) {
		int pin = ((Data2) data).getPin();

		if (x == pin) {
			mda.CorrectPinAboveMin(af);

		} else {
			mda.IncorrectPin(af, MAX_ATTEMPTS);
		}
	}

	// Deposit amount d
	public void DEPOSIT(int d) {
		((Data2) data).setDeposit(d);

		mda.Deposit(af);
	}

	// Display the current balance
	public void BALANCE() {
		mda.Balance(af);
	}

	// Login where y is an user ID
	public void LOGIN(int y) {
		int userID = ((Data2) data).getUserID();

		if (userID == y) {
			mda.Login(af);
		} else {
			mda.IncorrectLogin(af);
		}
	}

	// Logout from account-1
	public void LOGOUT() {
		mda.Logout(af);
	}

	// Withdraw with amount w
	public void WITHDRAW(int w) {
		((Data2) data).setWithdraw(w);

		mda.Withdraw(af);

		int balance = ((Data2) data).getBalance();

		if (balance > 0) {
			mda.WithdrawAboveMin(af);
		} else {
			mda.NoFound(af);
		}
	}

	// suspends an account.
	public void suspend() {
		mda.Suspend(af);
	}

	// activates a suspends account
	public void activate() {
		mda.Activate(af);
	}

	// an account is closed.
	public void close() {
		mda.Close(af);
	}
}
