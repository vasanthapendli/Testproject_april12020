
Feature: Login to Demowebshop site
  login process to demo webshop site
  
  Scenario: successful login to demo webshop
  
	Given user launched chrome browser
	And user provides the valid url
	And user clicks on login hyperlink
	When user provides valid Email and Password
	And he clicks on Login button
	Then user shall be able to view the homepage
	And see the welcome message