Feature: registration process of TestMeApp
I want to user this template for my feature file
Scenario: successful registration of guest user
Given user is on TestMeApp registration page
When user enters "vasantha" as firstname
And enters"pendli" as lastname
And enters "Password123" as password
And enters "Password123" as conformpassword
And click on button "female" as gender
And enters "abc@gmail.com" as gmail
And enters "1234567890" as mobile number
And enters "1/04/20202" as dob
And enters "Hyderabad" as address
And selects index 2 as security question 
And enters "blue" as answer
And user click  on register 
Then user shall be able to view as successful registration message
