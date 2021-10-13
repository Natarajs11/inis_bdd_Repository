package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/inis.feature",glue={"stepDefinitions"},
monochrome = true,
tags = {"@us001 or @us002 or @us003 or @us004"},
plugin= {"pretty","junit:target/JunitReports/report.xml","html:target/htmlReports/report.html",
		"json:target/jsonReports/report.html"}

		)	


public class TestRunner {

}
