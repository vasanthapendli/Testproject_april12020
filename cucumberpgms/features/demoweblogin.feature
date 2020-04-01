Feature: open demowebshop url and user shall be able to login into demowebshop site
  
  Scenario Outline: successful login to demowebshop
  
	Given  chrome browser is launched by user
	
	And user provides the valid url

	And user clicks on login hyperlink
	
	When user provides valid Email"<email>"
	 
	When user provides valid Password"<password>" 
	
	And he clicks on Login button
	
	Then user shall be able to view the homepage with welcome message

    Examples: 
      | email                |password   |
      | karthik456@gmail.com |karthik456 |
      | sri_123@gmail.com    |Pass123    |
