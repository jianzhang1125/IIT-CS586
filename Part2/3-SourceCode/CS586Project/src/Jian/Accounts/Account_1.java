package Jian.Accounts;

import Jian.Data.Data;
import Jian.Data.Data1;
import Jian.Factories.AbstractFactory;
import Jian.Factories.Factory_Account_1;
import Jian.MDA_EFSM.MDA_EFSM;;

/**
 * This is the class which will provide operations which belongs to account 1
 * for the clients.
 */
public class Account_1 {
	Data data;
	AbstractFactory af;
	MDA_EFSM mda;

	final int MIN = 500;
	final int MAX_ATTEMPTS = 3;
	final int PENALTY = 20;

	// This is the constructor.
	// Initialize data, abstract factory and MDA-EFSM class.
	public Account_1() {
		data = new Data1();
		af = new Factory_Account_1(data);
		mda = new MDA_EFSM();
		mda.setStart();
	}

	// return the current state and attempts number.
	public void getInformation() {
		mda.getInformation();
	}

	// Open an account-1
	// p is pin, y is user ID, a is balance
	public void open(String p, String y, float a) {
		((Data1) data).setTemp_pin(p);
		((Data1) data).setTemp_userID(y);
		((Data1) data).setTemp_balance(a);

		mda.Open(af);
	}

	// Provide pin number
	public void pin(String x) {
		String pin = ((Data1) data).getPin();
		float balance = ((Data1) data).getBalance();

		if (x.equals(pin)) {
			if (balance > MIN) {
				mda.CorrectPinAboveMin(af);
			} else {
				mda.CorrectPinBelowMin(af);
			}
		} else {
			mda.IncorrectPin(af, MAX_ATTEMPTS);
		}
	}

	// Deposit amount d
	public void deposit(float d) {
		((Data1) data).setDeposit(d);

		mda.Deposit(af);

		float balance = ((Data1) data).getBalance();

		if (balance > MIN) {
			mda.DepositAboveMin(af);
		} else {
			mda.DepositBelowMin(af);
		}
	}

	// Display the current balance
	public void balance() {
		mda.Balance(af);
	}

	// Login where y is an user ID
	public void login(String y) {
		String userID = ((Data1) data).getUserID();

		if (y.equals(userID)) {
			mda.Login(af);
		} else {
			mda.IncorrectLogin(af);
		}
	}

	// Logout from account-1
	public void logout() {
		mda.Logout(af);
	}

	// Withdraw with amount w
	public void withdraw(float w) {
		((Data1) data).setWithdraw(w);
		((Data1) data).setPenalty(PENALTY);

		mda.Withdraw(af);

		float balance = ((Data1) data).getBalance();

		if (balance > MIN) {
			mda.WithdrawAboveMin(af);
		} else {
			mda.WithdrawPenalty(af);
		}
	}

	// Locks account, x is a pin
	public void lock(String x) {
		String pin = ((Data1) data).getPin();

		if (x.equals(pin)) {
			mda.Lock(af);
		} else {
			mda.IncorrectLock(af);
		}
	}

	// Unlock an account, x is a pin
	public void unlock(String x) {
		String pin = ((Data1) data).getPin();
		float balance = ((Data1) data).getBalance();

		if (x.equals(pin)) {
			if (balance > MIN) {
				mda.UnlockAboveMin(af);
			} else {
				mda.UnlockBelowMin(af);
			}
		} else {
			mda.IncorrectUnlock(af);
		}
	}
}
