package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data2;
import Jian.Factories.AbstractFactory;

public class Action10_2 implements Action10_MakeWithdraw{

	@Override
	public void MakeWithdraw(AbstractFactory af) {
		Data data = af.getData();
		int balance = ((Data2)data).getBalance();
		int withdraw = ((Data2)data).getWithdraw();
		balance = balance - withdraw;
		((Data2)data).setBalance(balance);
		
		System.out.println("Action 10 Finish!");
	}
	
}
