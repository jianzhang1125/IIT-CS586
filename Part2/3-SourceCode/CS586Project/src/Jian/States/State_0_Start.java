package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_0_Start extends States{
	@Override
	public int getID() {
		ID = 0;
		return ID;
	}
	
	@Override
	public void Open(AbstractFactory af) {
		op.Action1_StoreData(af);
	}
}
