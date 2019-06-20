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
@FunctionalTest
Feature: Test Login with all possible scenarios
  Verify user is able to Login

  @SmokeTest @RegressionTest
  Scenario: Testing Login with valid Username and Password
    Given I am on Login Page
    When I fill in "Email" with "nalink@heaptrace.com"
    And I fill in "Password" with "Nitin@123"
    And I click on "Login" button
    Then I should be on "Dashboard" page
    


  