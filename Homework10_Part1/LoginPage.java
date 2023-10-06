package Homework10Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserName = By.id("user-name");
    private By Password = By.id("password");
    private By LoginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName(String username) {
        driver.findElement(UserName).sendKeys(username);
    }

    public void typePass(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    public void clickBtn() {
        driver.findElement(LoginButton).click();
    }
}
