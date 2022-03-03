$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BankCash.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user fills  the new Account Details in the New Account page \"\u003cAccountTitle\u003e\",\"\u003cDescription\u003e\",\"\u003cInitialBalance\u003e\",\"\u003cAccountNumber\u003e\",\"\u003ccontactPerson\u003e\",\"\u003cPhone\u003e\",\"\u003cInternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "AccountTitle",
        "Description",
        "InitialBalance",
        "AccountNumber",
        "contactPerson",
        "Phone",
        "InternetBankingURL"
      ],
      "line": 16,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;1"
    },
    {
      "cells": [
        "My Account",
        "This is dummy account",
        "1000",
        "123456789",
        "TC",
        "222-123-4",
        "https://www.bankofamerica.com"
      ],
      "line": 17,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2888308100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user fills  the new Account Details in the New Account page \"My Account\",\"This is dummy account\",\"1000\",\"123456789\",\"TC\",\"222-123-4\",\"https://www.bankofamerica.com\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankandCashSteps.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1188133700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    }
  ],
  "location": "BankandCashSteps.user_enters_the_username_as(String)"
});
formatter.result({
  "duration": 203310200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 29
    }
  ],
  "location": "BankandCashSteps.user_enters_the_password_as(String)"
});
formatter.result({
  "duration": 112422700,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_clicks_on_login()"
});
formatter.result({
  "duration": 1638843200,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 450269500,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_clicks_on_bankCash()"
});
formatter.result({
  "duration": 254170800,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_clicks_on_newAccount()"
});
formatter.result({
  "duration": 1214293900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 61
    },
    {
      "val": "This is dummy account",
      "offset": 74
    },
    {
      "val": "1000",
      "offset": 98
    },
    {
      "val": "123456789",
      "offset": 105
    },
    {
      "val": "TC",
      "offset": 117
    },
    {
      "val": "222-123-4",
      "offset": 122
    },
    {
      "val": "https://www.bankofamerica.com",
      "offset": 134
    }
  ],
  "location": "BankandCashSteps.user_fills_the_new_Account_Details_in_the_New_Account_page(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1050560900,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_clicks_on_submit()"
});
formatter.result({
  "duration": 1651410000,
  "status": "passed"
});
formatter.match({
  "location": "BankandCashSteps.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 413647000,
  "status": "passed"
});
});