package quickforms.ruleEngine;

import java.util.Map;

public interface Rule {
	public RuleAction evaluate(Map<String, String> params);
}
