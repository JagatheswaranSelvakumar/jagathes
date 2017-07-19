package com.automation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class GenerateReport {
    public static void GenerateMasterthoughtReport() {
	try {
	    String rootDir = System.getProperty("user.dir");
	    File reportOutputDirectory = new File(rootDir + "/target/");
	    List<String> jsonFiles = new ArrayList<String>();
	    jsonFiles.add(rootDir + "/cucumber-report.json");
	    String buildNumber = "1";
	    String projectName = "Cucumber Report Count";
	    boolean runWithJenkins = false;
	    boolean parallelTesting = false;
	    Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	    configuration.setParallelTesting(parallelTesting);
	    configuration.setRunWithJenkins(runWithJenkins);
	    configuration.setBuildNumber(buildNumber);
	    ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	    Reportable result = reportBuilder.generateReports();
	    int passedScenarios = result.getPassedScenarios();
	    int failedScenarios = result.getFailedScenarios();
	    int totalScenarios = result.getScenarios();
	    System.out.println("************************************************************");
	    System.out.println("Total Scenarios::::" + totalScenarios);
	    System.out.println("Passed Scenarios::::" + passedScenarios);
	    System.out.println("Failed Scenarios::::" + failedScenarios);
	    System.out.println("************************************************************");
	    result.getScenarios();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
