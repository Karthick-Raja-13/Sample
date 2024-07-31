$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\add.feature");
formatter.feature({
  "name": "Add",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully Getting Added Value",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Navigates to the calculator app",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_Navigates_to_the_calculator_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Gives Value on the First Input Box",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_Gives_Value_on_the_First_Input_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Gives Value on the Second Input Box",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_Gives_Value_on_the_Second_Input_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on the Add Button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_Clicks_on_the_Add_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Result Should Match the Addition of Two Values",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.the_Result_Should_Match_the_Addition_of_Two_Values()"
});
formatter.result({
  "status": "passed"
});
});