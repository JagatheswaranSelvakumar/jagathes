$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GenerateJsonFile.feature");
formatter.feature({
  "line": 2,
  "name": "As a user generate JSON file from Jenkins",
  "description": "",
  "id": "as-a-user-generate-json-file-from-jenkins",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GenerateJsonFile"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify user able to generate JSON file from Jenkins",
  "description": "",
  "id": "as-a-user-generate-json-file-from-jenkins;verify-user-able-to-generate-json-file-from-jenkins",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@VerifyJSONFile"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User generate JSON file from Jenkins",
  "keyword": "Given "
});
formatter.match({
  "location": "GenerateJsonFileStep.User_generate_JSON_file_from_Jenkins()"
});
formatter.result({
  "duration": 155223232,
  "status": "passed"
});
});