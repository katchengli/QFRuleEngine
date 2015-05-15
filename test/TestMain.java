package test;

import quickforms.ruleEngine.RuleSetIdentifier;
import quickforms.ruleEngine.api.Request;
import quickforms.ruleEngine.api.RuleEngine;

public class TestMain {
	
	public static void main(String[] args) {
		
		RuleEngine ruleEngine = new RuleEngine();
		
		RuleSetIdentifier appName = new RuleSetIdentifier("testProcess");
		
		ruleEngine.addRule(appName, new AssignToPhysicianRule());
		
		Request req = new Request();
		
		ruleEngine.routeRequest(appName, req);
		
	}

}
