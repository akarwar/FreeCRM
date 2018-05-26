package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ahsan\\eclipse-workspace\\com.freeCRM\\src\\main\\java\\Feature\\testCaseOne.Feature",
										glue= {"com.Stepdefinition"},
										monochrome=true,
										strict=true,
										dryRun=false)


public class TestRunner {

}
