package Jian.States;

import Jian.Actions.OP;
import Jian.Factories.AbstractFactory;

public abstract class States {
	OP op = new OP();
	int attempts = 0;
	int ID = 0;
	
	public int getAttempts() {
		return attempts;
	}
	
	public int getID() {
		return ID;
	}
	
	public void Open(AbstractFactory af) {
	}
	
	public void Login(AbstractFactory af) {
	}
	
	public void IncorrectLogin(AbstractFactory af) {
	}
	
	public void IncorrectPin(AbstractFactory af, int max) {
	}
	
	public void CorrectPinAboveMin(AbstractFactory af) {
	}
	
	public void CorrectPinBelowMin(AbstractFactory af) {
	}
	
	public void Logout(AbstractFactory af) {
	}
	
	public void Deposit(AbstractFactory af) {
	}
	
	public void DepositAboveMin(AbstractFactory af) {
	}
	
	public void DepositBelowMin(AbstractFactory af) {
	}
	
	public void Balance(AbstractFactory af) {
	}
	
	public void Withdraw(AbstractFactory af) {
	}
	
	public void WithdrawAboveMin(AbstractFactory af) {
	}
	
	public void WithdrawPenalty(AbstractFactory af) {
	}
	
	public void NoFound(AbstractFactory af) {
	}
	
	public void Lock(AbstractFactory af) {
	}	
	
	public void IncorrectLock(AbstractFactory af) {
	}	
	
	public void IncorrectUnlock(AbstractFactory af) {
	}	
	
	public void UnlockAboveMin(AbstractFactory af) {
	}
	
	public void UnlockBelowMin(AbstractFactory af) {
	}	
	
	public void Suspend(AbstractFactory af) {
	}	
	
	public void Activate(AbstractFactory af) {
	}	
	
	public void Close(AbstractFactory af) {
	}	
}
