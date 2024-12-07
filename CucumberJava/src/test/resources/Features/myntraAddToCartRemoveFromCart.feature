@tag1
Feature: Validate Add to Cart and Remove from Cart functionality

  Scenario: Validate Add to Cart and remove from cart button functionality
    Given User navigate to myntra
    And Went for Mens T-shirt collection
    When User select any product
    And User select the size and clik on Add to Cart
    Then User should be able to view that product in Add to cart page
    And Place order button also must be present in add to cart page
    When User click on remove button
    And click remove again from the pop-up
    Then the cart should be empty