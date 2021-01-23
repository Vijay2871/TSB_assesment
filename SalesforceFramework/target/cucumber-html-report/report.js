$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Salesforce.feature");
formatter.feature({
  "line": 1,
  "name": "Salesforce Lightning CRM features",
  "description": "",
  "id": "salesforce-lightning-crm-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Features",
  "description": "",
  "id": "salesforce-lightning-crm-features;login-features",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launched the chrome browser entering the salesforce url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I entered my valid  \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the login button to see my homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "salesforce-lightning-crm-features;login-features;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "salesforce-lightning-crm-features;login-features;;1"
    },
    {
      "cells": [
        "18030625@student.agi.ac.nz",
        "5t4rncVB"
      ],
      "line": 11,
      "id": "salesforce-lightning-crm-features;login-features;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login Features",
  "description": "",
  "id": "salesforce-lightning-crm-features;login-features;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launched the chrome browser entering the salesforce url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I entered my valid  18030625@student.agi.ac.nz and 5t4rncVB",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the login button to see my homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launched_the_chrome_browser_entering_the_salesforce_url()"
});
formatter.result({
  "duration": 2737783400,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 78\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-BN8E26I5\u0027, ip: \u0027192.168.55.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_192\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00C4A903+1550595]\n\tOrdinal0 [0x00BCA701+1025793]\n\tOrdinal0 [0x00B4C6E5+509669]\n\tOrdinal0 [0x00ADFC68+64616]\n\tOrdinal0 [0x00ADC594+50580]\n\tOrdinal0 [0x00AFACE7+175335]\n\tOrdinal0 [0x00AFA8ED+174317]\n\tOrdinal0 [0x00AF8CDB+167131]\n\tOrdinal0 [0x00AE144A+70730]\n\tOrdinal0 [0x00AE24D0+74960]\n\tOrdinal0 [0x00AE2469+74857]\n\tOrdinal0 [0x00BE42C7+1131207]\n\tGetHandleVerifier [0x00CE70FD+523789]\n\tGetHandleVerifier [0x00CE6E90+523168]\n\tGetHandleVerifier [0x00CEE1E7+552695]\n\tGetHandleVerifier [0x00CE78FA+525834]\n\tOrdinal0 [0x00BDB7FC+1095676]\n\tOrdinal0 [0x00BE633B+1139515]\n\tOrdinal0 [0x00BE64A3+1139875]\n\tOrdinal0 [0x00BE5425+1135653]\n\tBaseThreadInitThunk [0x75056359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77267B74+228]\n\tRtlGetAppContainerNamedObjectPath [0x77267B44+180]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefenitions.Steps.launched_the_chrome_browser_entering_the_salesforce_url(Steps.java:18)\r\n\tat ✽.Given Launched the chrome browser entering the salesforce url(Salesforce.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "18030625",
      "offset": 20
    },
    {
      "val": "5",
      "offset": 51
    },
    {
      "val": "4",
      "offset": 53
    }
  ],
  "location": "Steps.i_entered_my_valid_student_agi_ac_nz_and_t_rncVB(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_click_the_login_button_to_see_my_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "App launcher Features",
  "description": "",
  "id": "salesforce-lightning-crm-features;app-launcher-features",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I clicked the App launcher features",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I selected services option to navigate to service page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click the Accounts and created a new account",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I fill the mandatory details",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_clicked_the_App_launcher_features()"
});
formatter.result({
  "duration": 2984600,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefenitions.Steps.i_clicked_the_App_launcher_features(Steps.java:38)\r\n\tat ✽.When I clicked the App launcher features(Salesforce.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.i_selected_services_option_to_navigate_to_service_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_click_the_Accounts_and_created_a_new_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_fill_the_mandatory_details()"
});
formatter.result({
  "status": "skipped"
});
});