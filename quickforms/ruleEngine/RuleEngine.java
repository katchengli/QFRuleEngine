package quickforms.ruleEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RuleEngine {

	List<Rule> rules;
	
	
	
	public RuleEngine() {
		rules = new ArrayList<Rule>();
	}
		
	public void addRule(Rule ruleToAdd) {
		rules.add(ruleToAdd);
	}
	
	public void executeRules(Map<String, String> params){
		for(int i=0; i<rules.size(); i++){
			System.out.println(rules.get(i).evaluate(params));
		}
	}
	
	
}
