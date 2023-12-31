package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    org.openqa.selenium.WebDriver driver;
    By usernameLog = By.xpath("//*[@id=\"user-name\"]");
    By passLog = By.xpath("//*[@id=\"password\"]");
    By LoginBtn = By.xpath("//*[@id=\"login-button\"]");
    By message = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By usernameLogBDD = By.xpath("//*[@id=\"user-name\"]");
    By passLogBDD = By.xpath("//*[@id=\"password\"]");
    private WebElement WebDriver;

    public HomePage(WebDriver driver) { //Constructor
        this.driver = driver;

    }


    public void enterUsername(String uname) {
        driver.findElement(usernameLog).sendKeys("standard_user");

    }
    public void enterUsernameBDD(String LoginUsernameBDD) {
      driver.findElement(usernameLogBDD).sendKeys(LoginUsernameBDD);


    }
    public void enterPasswordBDD(String LoginPasswordBDD) {
        WebElement passwordElement = driver.findElement(passLogBDD);
        passwordElement.sendKeys(LoginPasswordBDD);
    }

    public void enterPassword(String pass) {
        driver.findElement(passLog).sendKeys("secret_sauce");
    }

    public String notSuccessfulLogin() {
        return driver.findElement(message).getText();

    }

    public WebElement loginFormMethod() {

        driver.findElement(LoginBtn).click();
        return WebDriver;
    }
    public WebElement loginFormMethodWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span")));

        return WebDriver;

    }
}
