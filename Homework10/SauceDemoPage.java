package Homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {
    private WebDriver driver;

    public SauceDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productsLabel = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By wrongCredentials = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getProductsLabelText() {
        return driver.findElement(productsLabel).getText();
    }


    public String wrongLoginCredentialsText() {
        return driver.findElement(wrongCredentials).getText();
    }
}
