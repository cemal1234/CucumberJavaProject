package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.io.*;


public class createAccountPage extends AbstractClass{

    private WebDriver driver;

    public createAccountPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    public void homePageTitleControl(){
        PageControl(signInButton,"My Store");

    }

    @FindBy(css = "a.login")
    private WebElement signInButton;

    public void clickOnSignInButton(){

        clickFunction(signInButton);
    }

    public void createAccountPageTitleControl(){
        PageControl(emailTextBox,"Login - My Store");

    }

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    public void typeEmail(String email){

        sendKeysFunction2(emailTextBox,generateRandomWord(3),email);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement createAccount;

    public void clickOnCreateAccountButton(){

        clickFunction(createAccount);
    }

    public void personalInformationPageTitleControl(){
        PageControl(gender,"Login - My Store");

    }

    @FindBy(id = "id_gender1")
    private WebElement gender;

    public void clickOnGender(){
        clickFunction(gender);
    }

    @FindBy(id = "customer_firstname")
    private WebElement firstname;
    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    public void typeFirstAndLastName(String firstNameText, String lastNameText){

        sendKeysFunction(firstname,firstNameText);
        sendKeysFunction(lastname,lastNameText);
    }

    @FindBy(name = "passwd")
    private WebElement password;

    public void typePassword(String password1){

        sendKeysFunction(password,password1);
    }

    @FindBy(name = "days")
    private WebElement daySelect;
    @FindBy(name = "months")
    private WebElement monthsSelect;
    @FindBy(name = "years")
    private WebElement yearsSelect;

    public void selectDay(){

        selectElementFromDropdown(daySelect,3);
    }
    public void selectMonth(){

        selectElementFromDropdown(monthsSelect,1);
    }
    public void selectYear(){

        selectElementFromDropdown(yearsSelect,1987);
    }

    @FindBy(id = "company")
    private WebElement company;

    public void typeCompany(String company1){

        sendKeysFunction(company,company1);
    }

    @FindBy(name = "address1")
    private WebElement address1;

    public void typeAddress(String address){

        sendKeysFunction(address1,address);
    }

    @FindBy(name = "address2")
    private WebElement address2;

    public void typeAddress2(String address){

        sendKeysFunction(address2,address);
    }

    @FindBy(name = "city")
    private WebElement city;

    public void typeCity(String city1){

        sendKeysFunction(city,city1);
    }

    @FindBy(id = "id_state")
    private WebElement state;

    public void selectState(){

        selectElementFromDropdown2(state,"Florida");
    }

    @FindBy(id = "postcode")
    private WebElement postcode;

    public void typePostCode(String postcode1){

        sendKeysFunction(postcode,postcode1);
    }

    @FindBy(id = "id_country")
    private WebElement country;

    public void selectCountry(){

        selectElementFromDropdown2(country,"United States");
    }

    @FindBy(id = "other")
    private WebElement information;

    public void typeInformation(String information1){

        sendKeysFunction(information,information1);
    }

    @FindBy(name = "phone")
    private WebElement homePhone;

    public void typeHomePhone(String homePhone1){

        sendKeysFunction(homePhone,homePhone1);
    }

    @FindBy(name = "phone_mobile")
    private WebElement mobilePhone;

    public void typeMobilePhone(String mobilePhone1){

        sendKeysFunction(mobilePhone,mobilePhone1);
    }

    @FindBy(name = "alias")
    private WebElement alias;

    public void typeAlias(){

        clearArea(alias);
    }

    public void typeAliasSend(String alias1){

        sendKeysFunction(alias,alias1);
    }

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public void clickOnregisterButton(){

        clickFunction(registerButton);
    }

    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement userCheck;

    public void myAccountPageTitleControl(){
        PageControl(userCheck,"My account - My Store");

    }

    public void controlUser(){

        checkElementVisible(userCheck);
        System.out.println("Kayıtlı Kullanıcı Bilgileri: " + "***" + userCheck.getText() + "***" + "\n");
    }

    // CATEGORY AND PRODUCT SELECT:


    @FindBy(xpath = "(//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows'])/li[2]")
    private WebElement dressesHover;

    public void dressHover(){
        elementHoverOver(dressesHover);
    }

    @FindBy(xpath = "(//ul[@class='submenu-container clearfix first-in-line-xs'])[2]/li[3]")
    private WebElement summerDresses;

    public void clickOnSummerButton(){

        clickFunction(summerDresses);
    }

    @FindBy(id = "uniform-selectProductSort")
    private WebElement summerDressesSortBy;

    public void summerDressesPageTitleControl(){
        PageControl(summerDressesSortBy,"Summer Dresses - My Store");

    }

    public void controlProduct() throws IOException {
        productSelect();

    }

    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElement continueShop;

    public void clickOnContinueButton(){

        clickFunction(continueShop);
    }

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(name = "submit_search")
    private WebElement submitSearch;

    public void typeSearchBox(String searchBox1){

        sendKeysFunction(searchBox,searchBox1);
        clickFunction(submitSearch);
    }

    public void summerDressesPageTitleControl2(){
        PageControl(summerDressesSortBy,"Search - My Store");

    }

    public void controlProduct2() throws IOException {
        productSelect2();

    }

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement basketHover;

    @FindBy(xpath = "//a[@title='Check out']")
    private WebElement checkOut;

    public void myBasketHover(){
        elementHoverOver(basketHover);
        clickFunction(checkOut);
    }

    @FindBy(id="cart_title")
    private WebElement basketArea;

    public void basketTitleControl(){
        PageControl(basketArea,"Order - My Store");

    }

    @FindBy(id="summary_products_quantity")
    private WebElement productQuantity;

    @FindBy(xpath = "(//td[@class='cart_description']/p[@class='product-name'])[1]")
    private WebElement cartFirstProduct;

    @FindBy(xpath = "//td[@class='cart_unit']//span[@class='price special-price']")
    private WebElement cartFirstProductPrice;

    @FindBy(xpath = "(//td[@class='cart_unit']//span[@class='price'])[1]")
    private WebElement cartFirstProductPrice2;

    public void productQuantityControl() throws IOException {
        //productQuantity

        ProductControl(productQuantity,"2 Products");
        System.out.println("Beklenen ile Gerçekleşen Ürün Adetleri Doğru : " + "2 Products" + "\n");

        //cartFirstProduct

        // proje çalıştırılmadan önce kendi yolunuzu vermeniz gerekir.

        File file = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productName.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        Assert.assertEquals(cartFirstProduct.getText(),line);
        System.out.println("1. Ürün İsimleri Eşleşiyor : " + cartFirstProduct.getText() + "***" + line + "\n");

        //cartFirstProductPrice

        // proje çalıştırılmadan önce kendi yolunuzu vermeniz gerekir.
        
        File filee = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productPrice.txt");
        BufferedReader readerr = null;
        readerr = new BufferedReader(new FileReader(filee));
        String linee = readerr.readLine();
        String [] firstPrice = linee.split(" "); // boşluk olana kadar ilk fiyatı alıyoruz.

        String cartFirstProductPriceText = cartFirstProductPrice.getText();
        String cartFirstProductPrice2Text = cartFirstProductPrice2.getText();

        if(cartFirstProductPriceText.equals(firstPrice[0])){
            System.out.println("1. Ürün Fiyatları Eşleşiyor : " + cartFirstProductPriceText + "***" + firstPrice[0] + "\n");
        }
        if (cartFirstProductPrice2Text.equals(firstPrice[0])){
            System.out.println("1. Ürün Fiyatları Eşleşiyor : " + cartFirstProductPrice2Text + "***" + firstPrice[0] + "\n");
        }
        else {
            System.out.println("Ürün fiyat kontrolü başarısız...");
        }

    }

    @FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
    private WebElement proceedButton;

    public void clickOnProceedButton(){

        clickFunction(proceedButton);
    }


    public void addressPageTitleControl(){
        PageControl(proceedAddressButton,"Order - My Store");

    }

    @FindBy(name="processAddress")
    private WebElement proceedAddressButton;

    public void clickOnAddressButton(){

        clickFunction(proceedAddressButton);
    }

    @FindBy(xpath="//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]")
    private WebElement termsOfService;

    @FindBy(name="processCarrier")
    private WebElement proceedCargoButton;

    public void cargoPageTitleControl(){
        PageControl(termsOfService,"Order - My Store");

    }

    public void clickOnCargoButton(){

        clickFunction(termsOfService);
        clickFunction(proceedCargoButton);
    }

    @FindBy(xpath="//a[@title='Pay by check.']")
    private WebElement payByCheck;

    public void paymentPageTitleControl(){
        PageControl(payByCheck,"Order - My Store");

    }

    public void selectPayByCheck(){

        clickFunction(payByCheck);
    }

    @FindBy(xpath="//span[contains(text(),'I confirm my order')]")
    private WebElement confirmOrder;

    public void confirmPageTitleControl(){
        PageControl(confirmOrder,"My Store");

    }

    public void clickConfirmOrder(){

        clickFunction(confirmOrder);
    }

    public void lastPaymentPageTitleControl(){
        PageControl(userCheck,"Order confirmation - My Store");

    }

    public void clickMyAccount(){
        clickFunction(userCheck);
    }

    @FindBy(xpath="//a[@title='Orders']")
    private WebElement orderAndHistory;

    public void orderHistoryPageTitleControl(){
        PageControl(orderAndHistory,"My account - My Store");

    }

    public void clickOrderAndHistory(){
        clickFunction(orderAndHistory);
    }

    @FindBy(xpath="(//span[contains(text(),'On backorder')])[1]")
    private WebElement backOrder;

    @FindBy(xpath="//tr[@class='first_item ']")
    private WebElement orderDetails;

    public void lastOrderPageTitleControl(){
        PageControl(backOrder,"Order history - My Store");

    }

    public void controlOrder(){

        checkElementVisible(backOrder);
        System.out.println("Siparişin Durumu : " + "***" + orderDetails.getText() + "***" + "\n");

    }

    public void closeDrivers(){
        Driver.quitDriver();
    }
}
