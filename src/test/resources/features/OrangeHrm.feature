# Author Aysegul Karimis
@Login

Feature:OrangeHrm Login
  Scenario: Valid Login

    Given User enter correct username
    When User enter correct password
    And User click login button
    Then User sees the Home page


  Scenario: inValid Login

    Given User enter incorrect username
    When User enter incorrect password
    And User click login button
    Then User sees the error message
