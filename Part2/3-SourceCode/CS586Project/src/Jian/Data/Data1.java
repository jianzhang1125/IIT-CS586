package Jian.Data;

public class Data1 extends Data{
	String pin;
	String userID;
	float balance;
	float deposit;
	float withdraw;
	int penalty;
	
	String temp_pin;
	String temp_userID;
	float temp_balance;
	
	
	public String getTemp_pin() {
		return temp_pin;
	}
	public void setTemp_pin(String temp_pin) {
		this.temp_pin = temp_pin;
	}
	
	public String getTemp_userID() {
		return temp_userID;
	}
	public void setTemp_userID(String temp_userID) {
		this.temp_userID = temp_userID;
	}
	public float getTemp_balance() {
		return temp_balance;
	}
	public void setTemp_balance(float temp_balance) {
		this.temp_balance = temp_balance;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
}
