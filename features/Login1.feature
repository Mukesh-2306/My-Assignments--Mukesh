Feature: Leaftaps application login functionality 

Background:
Given Open the chrome browser
And Load the application URL

Scenario Outline: Leaftaps appliction with multiple valid credentials
#Given Open the chrome browser  ctrl+/ for command the lines in cucumber
#And Load the application URL
Given enter the user name as <userName> 
And enter the password as <passWord>
When Click on login button 
Then Homepage should be displayed
Examples:
|userName|passWord|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|
|'DemoCSR2'|'crmsfa'|

Scenario Outline: Leaftaps appliction with multiple invalid credentials
#Given Open the chrome browser
#And Load the application URL
Given enter the user name as <userName> 
And enter the password as <passWord>
When Click on login button 
But error message should displyed
Examples:
|userName|passWord|
|'Demosalesmanager123'|''|
|'Democsr'|'crmsfa123'|
|'DemoCSR2123'|'crmsfa'|
|'DemoCSR2123'|'crmsfa5435'|