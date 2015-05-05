import java.util.HashMap;
import java.util.Map;

import quickforms.ruleEngine.RuleEngine;


public class TestMain {

	public static void main(String[] args) {
		
		RuleEngine ruleEngine = new RuleEngine();
		
		ruleEngine.addRule(new AssignToPhysicianRule());
		
		Map<String, String> params = new HashMap<String, String>();
		
		ruleEngine.executeRules(params);
		
	}

}
