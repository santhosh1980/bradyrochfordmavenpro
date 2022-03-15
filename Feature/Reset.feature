Feature: Reset functionality on login page of Application

@resetmultipledata 
Scenario Outline: Verification of Reset button
Given Open the Chrome and launch the application
When Enter the Username as "<uname>" and Password as "<pword>"
Then Reset the credential
Examples:
|uname|pword|
|username12|password12|
|username13|password13|
|username14|password14|
|username15|password15|
|username16|password16|

#Corresponding steps in Stepdefinition 3 file