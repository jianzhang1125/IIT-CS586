package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_5_S2 extends States {
	@Override
	public int getID() {
		ID = 5;
		return ID;
	}

	@Override
	public void WithdrawPenalty(AbstractFactory af) {
		op.Action11_BelowMinPenalty(af);
	}

	@Override
	public void NoFound(AbstractFactory af) {
		op.Action12_NoFoundMsg(af);
	}

}
