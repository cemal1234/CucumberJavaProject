$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create Account",
  "description": "",
  "id": "create-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Access to the page and create a new member registration",
  "description": "",
  "id": "create-account;access-to-the-page-and-create-a-new-member-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Go to the automationpractice.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Create a new user",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Check user on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "createAccount_Steps.go_to_the_automationpractice_com()"
});
formatter.result({
  "duration": 9956566200,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.create_a_new_user()"
});
formatter.result({
  "duration": 8189535200,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.check_user_on_homepage()"
});
formatter.result({
  "duration": 81418900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Go to the summer dresses category and choose a product",
  "description": "",
  "id": "create-account;go-to-the-summer-dresses-category-and-choose-a-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "First dress category then summer dress category is selected",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "A product is selected and added to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Summer is entered in the search field and one of the results is added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "createAccount_Steps.first_dress_category_then_summer_dress_category_is_selected()"
});
formatter.result({
  "duration": 2741746500,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.a_product_is_selected_and_added_to_the_basket()"
});
formatter.result({
  "duration": 1052474300,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.summer_is_entered_in_the_search_field_and_one_of_the_results_is_added_to_the_basket()"
});
formatter.result({
  "duration": 2429690600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Go to cart and verify products",
  "description": "",
  "id": "create-account;go-to-cart-and-verify-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Go to the basket",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Added product details are checked",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "createAccount_Steps.go_to_the_basket()"
});
formatter.result({
  "duration": 2959342400,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.added_product_details_are_checked()"
});
formatter.result({
  "duration": 120985200,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.proceed_to_checkout()"
});
formatter.result({
  "duration": 1823783600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Address and Cargo selection",
  "description": "",
  "id": "create-account;address-and-cargo-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Continue with the registered address",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Continue with the recommended cargo",
  "keyword": "When "
});
formatter.match({
  "location": "createAccount_Steps.continue_with_the_registered_address()"
});
formatter.result({
  "duration": 2294955300,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.continue_with_the_recommended_cargo()"
});
formatter.result({
  "duration": 1542789700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Checkout and Order Control",
  "description": "",
  "id": "create-account;checkout-and-order-control",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "One of the payment methods selected",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "The order is confirmed",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Go to the user menu and check the order",
  "keyword": "Then "
});
formatter.match({
  "location": "createAccount_Steps.one_of_the_payment_methods_selected()"
});
formatter.result({
  "duration": 1433639600,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.the_order_is_confirmed()"
});
formatter.result({
  "duration": 1709135500,
  "status": "passed"
});
formatter.match({
  "location": "createAccount_Steps.go_to_the_user_menu_and_check_the_order()"
});
formatter.result({
  "duration": 3780175000,
  "status": "passed"
});
});