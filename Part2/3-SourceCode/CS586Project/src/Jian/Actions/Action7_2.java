package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data2;
import Jian.Factories.AbstractFactory;

public class Action7_2 implements Action7_MakeDeposit {

	@Override
	public void MakeDeposit(AbstractFactory af) {
		Data data = af.getData();
		int balance = ((Data2)data).getBalance();
		int deposit = ((Data2)data).getDeposit();
		balance = balance + deposit;
		((Data2)data).setBalance(balance);
		
		System.out.println("Action 7 Finish!");
	}

}
