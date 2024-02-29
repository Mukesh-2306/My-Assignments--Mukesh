Feature: Leaftaps application login functionality 
Scenario Outline: Leaftaps appliction with multiple valid credentials
Given Open the chrome browser
And Load the application URL
And enter the user name as <userName> 
And enter the password as <passWord>
When Click on login button 
Then Homepage should be displayed
Examples:
|userName|passWord|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|
|'DemoCSR2'|'crmsfa'|