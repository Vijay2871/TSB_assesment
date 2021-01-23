package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/functionalTests/Informationicon.feature",
glue= {"src/test/java/stepDefenitions"},
plugin= {"html:target/cucumber-html-report"})

public class TestRunner {

}
