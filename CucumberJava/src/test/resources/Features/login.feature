Feature: Validate the Login page
	@smoke9
  Scenario: Validate login button with valid credentials 
    Given User navigate to login page URL
    When User enter username
    And User enter password
    And User click login button
    Then User should be on welcome page