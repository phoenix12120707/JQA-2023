package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendingPage {

    WebDriver driver;
    By firstName = By.xpath("//*[@id=\"first-name\"]");
    By lastName = By.xpath("//*[@id=\"last-name\"]");
    By postalCode = By.xpath("//*[@id=\"postal-code\"]");
    By continueBtn = By.xpath("//*[@id=\"continue\"]");
    By totalSum = By.cssSelector("#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label");
    By finishBtn = By.xpath("//*[@id=\"finish\"]");
    By completeOrder = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public SendingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstNameSend() {
        driver.findElement(firstName).sendKeys("Toshko");

    }
    public void lastNameSend() {

        driver.findElement(lastName).sendKeys("Afrikanski");

    }
    public void postalCodeSend() {

        driver.findElement(postalCode).sendKeys("1000");

    }
    public void pressContinueBtn() {
        driver.findElement(continueBtn).click();

    }
    public void finishBtnClick() {
        driver.findElement(finishBtn).click();

    }

    public void completeOrderText(){
        driver.findElement(completeOrder).isDisplayed();

    }
    public String totalSumCheck(){

        return driver.findElement(totalSum).getText();

    }

    public String completeOrderFinal(){
        driver.findElement(completeOrder).getText();


        return null;
    }
}
