Feature: To add the product to cart in a OurShoppe shopping website

  Scenario Outline: To verify the user can login to shopping website
    Given user has to open the url of the web page
    When user enters "<username>" and "<password>"
    Then click login button

    Examples: 
      | username             | password |
      | renuviji13@gmail.com | Renu@123 |

  Scenario: To verify the user can search the product in search page
    Given user has to login to the web page
    When user has to search for "Iphone 11"
    Then click enter to search the desired product

  Scenario: To verify the product is added to cart
    Given user has to select and click the desired product
    When user has to click on add to cart
    And user has to complete the purchase
    And user has to enter the address details Select Emirate Select Area,Street Address
    Then place the order
