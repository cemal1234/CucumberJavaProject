Feature: Create Account

  Scenario: Access to the page and create a new member registration

    Given Go to the automationpractice.com
    When Create a new user
    Then Check user on homepage

  Scenario: Go to the summer dresses category and choose a product

    Given First dress category then summer dress category is selected
    When A product is selected and added to the basket
    Then Summer is entered in the search field and one of the results is added to the basket

  Scenario: Go to cart and verify products

    Given Go to the basket
    When Added product details are checked
    Then Proceed to checkout

  Scenario: Address and Cargo selection

    Given Continue with the registered address
    When Continue with the recommended cargo

  Scenario: Checkout and Order Control

    Given One of the payment methods selected
    When The order is confirmed
    Then Go to the user menu and check the order