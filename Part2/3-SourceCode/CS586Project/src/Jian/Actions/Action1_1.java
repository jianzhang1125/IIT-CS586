package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data1;

public class Action1_1 implements Action1_StoreData{

	@Override
	public void StoreData(Data data) {
		String temp_pin = ((Data1)data).getTemp_pin();
		String temp_userID = ((Data1)data).getTemp_userID();
		float temp_balance = ((Data1)data).getTemp_balance();
		
		((Data1)data).setPin(temp_pin);
		((Data1)data).setUserID(temp_userID);
		((Data1)data).setBalance(temp_balance);
		
		System.out.println("Action 1 Finish!");
	}

}
