package tesis.features.steps;

import utils.ScenarioContext;

/**
* This initializes the scenarioContext
* The scenarioContext is used to save data during the test, and then share it between
* the different steps
*
* @author  Fernando Martinez
* @version 1.0
*/
public class TestContext {

public ScenarioContext scenarioContext;
	
	public TestContext(){
		scenarioContext = new ScenarioContext();
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}
