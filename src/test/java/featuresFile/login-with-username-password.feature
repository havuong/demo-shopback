Feature: Login function
  Scenario: Verify login with valid username and password
  Given User access to Homepage
    And User access to Login popup
    When User login with username "asf" and password "asdf"
    And User go to next page
#    And User inputs password
#    When User clicks on Next
#    Then User login successfully
