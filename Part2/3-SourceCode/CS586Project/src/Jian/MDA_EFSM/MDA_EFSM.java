package Jian.MDA_EFSM;

import java.util.ArrayList;

import Jian.Factories.AbstractFactory;
import Jian.States.State_0_Start;
import Jian.States.State_1_Idle;
import Jian.States.State_2_CheckPin;
import Jian.States.State_3_Ready;
import Jian.States.State_4_S1;
import Jian.States.State_5_S2;
import Jian.States.State_6_Overdraw;
import Jian.States.State_7_Suspend;
import Jian.States.State_8_Locked;
import Jian.States.State_9_End;
import Jian.States.States;

public class MDA_EFSM {
	ArrayList<States> states;
	States currentState;
	int ID = 0;

	public void setStart() {
		states = new ArrayList<States>();
		states.add(new State_0_Start());
		states.add(new State_1_Idle());
		states.add(new State_2_CheckPin());
		states.add(new State_3_Ready());
		states.add(new State_4_S1());
		states.add(new State_5_S2());
		states.add(new State_6_Overdraw());
		states.add(new State_7_Suspend());
		states.add(new State_8_Locked());
		states.add(new State_9_End());
		currentState = states.get(0);
		ID = 0;
	}

	public void getInformation() {
		ID = currentState.getID();
		System.out.println("Current state : " + ID);
		int a = currentState.getAttempts();
		System.out.println("Attempts = " + a);
	}

	public void Open(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 0) {
			currentState.Open(af);
			currentState = states.get(1);
		}
	}

	public void Login(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 1) {
			currentState.Login(af);
			currentState = states.get(2);
		}
	}

	public void IncorrectLogin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 1) {
			currentState.IncorrectLogin(af);
		}
	}

	public void IncorrectPin(AbstractFactory af, int max) {
		ID = currentState.getID();
		if (ID == 2) {
			int attempts = currentState.getAttempts();
			if (attempts == max) {
				currentState.IncorrectPin(af, max);
				currentState = states.get(1);
			} else if (attempts < max) {
				currentState.IncorrectPin(af, max);
			}
		}
	}

	public void CorrectPinAboveMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 2) {
			currentState.CorrectPinAboveMin(af);
			currentState = states.get(3);
		}
	}

	public void CorrectPinBelowMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 2) {
			currentState.CorrectPinBelowMin(af);
			currentState = states.get(6);
		}
	}

	public void Logout(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 2 || ID == 3 || ID == 6) {
			currentState.Logout(af);
			currentState = states.get(1);
		}

	}

	public void Deposit(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 6) {
			currentState.Deposit(af);
			currentState = states.get(4);
		} else if (ID == 3) {
			currentState.Deposit(af);
		}

	}

	public void DepositAboveMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 4) {
			currentState.DepositAboveMin(af);
			currentState = states.get(3);
		}
	}

	public void DepositBelowMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 4) {
			currentState.DepositBelowMin(af);
			currentState = states.get(6);
		}
	}

	public void Balance(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 3 || ID == 6 || ID == 7) {
			currentState.Balance(af);
		}
	}

	public void Withdraw(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 3) {
			currentState.Withdraw(af);
			currentState = states.get(5);
		} else if (ID == 6) {
			currentState.Withdraw(af);
		}
	}

	public void WithdrawAboveMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 5) {
			currentState.WithdrawAboveMin(af);
			currentState = states.get(3);
		}
	}

	public void WithdrawPenalty(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 5) {
			currentState.WithdrawPenalty(af);
			currentState = states.get(6);
		}
	}

	public void NoFound(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 5) {
			currentState.NoFound(af);
			currentState = states.get(3);
		}
	}

	public void Lock(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 3 || ID == 6) {
			currentState.Lock(af);
			currentState = states.get(8);
		}
	}

	public void IncorrectLock(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 3 || ID == 6) {
			currentState.IncorrectLock(af);
		}
	}

	public void IncorrectUnlock(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 8) {
			currentState.IncorrectUnlock(af);
		}
	}

	public void UnlockAboveMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 8) {
			currentState.UnlockAboveMin(af);
			currentState = states.get(3);
		}
	}

	public void UnlockBelowMin(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 8) {
			currentState.UnlockBelowMin(af);
			currentState = states.get(6);
		}
	}

	public void Suspend(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 3) {
			currentState.Suspend(af);
			currentState = states.get(7);
		}
	}

	public void Activate(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 7) {
			currentState.Activate(af);
			currentState = states.get(3);
		}
	}

	public void Close(AbstractFactory af) {
		ID = currentState.getID();
		if (ID == 7) {
			currentState.Close(af);
			currentState = states.get(9);
		}
	}
}
