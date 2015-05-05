package test;
import java.util.Map;

import quickforms.ruleEngine.Rule;
import quickforms.ruleEngine.RuleAction;


public class AssignToPhysicianRule implements Rule {

	@Override
	public RuleAction evaluate(Map<String, String> params) {
		System.out.println("Assigning Physician to Patient Rule");
		return RuleAction.ADDED_NEW_FACT;
	}

}
