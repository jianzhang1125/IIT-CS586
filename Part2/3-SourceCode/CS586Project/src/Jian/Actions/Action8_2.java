package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data2;
import Jian.Factories.AbstractFactory;

public class Action8_2 implements Action8_DisplayBalance {

	@Override
	public void DisplayBalance(AbstractFactory af) {
		Data data = af.getData();
		int balance = ((Data2)data).getBalance();
		
		System.out.println("DISPLAY BALANCE : " + balance);
		
		System.out.println("Action 8 Finish!");
		
	}

}
