package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.createAccountPage;
import utils.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class createAccount_Steps {

    private WebDriver driver;

    createAccountPage createAccountPage = new createAccountPage();

    // CREATE A NEW USER:

    @Given("^Go to the automationpractice\\.com$")
    public void go_to_the_automationpractice_com() throws Throwable  {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        createAccountPage.homePageTitleControl();


    }

    @When("^Create a new user$")
    public void create_a_new_user() throws Throwable  {
        createAccountPage.clickOnSignInButton();
        createAccountPage.createAccountPageTitleControl();
        createAccountPage.typeEmail("randommailaddress@gmail.com");
        createAccountPage.clickOnCreateAccountButton();
        createAccountPage.personalInformationPageTitleControl();
        createAccountPage.clickOnGender();
        createAccountPage.typeFirstAndLastName("Cemal","Atayeter");
        createAccountPage.typePassword("12345");
        createAccountPage.selectDay();
        createAccountPage.selectMonth();
        createAccountPage.selectYear();
        createAccountPage.typeCompany("GarageInc");
        createAccountPage.typeAddress("Yeryüzü");
        createAccountPage.typeAddress2("Gökyüzü");
        createAccountPage.typeCity("ISTANBUL");
        createAccountPage.selectState();
        createAccountPage.typePostCode("45678");
        createAccountPage.selectCountry();
        createAccountPage.typeInformation("TEST DEMO");
        createAccountPage.typeHomePhone("+43-567");
        createAccountPage.typeMobilePhone("-56-987");
        createAccountPage.typeAlias();
        createAccountPage.typeAliasSend("Accommodation Address");
        createAccountPage.clickOnregisterButton();
    }

    @Then("^Check user on homepage$")
    public void check_user_on_homepage() throws Throwable  {
        createAccountPage.myAccountPageTitleControl();
        createAccountPage.controlUser();

    }


    // CATEGORY AND PRODUCT SELECT:

    @Given("^First dress category then summer dress category is selected$")
    public void first_dress_category_then_summer_dress_category_is_selected() throws Throwable  {
        createAccountPage.dressHover();
        createAccountPage.clickOnSummerButton();
    }

    @When("^A product is selected and added to the basket$")
    public void a_product_is_selected_and_added_to_the_basket() throws IOException {
        createAccountPage.summerDressesPageTitleControl();
        createAccountPage.controlProduct();
        createAccountPage.clickOnContinueButton();

    }

    @Then("^Summer is entered in the search field and one of the results is added to the basket$")
    public void summer_is_entered_in_the_search_field_and_one_of_the_results_is_added_to_the_basket() throws IOException {
        createAccountPage.typeSearchBox("Summer");
        createAccountPage.summerDressesPageTitleControl2();
        createAccountPage.controlProduct2();
        createAccountPage.clickOnContinueButton();
    }


    // BASKET CHECK:

    @Given("^Go to the basket$")
    public void go_to_the_basket() throws Throwable {
        createAccountPage.myBasketHover();
        createAccountPage.basketTitleControl();

    }

    @When("^Added product details are checked$")
    public void added_product_details_are_checked() throws IOException {
        createAccountPage.productQuantityControl();

    }

    @Then("^Proceed to checkout$")
    public void proceed_to_checkout() throws Throwable {
        createAccountPage.clickOnProceedButton();

    }

    // ADDRESS AND CARGO

    @Given("^Continue with the registered address$")
    public void continue_with_the_registered_address() throws Throwable {
        createAccountPage.addressPageTitleControl();
        createAccountPage.clickOnAddressButton();

    }

    @When("^Continue with the recommended cargo$")
    public void continue_with_the_recommended_cargo() throws Throwable {
        createAccountPage.cargoPageTitleControl();
        createAccountPage.clickOnCargoButton();

    }

    // CHECKOUT and ORDER CONTROL
    @Given("^One of the payment methods selected$")
    public void one_of_the_payment_methods_selected() throws Throwable {
        createAccountPage.paymentPageTitleControl();
        createAccountPage.selectPayByCheck();

    }

    @When("^The order is confirmed$")
    public void the_order_is_confirmed() throws Throwable {
        createAccountPage.confirmPageTitleControl();
        createAccountPage.clickConfirmOrder();

    }

    @Then("^Go to the user menu and check the order$")
    public void go_to_the_user_menu_and_check_the_order() throws Throwable {
        createAccountPage.lastPaymentPageTitleControl();
        createAccountPage.clickMyAccount();
        createAccountPage.orderHistoryPageTitleControl();
        createAccountPage.clickOrderAndHistory();
        createAccountPage.lastOrderPageTitleControl();
        createAccountPage.controlOrder();
        createAccountPage.closeDrivers();

    }

}
