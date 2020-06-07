package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReportClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, strict = false, monochrome = true, plugin = {
		"pretty", "html:src\\test\\resources\\Reports\\Html Reports",
		"junit:src\\test\\resources\\Reports\\Xml Reports\\OurShoppe.xml",
		"json:src\\test\\resources\\Reports\\Json Reports\\OurShoppe.json", "rerun:target\\Rerun\\rerun.txt" })

public class TestRunnerClass {
	@AfterClass
	public static void JvmReportGeneration() {
		JvmReportClass.generateJvmReport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Json Reports\\OurShoppe.json");

	}

}
