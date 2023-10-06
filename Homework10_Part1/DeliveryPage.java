package Homework10Part1;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;

public class DeliveryPage {
    private WebDriver driver;

    private By PostFirstName = By.name("firstName");
    private By PostLastName = By.name("lastName");
    private By PostalCode = By.name("postalCode");
    private By ContinueBtn = By.name("continue");
    private By totalCart = By.xpath("//div[@id='']");

    private By cart = By.cssSelector("#shopping_cart_container > a");
    private By checkout = By.xpath("//*[@id=\"checkout\"]");

    public DeliveryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void cart() {
        driver.findElement(cart).click();

    }
    public void PostFirstName() {
        driver.findElement(PostFirstName).sendKeys("Test");

    }
    public void PostLastName() {
        driver.findElement(PostLastName).sendKeys("Test");

    }
    public void PostalCode() {
        driver.findElement(PostalCode).sendKeys("1000");

    }
    public void ContinueBtn() {
        driver.findElement(ContinueBtn).click();

    }
    public void checkout() {
        driver.findElement(checkout).click();

    }
    public void getTotal(){






    }
}