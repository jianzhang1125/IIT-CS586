package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data1;
import Jian.Factories.AbstractFactory;

public class Action11_1 implements Action11_BelowMinPenalty {

	@Override
	public void BelowMinPenalty(AbstractFactory af) {
		Data data = af.getData();
		float balance = ((Data1)data).getBalance();
		int penalty = ((Data1)data).getPenalty();
		balance = balance - penalty;
		((Data1)data).setBalance(balance);
		
		System.out.println("Action 11 Finish!");
	}

}
