package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_7_Suspend extends States {
	@Override
	public int getID() {
		ID = 7;
		return ID;
	}

	@Override
	public void Balance(AbstractFactory af) {
		op.Action8_DisplayBalance(af);
	}
}
