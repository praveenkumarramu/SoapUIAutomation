$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/483877/Documents/sample-gradle/src/main/java/features/samplesoapui.feature");
formatter.feature({
  "name": "Launch a Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch a google home",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Setup the Driver",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.setup_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Driver",
  "keyword": "When "
});
formatter.match({
  "location": "steps.launch_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ensure the Driver launched Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ensure_the_driver_launched_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the Driver",
  "keyword": "And "
});
formatter.match({
  "location": "steps.quit_the_driver()"
});
formatter.result({
  "status": "passed"
});
});