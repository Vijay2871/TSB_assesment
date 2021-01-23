package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features=".//features/D365.feature",
dryRun=false,
plugin= {"html:target/cucumber-html-report"})

public class testrunner {

}