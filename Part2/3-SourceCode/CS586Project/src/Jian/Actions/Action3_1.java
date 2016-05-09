package Jian.Actions;

import Jian.Factories.AbstractFactory;

public class Action3_1 implements Action3_PromptPin {

	@Override
	public void PromptPin(AbstractFactory af) {
		System.out.println("PROMPT TO ENTER PIN");
		
		System.out.println("Action 3 Finish!");
	}
}
