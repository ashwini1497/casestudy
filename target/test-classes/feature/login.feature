Feature: login with registered user
 
Scenario Outline: valid registered user
* user launches chrome browsers 
* user enters into tetme application 
* user clicks on signin link 
* user clicks on username as "<username>" in un field 
* user clicks on password as "<password>" in pwd field 
* user clicks on login button 
Examples:
|username|password|
|lalitha|password123|
 