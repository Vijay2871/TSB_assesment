$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Automated End-to-End Test on Trade me",
  "description": "",
  "id": "automated-end-to-end-test-on-trade-me",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7111683700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User has to check the keywords in motor section",
  "description": "",
  "id": "automated-end-to-end-test-on-trade-me;user-has-to-check-the-keywords-in-motor-section",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User clicks the Trademe Sandbox url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he clicks the Motors icon on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "searches BMW and click search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select the first element",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the term Number Plate in the page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the term Kilometres in the page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify the term Body in the page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify the term Seats in the page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_the_Trademe_Sandbox_url()"
});
formatter.result({
  "duration": 6457133300,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.he_clicks_the_Motors_icon_on_the_home_page()"
});
formatter.result({
  "duration": 85393500,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.searches_BMW_and_click_search_button()"
});
formatter.result({
  "duration": 3816966000,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.select_the_first_element()"
});
formatter.result({
  "duration": 4247592300,
  "status": "passed"
});
formatter.match({
  "location": "VerifySteps.verify_the_term_Number_Plate_in_the_page()"
});
formatter.result({
  "duration": 5008860800,
  "status": "passed"
});
formatter.match({
  "location": "VerifySteps.verify_the_term_Kilometres_in_the_page()"
});
formatter.result({
  "duration": 5007556800,
  "status": "passed"
});
formatter.match({
  "location": "VerifySteps.verify_the_term_Body_in_the_page()"
});
formatter.result({
  "duration": 851400,
  "status": "passed"
});
formatter.match({
  "location": "VerifySteps.verify_the_term_Seats_in_the_page()"
});
formatter.result({
  "duration": 284300,
  "status": "passed"
});
formatter.after({
  "duration": 605575500,
  "status": "passed"
});
});