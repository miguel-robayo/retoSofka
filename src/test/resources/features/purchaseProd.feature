Feature: Purchase products

  @purchaseProducts
  Scenario: Add two products successfully
    Given Miguel is logged in the platform with the following credentials
      |standard_user|
      |secret_sauce |
    And he is on the products page
    When he adds the following products to the cart
      |Sauce Labs Backpack  |
      |Sauce Labs Bike Light|
    And he places the order with the folloing information
      |firstName |Miguel|
      |lastName  |Robay |
      |postalCode|110111|
    Then he see the success message after purchasing the products
