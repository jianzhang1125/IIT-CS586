package Jian.Actions;

import Jian.Data.Data;
import Jian.Data.Data2;

public class Action1_2 implements Action1_StoreData{

	@Override
	public void StoreData(Data data) {
		int temp_pin = ((Data2)data).getTemp_pin();
		int temp_userID = ((Data2)data).getTemp_userID();
		int temp_balance = ((Data2)data).getTemp_balance();
		
		((Data2)data).setPin(temp_pin);
		((Data2)data).setUserID(temp_userID);
		((Data2)data).setBalance(temp_balance);
		
		System.out.println("Action 1 Finish!");
	}

}
