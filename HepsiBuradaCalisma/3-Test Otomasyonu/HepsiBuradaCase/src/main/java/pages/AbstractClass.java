package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;


import java.io.*;
import java.util.List;
import java.util.Random;

public  abstract class AbstractClass {


    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver,20);

    Actions actions = new Actions(driver);


    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);
    }

    public void sendKeysFunction2(WebElement sendKeysElement, String randomAlf,String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(randomAlf+value);
    }

    public void selectElementFromDropdown(WebElement dropdown, int element){

        Select slc = new Select(dropdown);

        slc.selectByValue(String.valueOf(element));

    }

    public void selectElementFromDropdown2(WebElement dropdown, String element){

        Select slc = new Select(dropdown);

        slc.selectByVisibleText(element);

    }

    public void clearArea(WebElement clearAreas){
        clearAreas.clear();
    }

    public void PageControl(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(driver.getTitle(),expected);
        System.out.println("Location : " + expected + "\n");

    }

    public void ProductControl(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);

    }


    public void checkElementVisible(WebElement visi) {
        Assert.assertTrue(visi.isDisplayed(), "WebElement Not Visible");
    }

    public String generateRandomWord(int size) {
        Random r = new Random();
        String word = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < size; i++) {
            word += alphabet[r.nextInt(26)];
        }
        return word;
    }

    public void elementHoverOver(WebElement HoverElement){
        wait.until(ExpectedConditions.visibilityOf(HoverElement));
        actions.moveToElement(HoverElement).build().perform();

    }


    public List<WebElement> findProduct() {

        By productTable = By.xpath("//ul[@class='product_list grid row']");
        By products = By.xpath("li/div");
        return (driver.findElement(productTable).findElements(products));

    }

    public void productSelect() throws IOException {
        System.out.println("Ürün sayısı: " + findProduct().size() + "\n");

        Random random = new Random();
        int randomProduct = random.nextInt(findProduct().size());

        // Ürün bilgileri:
        String productText = findProduct().get(randomProduct).getText();

        if(productText.contains("In stock")){
            System.out.println("Random Ürünün stoğu var.");
            System.out.println("Random Ürüne Gidiliyor."+"\n");

            clickFunction(findProduct().get(randomProduct));
            clickFunction(findProduct().get(randomProduct).findElement(By.xpath("div[@class='right-block']//a[@title='Add to cart']")));
        }

        System.out.println("Ürün bilgileri: " + productText + "\n");

        // URUN BİLGİLERİ DOSYAYA YAZMA:

        // ProductName
        WebElement productNameText = findProduct().get(randomProduct).findElement(By.xpath("div[@class='right-block']/h5"));
        System.out.println("Ürün Adı: " + productNameText.getText());
        String productNameNew = productNameText.getText();

        File f = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productName.txt");
        FileWriter fileWriter = new FileWriter(f);
        fileWriter.write(productNameNew);
        fileWriter.close();

        // ProductPrice
        WebElement productPriceText = findProduct().get(randomProduct).findElement(By.xpath("div[@class='left-block']//div[@class='content_price']"));
        System.out.println("Ürün Fiyatı: " + productPriceText.getText() + "\n");
        String productPriceNew = productPriceText.getText();

        File ff = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productPrice.txt");
        FileWriter fileWriters = new FileWriter(ff);
        fileWriters.write(productPriceNew);
        fileWriters.close();


    }


    public void productSelect2() throws IOException {
        System.out.println("Ürün sayısı: " + findProduct().size() + "\n");

        Random random = new Random();
        int randomProduct = random.nextInt(findProduct().size());

        // Ürün2 bilgileri:
        String productText2 = findProduct().get(randomProduct).getText();

        if(productText2.contains("In stock")){
            System.out.println("Random2 Ürünün stoğu var.");
            System.out.println("Random2 Ürüne Gidiliyor."+"\n");

            clickFunction(findProduct().get(randomProduct));
            clickFunction(findProduct().get(randomProduct).findElement(By.xpath("div[@class='right-block']//a[@title='Add to cart']")));
        }

        System.out.println("Ürün2 bilgileri: " + productText2 + "\n");

        // URUN2 BİLGİLERİ DOSYAYA YAZMA:

        // ProductName2
        WebElement productNameText2 = findProduct().get(randomProduct).findElement(By.xpath("div[@class='right-block']/h5"));
        System.out.println("Ürün Adı2: " + productNameText2.getText());
        String productNameNew2 = productNameText2.getText();

        File F = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productName2.txt");
        FileWriter fileWriter = new FileWriter(F);
        fileWriter.write(productNameNew2);
        fileWriter.close();

        // ProductPrice2
        WebElement productPriceText2 = findProduct().get(randomProduct).findElement(By.xpath("div[@class='left-block']//div[@class='content_price']"));
        System.out.println("Ürün Fiyatı2: " + productPriceText2.getText() + "\n");
        String productPriceNew2 = productPriceText2.getText();

        File FF = new File("D:\\Users\\admin\\Desktop\\HepsiBuradaCase\\src\\main\\resources/productPrice2.txt");
        FileWriter fileWriters = new FileWriter(FF);
        fileWriters.write(productPriceNew2);
        fileWriters.close();
    }


}
