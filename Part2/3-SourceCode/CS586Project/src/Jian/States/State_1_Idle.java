package Jian.States;

import Jian.Factories.AbstractFactory;

public class State_1_Idle extends States{
	@Override
	public int getID() {
		ID = 1;
		return ID;
	}
	
	@Override
	public void Login(AbstractFactory af) {
		op.Action3_PromptPin(af);
		attempts = 0;
	}
	
	@Override
	public void IncorrectLogin(AbstractFactory af) {
		op.Action2_IncorrectIDMsg(af);
	}
}
