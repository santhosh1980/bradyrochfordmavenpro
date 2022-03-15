Feature: Login functionality of Application

@smoke
Scenario: Valid login test 
Given Open the Chrome and launch the application	
When Enter valid Username and Password
|1303|Guru99|
And Click Login button
Then User successfully logged in
#And User successfully logged out

@regression
Scenario: Invalid login test
Given Open the Chrome and launch the application
When Enter Invalid Username and Password
|1303|hello|
And Click Login button
Then User not successfully logged in
When Enter Invalid Username and Password
|1403|world|
And Click Login button
Then User not successfully logged in
Then Relogin option should be available

@separate
Scenario: Verification of Reset button 
Given Open the Chrome and launch the application	
When Enter the Username and Password
|username12|password12|
Then Reset the credential

#Corresponding steps in Stepdefinition 2 file