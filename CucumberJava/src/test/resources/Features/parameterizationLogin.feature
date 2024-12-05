Feature: Validate the login button with parameterization

  Scenario Outline: Validate the login button with valid credentials
    Given Browser is opened
    And User navigate to loginPage
    When User enter <username> and <password>
    And User clicks login button
    Then User is on Homepage 
    And User close the browser

    Examples: 
      | username | password |
      | locked_out_user | secret_sauce |
      | standard_user | secret_sauce |
