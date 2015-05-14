package quickforms.ruleEngine.api;

import java.util.HashMap;
import java.util.Map;

import quickforms.ruleEngine.RuleSet;
import quickforms.ruleEngine.RuleSetIdentifier;
import quickforms.ruleEngine.XMLRuleSet;

public class RuleEngine {

	
	Map<RuleSetIdentifier, RuleSet> ruleSetMap;
	
	public RuleEngine() {
		ruleSetMap = new HashMap<>();
	}
	
	public void addRule(RuleSetIdentifier identifier, Rule toAdd) {
		if(!ruleSetMap.containsKey(identifier)){
			ruleSetMap.put(identifier, new RuleSet(identifier));
		}
		
		ruleSetMap.get(identifier).addRule(toAdd);
	}
	
	public void loadRulesFromXML(RuleSetIdentifier identifier, XMLRuleSet toLoad) {
		
	}
	
	public void routeRequest(RuleSetIdentifier identifier, Request req) {
		if(ruleSetMap.containsKey(identifier)){
			ruleSetMap.get(identifier).evaluate(req);
		}
	}
	
}
