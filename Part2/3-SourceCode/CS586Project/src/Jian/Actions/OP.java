package Jian.Actions;

import Jian.Data.Data;
import Jian.Factories.AbstractFactory;

/**
 * This is the class which will provide all the actions in the MDA-EFSM diagram.
 */

public class OP {

	public void Action1_StoreData(AbstractFactory af) {
		Data data = af.getData();
		Action1_StoreData action1 = af.create_Action1_StoreData();
		action1.StoreData(data);
	}

	public void Action2_IncorrectIDMsg(AbstractFactory af) {
		Action2_IncorrectIDMsg action2 = af.create_Action2_IncorrectIDMsg();
		action2.IncorrectIDMsg();
	}

	public void Action3_PromptPin(AbstractFactory af) {
		Action3_PromptPin action3 = af.creat_Action3_PromptPin();
		action3.PromptPin(af);
	}

	public void Action4_IncorrectPinMsg(AbstractFactory af) {
		Action4_IncorrectPinMsg action4 = af.creat_Action4_IncorrectPinMsg();
		action4.IncorrectPinMsg();
	}

	public void Action5_TooManyAttemptsMsg(AbstractFactory af) {
		Action5_TooManyAttemptsMsg action5 = af.creat_Action5_TooManyAttemptsMsg();
		action5.TooManyAttemptsMsg();
	}

	public void Action6_DisplayMenu(AbstractFactory af) {
		Action6_DisplayMenu action6 = af.creat_Action6_DisplayMenu();
		action6.DisplayMenu();
	}

	public void Action7_MakeDeposit(AbstractFactory af) {
		Action7_MakeDeposit action7 = af.creat_Action7_MakeDeposit();
		action7.MakeDeposit(af);
	}

	public void Action8_DisplayBalance(AbstractFactory af) {
		Action8_DisplayBalance action8 = af.creat_Action8_DisplayBalance();
		action8.DisplayBalance(af);
	}

	public void Action9_BelowMinMsg(AbstractFactory af) {
		Action9_BelowMinMsg action9 = af.creat_Action9_BelowMinMsg();
		action9.BelowMinMsg();
	}

	public void Action10_MakeWithdraw(AbstractFactory af) {
		Action10_MakeWithdraw action10 = af.creat_Action10_MakeWithdraw();
		action10.MakeWithdraw(af);
	}

	public void Action11_BelowMinPenalty(AbstractFactory af) {
		Action11_BelowMinPenalty action11 = af.creat_Action11_BelowMinPenalty();
		action11.BelowMinPenalty(af);
	}

	public void Action12_NoFoundMsg(AbstractFactory af) {
		Action12_NoFoundMsg action12 = af.creat_Action12_NoFoundMsg();
		action12.NoFoundMsg();
	}
}
