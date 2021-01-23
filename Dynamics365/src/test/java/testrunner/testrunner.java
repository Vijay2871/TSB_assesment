package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="features",
dryRun=false,
monochrome=true,
plugin= {"html:target/cucumber-html-report"},
tags= {"@sanity"}
)

public class testrunner {

}