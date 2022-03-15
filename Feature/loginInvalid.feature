Feature: Login functionality of Application

@invalidmultipledata 
Scenario Outline: Invalid login test
Given Open the Chrome and launch the application
When Enter Invalid Username as "<uname>" and Password as "<pword>"
And Click Login button
Then User not successfully logged in
Then Relogin option should be available
Examples:
|uname|pword|
|invalid12|invalid12|
|invalid13|invalid13|
|invalid14|invalid14|
|invalid15|invalid15|
|invalid16|invalid16|

#Corresponding steps in Stepdefinition 3 file