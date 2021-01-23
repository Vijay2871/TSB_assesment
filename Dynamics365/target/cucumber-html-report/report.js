$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Purchaseorder.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase order creation",
  "description": "",
  "id": "purchase-order-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login check with valid credentials",
  "description": "",
  "id": "purchase-order-creation;login-check-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open the bowser and launch the Microsoft dynamics page Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter my valid \"\u003cusername\u003e\" and click the ok button to proceed to the next page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I can enter my valid \"\u003cpassword\u003e\" and click the ok button",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "18030625@student.agi.ac.nz",
        "5t4rncVB"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I clicked the clicked the signin button to enter the dashboard page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Create purchase order",
  "description": "",
  "id": "purchase-order-creation;create-purchase-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Open the bowser and launch the Microsoft dynamics page Url",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter my valid \"\u003cusername\u003e\" and click the ok button to proceed to the next page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can enter my valid \"\u003cpassword\u003e\" and click the ok button",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "18030625@student.agi.ac.nz",
        "5t4rncVB"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I clicked the clicked the signin button to enter the dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click the navigation panel and accounts payable and all purchase order",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the new purchase order",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "enter \"\u003cvendor account\u003e\"  and \"\u003csite\u003e\"",
  "rows": [
    {
      "cells": [
        "vendor account",
        "site"
      ],
      "line": 23
    },
    {
      "cells": [
        "1001",
        "1"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click the ok button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "enter the item number",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "save and confirm the purchase order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});