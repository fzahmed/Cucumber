Feature: User should be able to login using test data from Database
@Dblogin
Scenario:  user willbe able to login using Database

Given user is on Techfios Database Page
And user put "username" in username field
And user put "passward" in password field
When user click on login button
Then user lands on Dashboard Page
