package quickforms.ruleEngine;


/**
 * A Rule Set Identifier usually corresponds to the app name to which the rule set is
 * associated.
 * 
 * @author Katherine ChengLi
 *
 */
public class RuleSetIdentifier {
	private String appName;
	
	public RuleSetIdentifier(String appName){
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
