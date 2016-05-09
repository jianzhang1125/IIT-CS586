package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_8_Locked extends States {
	@Override
	public int getID() {
		ID = 8;
		return ID;
	}

	@Override
	public void IncorrectUnlock(AbstractFactory af) {
		op.Action4_IncorrectPinMsg(af);
	}
}
