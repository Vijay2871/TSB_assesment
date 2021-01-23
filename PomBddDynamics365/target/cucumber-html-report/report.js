$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/D365.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase order creation",
  "description": "",
  "id": "purchase-order-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login check with valid credentials",
  "description": "",
  "id": "purchase-order-creation;login-check-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start the dynamics web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"\u003cusername\u003e\" and click the ok button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can enter the valid \"\u003cpassword\u003e\" and click the ok button",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "18030625@student.agi.ac.nz",
        "5t4rncVB"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I clicked the clicked the signin button to enter the dashboard",
  "keyword": "And "
});
});