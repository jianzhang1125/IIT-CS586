package Jian.Actions;

public class Action5_1 implements Action5_TooManyAttemptsMsg {

	@Override
	public void TooManyAttemptsMsg() {
		System.out.println("TOO MANY ATTEMPTS");
		
		System.out.println("Action 5 Finish!");
	}

}
