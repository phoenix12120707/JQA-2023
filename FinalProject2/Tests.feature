Feature: Tests

  @Smoke
  Scenario: Successful Login and Purchase
    Given user Launch Chrome browser and adding some products
    When user opens URL "https://www.saucedemo.com/"
    And user enters username and Password
    And user click on Login
    Then products are displayed
    And user add BikeLight, backpack, baby-body
    Then user check count in the cart
    Then press cart button
    And user enters their name, address, and postal code
    Then user click on continue button
    Then check count of the sum
    And user click finish
    And user should be redirected to page complete order
