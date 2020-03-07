Feature: Login

Scenario: Successful Login with valid credentials
  Given User Launch chrome browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters Email as "admin@yourstore.com" and password as "admin"
  And Click on Login button
  Then Page title should be "https://admin-demo.nopcommerce.com/Admin"
  When User click on Logout link
  Then Page title should be "Your store. Login"
  And Close browser
  
 Scenario Outline: Login with Data Driven
 Given User Launch chrome browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters Email as "<email>" and password as "<password>"
  And Click on Login button
  Then Page title should be "https://admin-demo.nopcommerce.com/Admin"
  When User click on Logout link
  Then Page title should be "Your store. Login"
  And Close browser
  
  Examples:
   |email|password|
   |admin@yourstore.com|admin|
   |admin1@yourstore.com|admin123|
