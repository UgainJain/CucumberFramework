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
@tag
Feature: a Mercury Login

  @tag1
    Scenario: invalid Login
  Given User is on Login Page
	When user provides "mercury" and "mer"
	Then user clicks on login button
	And user is still on loginpage
	
  Scenario: Login to Mercury
	When user provides "mercury" and "mercury"
	Then user clicks on login button
	And user is on homepage
    
   

