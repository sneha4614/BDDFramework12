Feature: Login Functionalities for Standard_user

  Background: 1. Navigate to google

    Given the user navigates to "https://www.saucedemo.com"

  @SmokeTest

  Scenario Outline: 1 verify login credentials with datadriven

    When the user enters "<userName>" username and "<passWord>" password

    Then the user should see "<expectedText>" text on the page

    Examples:
      |userName   |passWord      |expectedText|
      |standard_user|secret_sauce   |Products    |
      |standard_user|secret1_sauce |Epic sadface: Username and password do not match any user in this service|
      |standard_user|blank         |Epic sadface: Username and password do not match any user in this service|
