package Jian.Factories;

import Jian.Actions.*;
import Jian.Data.Data;

public abstract class AbstractFactory {
	Data data;
	
	public abstract Data getData();
	
	public abstract Action1_StoreData create_Action1_StoreData();
	
	public abstract Action2_IncorrectIDMsg create_Action2_IncorrectIDMsg();
	
	public abstract Action3_PromptPin creat_Action3_PromptPin();
	
	public abstract Action4_IncorrectPinMsg creat_Action4_IncorrectPinMsg();
	
	public abstract Action5_TooManyAttemptsMsg creat_Action5_TooManyAttemptsMsg();
	
	public abstract Action6_DisplayMenu creat_Action6_DisplayMenu();
	
	public abstract Action7_MakeDeposit creat_Action7_MakeDeposit();
	
	public abstract Action8_DisplayBalance creat_Action8_DisplayBalance();
	
	public abstract Action9_BelowMinMsg creat_Action9_BelowMinMsg();
	
	public abstract Action10_MakeWithdraw creat_Action10_MakeWithdraw();
	
	public abstract Action11_BelowMinPenalty creat_Action11_BelowMinPenalty();
	
	public abstract Action12_NoFoundMsg creat_Action12_NoFoundMsg();
	
}
