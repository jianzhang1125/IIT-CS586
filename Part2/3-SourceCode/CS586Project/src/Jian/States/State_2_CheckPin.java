package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_2_CheckPin extends States {
	@Override
	public int getID() {
		ID = 2;
		return ID;
	}

	@Override
	public void IncorrectPin(AbstractFactory af, int max) {
		if (attempts == max) {
			attempts = 0;
			op.Action4_IncorrectPinMsg(af);
			op.Action5_TooManyAttemptsMsg(af);
		} else if (attempts < max) {
			op.Action4_IncorrectPinMsg(af);
			attempts++;
		}
	}

	@Override
	public void CorrectPinAboveMin(AbstractFactory af) {
		op.Action6_DisplayMenu(af);
	}

	@Override
	public void CorrectPinBelowMin(AbstractFactory af) {
		op.Action6_DisplayMenu(af);
	}
}
