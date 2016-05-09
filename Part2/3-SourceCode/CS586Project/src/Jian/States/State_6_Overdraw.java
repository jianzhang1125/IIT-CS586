package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_6_Overdraw extends States {
	@Override
	public int getID() {
		ID = 6;
		return ID;
	}

	@Override
	public void Balance(AbstractFactory af) {
		op.Action8_DisplayBalance(af);
	}

	@Override
	public void Withdraw(AbstractFactory af) {
		op.Action9_BelowMinMsg(af);
	}

	@Override
	public void IncorrectLock(AbstractFactory af) {
		op.Action4_IncorrectPinMsg(af);
	}

	@Override
	public void Deposit(AbstractFactory af) {
		op.Action7_MakeDeposit(af);
	}
}
