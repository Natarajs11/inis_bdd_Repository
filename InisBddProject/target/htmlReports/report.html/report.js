$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/inis.feature");
formatter.feature({
  "name": "To check the successful visit to inis visa status page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "successful visit to inis webpage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us001"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \u003ctext\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "hits the enter",
  "keyword": "And "
});
formatter.step({
  "name": "user will be navigated to search results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "text"
      ]
    },
    {
      "cells": [
        "\"inis check irish visa\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "successful visit to inis webpage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us001"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"inis check irish visa\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_enters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits the enter",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.hits_the_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be navigated to search results",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_will_be_navigated_to_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Users selects indian nationality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us002"
    }
  ]
});
formatter.step({
  "name": "user is on the inis visa required page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_on_the_inis_visa_required_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects nationality",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_selects_nationality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits on select button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.hits_on_select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to visa-required page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_navigated_to_visa_required_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user select more than three months.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.when_user_select_more_than_three_months()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to study page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_navigated_to_study_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user clicks on the study link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.when_user_clicks_on_the_study_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to visa long study page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_navigated_to_visa_long_study_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Users selects France nationality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us003"
    }
  ]
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects nationality from drop down list",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_selects_nationality_from_drop_down_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hits select button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_hits_select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to visa not required page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_is_navigated_to_visa_not_required_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User selects canadian nationality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us004"
    }
  ]
});
formatter.step({
  "name": "User has visited inis website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_has_visited_inis_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects his nationality from drop down list",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.user_selects_his_nationality_from_drop_down_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits on the select button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.hits_on_the_select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users are navigated to visa requiremnt page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.users_are_navigated_to_visa_requiremnt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user select more than 3 months option.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.when_user_select_more_than_months_option(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users are navigated to study page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.users_are_navigated_to_study_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when users clicks on the study link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.when_users_clicks_on_the_study_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users are navigated to visa not required page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Inis_visa_Steps.users_are_navigated_to_visa_not_required_page()"
});
formatter.result({
  "status": "passed"
});
});