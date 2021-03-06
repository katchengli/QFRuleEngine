package quickforms.ruleEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import quickforms.ruleEngine.api.Request;
import quickforms.ruleEngine.api.Rule;
import quickforms.ruleEngine.api.RuleEngine;

public class RuleSet {
	
	private static final Logger LOGGER = Logger.getLogger(RuleEngine.class.getName());
	
	private List<Rule> rules;
	private RuleSetIdentifier ruleSetIdentifier;

	public RuleSet(RuleSetIdentifier identifier){
		ruleSetIdentifier = identifier;
		rules = new ArrayList<Rule>();
	}
	
	List<Rule> getRuleSet(){
		return rules;
	}
	
	public boolean addRule(Rule rule){
		return rules.add(rule);
	}
	
	public RuleSetIdentifier getRuleSetIdentifier() {
		return ruleSetIdentifier;
	}

	public void evaluate(Request req) {
		for(int i=0; i<rules.size(); i++){
			rules.get(i).evaluate(req);
			LOGGER.info("Evaluated rule");
		}
	}
}
