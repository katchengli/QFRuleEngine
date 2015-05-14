package quickforms.ruleEngine.api;

import quickforms.ruleEngine.RuleAction;

public interface Rule {
	public RuleAction evaluate(Request req);
}
