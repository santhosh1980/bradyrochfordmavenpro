#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@telecomApplicationCustomerFeature
Feature: Telecom Application Customer Feature

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @addCustomerMultiple 
  Scenario Outline: Add Multiple Customers
    Given Open the Chrome and launch the Guru99 Telecom Application
    And click Add Customer link
    When I enter BackgroundCheck as "<bcheck>" and Firstname as "<fname>" and Lastname as "<lname>" and EmailAddress as "<email>" and CustomerAddress as "<address>" and MobileNumber as "<mobile>"
    And I click Submit button
    Then I verify the customer successfully created

    Examples: 
|bcheck|fname|lname|email|address|mobile|
|pending|harry|potter|harry@test1.com|8 Thorndale|07778323489|
|done|william|potter|william@test1.com|9 Thorndale|08888323293|
|pending|jasim|potter|jasim@test1.com|10 Thorndale|09998323200|



 @addTariffplantoCustomerMultiple 
  Scenario Outline: Add Tariff plan to Multiple Customers
    Given Open the Chrome and launch the Guru99 Telecom Application
    And click Add Tariff Plan to Customer link
    When I enter CustomerID as "<cid>" 
    And I click Submit button
    Then Approved Tariff Plans displayed and selected Tariff Plan added to customer
    
        Examples: 
|cid|
|737324|
|885917|
|423792|