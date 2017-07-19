package com.automation.StepDefinition;

import com.automation.StepLibrary.GenerateJsonFileLibrary;
import cucumber.api.java.en.Given;

public class GenerateJsonFileStep {

    
    @Given("^User generate JSON file from Jenkins$")
    public void User_generate_JSON_file_from_Jenkins() {
	GenerateJsonFileLibrary.generateJsonFromJenkins();
    }
    
}
