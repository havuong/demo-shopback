Feature: Verify item list
  Scenario: Verify number of item in HomePage
    Given User access to Homepage
    Then User sees 12 items displayed in Popular tab
