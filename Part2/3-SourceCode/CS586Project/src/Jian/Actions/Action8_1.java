package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data1;
import Jian.Factories.AbstractFactory;

public class Action8_1 implements Action8_DisplayBalance {

	@Override
	public void DisplayBalance(AbstractFactory af) {
		Data data = af.getData();
		float balance = ((Data1)data).getBalance();
		
		System.out.println("DISPLAY BALANCE : " + balance);
		
		System.out.println("Action 8 Finish!");
		
	}

}
