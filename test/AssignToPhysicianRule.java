package test;

import quickforms.ruleEngine.RuleAction;
import quickforms.ruleEngine.api.Request;
import quickforms.ruleEngine.api.Rule;


public class AssignToPhysicianRule implements Rule {

	@Override
	public RuleAction evaluate(Request req) {
		System.out.println("Assigning Physician to Patient Rule");
		return RuleAction.ADDED_NEW_FACT;
	}

}
