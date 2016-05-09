package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data1;
import Jian.Factories.AbstractFactory;

public class Action10_1 implements Action10_MakeWithdraw{

	@Override
	public void MakeWithdraw(AbstractFactory af) {
		Data data = af.getData();
		float balance = ((Data1)data).getBalance();
		float withdraw = ((Data1)data).getWithdraw();
		balance = balance - withdraw;
		((Data1)data).setBalance(balance);
		
		System.out.println("Action 10 Finish!");
	}
	
}
