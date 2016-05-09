package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data1;
import Jian.Factories.AbstractFactory;

public class Action7_1 implements Action7_MakeDeposit {

	@Override
	public void MakeDeposit(AbstractFactory af) {
		Data data = af.getData();
		float balance = ((Data1)data).getBalance();
		float deposit = ((Data1)data).getDeposit();
		balance = balance + deposit;
		((Data1)data).setBalance(balance);
		
		System.out.println("Action 7 Finish!");
	}

}
