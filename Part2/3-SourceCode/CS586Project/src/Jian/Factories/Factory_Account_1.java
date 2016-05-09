package Jian.Factories;
import Jian.Actions.*;
import Jian.Data.Data;

public class Factory_Account_1 extends AbstractFactory{

	public Factory_Account_1(Data data) {
		this.data = data;
	}

	@Override
	public Data getData() {
		return data;
	}

	@Override
	public Action1_StoreData create_Action1_StoreData() {
		return new Action1_1();
	}
	
	@Override
	public Action2_IncorrectIDMsg create_Action2_IncorrectIDMsg() {
		return new Action2_1();
	}

	@Override
	public Action3_PromptPin creat_Action3_PromptPin() {
		return new Action3_1();
	}

	@Override
	public Action4_IncorrectPinMsg creat_Action4_IncorrectPinMsg() {
		return new Action4_1();
	}

	@Override
	public Action5_TooManyAttemptsMsg creat_Action5_TooManyAttemptsMsg() {
		return new Action5_1();
	}

	@Override
	public Action6_DisplayMenu creat_Action6_DisplayMenu() {
		return new Action6_1();
	}

	@Override
	public Action7_MakeDeposit creat_Action7_MakeDeposit() {
		return new Action7_1();
	}

	@Override
	public Action8_DisplayBalance creat_Action8_DisplayBalance() {
		return new Action8_1();
	}

	@Override
	public Action9_BelowMinMsg creat_Action9_BelowMinMsg() {
		return new Action9_1();
	}

	@Override
	public Action10_MakeWithdraw creat_Action10_MakeWithdraw() {
		return new Action10_1();
	}

	@Override
	public Action11_BelowMinPenalty creat_Action11_BelowMinPenalty() {
		return new Action11_1();
	}

	@Override
	public Action12_NoFoundMsg creat_Action12_NoFoundMsg() {
		return new Action12_1();
	}
	
	
}
