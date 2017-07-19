package com.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber-report.json" }, features = { "src/test/java/com/automation/Feature" }, glue = {
	"com/automation/StepDefinition" }, tags = { "@VerifyJSONFile" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
