@Test
Feature: Cucumber with Data list and Data Map

Scenario: Cucumber with List of Map
When User Enter Valid address with List
|11| 20th Cross Street|Chennai|TamilNadu|
|234567890|text@gmail.com|600000|India|
Then Validate entered data

Scenario: Cucumber with List of Map
When User Enter Valid address with Map
|DoorNO|Street|City|State|
|11|cross street|chennai|TN|
|12|third street|chennai|TN|

Then Validate entered data