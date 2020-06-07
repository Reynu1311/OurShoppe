package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target\\Rerun\\rerun.txt" }, glue = "org.stepdefinition")
public class TestReRunner {

}
