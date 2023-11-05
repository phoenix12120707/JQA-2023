package ProjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BeforeAfter {
    WebDriver driver;
    By usernameLog = By.xpath("//*[@id=\"user-name\"]");
    By passLog = By.xpath("//*[@id=\"password\"]");
    By LoginBtn = By.xpath("//*[@id=\"login-button\"]");
    By message = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    private WebElement WebDriver;

    public HomePage(WebDriver driver) { //Constructor
        this.driver = driver;
    }


    public void enterUsername(String uname) {
        driver.findElement(usernameLog).sendKeys(uname);

    }

    public void enterPassword(String pass) {
        driver.findElement(passLog).sendKeys(pass);
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
        System.out.println("Vsicko e tochno");
        return WebDriver;

    }


}