 Feature: Bank and Cash New Account Functionality
 @some
 Scenario: Valid User will be ble to add new account
 					Given user is in techfios login page
 					When user enters valid username as "demo@techfios.com" and password as "abc123"
 					And user click on "Login"
 					Then user lands on Dashbord page
 					And user click on "Bank and Cash"
 					And user click on "Add new Account"
 					Then user lands on Add new account page
 					And user enters "Md Hossain" as Acount Title in Add New Account page
 					And user enters "Personal Account" as Description in Add New Account page
 					And user enters "500.00" as Initial Balance in Add New Account page
 					And user enters "11-000-01" as Account Number in Add New Account page
 					And user enters "Md sayeed" as Contact Person in Add New Account page
 					And user enters "469-324-1234" as Phone in Add New Account page
 					And user enters "https://www.bank.com" as Internet Banking URL in Add New Account page
      		And user click on "Submit" 
      		Then user should be able to verify new account created sucessfully
      		