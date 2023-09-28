package Homework9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SauceDemoTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
//Credentials
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        WebElement productLabel = driver.findElement(By.xpath("//div[@id='']"));
        assertTrue(productLabel.isDisplayed());
    }
    @After
    public void exit() {
        driver.close();
    }
    @Test
    public void testAddToCart() {
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

        WebElement cartItem = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        assertTrue(cartItem.isDisplayed());
    }
    @Test
    public void testAddMultipleProducts() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.name("firstName")).sendKeys("Test");
        driver.findElement(By.name("lastName")).sendKeys("test");
        driver.findElement(By.name("postalCode")).sendKeys("1000");
        driver.findElement(By.name("continue")).click();
        WebElement totalCart = driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label"));
        String totalCartText = totalCart.getText();
        System.out.println(totalCartText);
        assertEquals(totalCartText, "Total: $51.81");
    }
    @Test
    public void testRemoveFromCart() {

        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

        WebElement cartItem = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        assertTrue(cartItem.isDisplayed());
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
    @Test
    public void testInvalidLogin() {
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userName.sendKeys("invalid_user");
        password.sendKeys("invalid_password");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assertTrue(errorMessage.isDisplayed());
        assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage.getText());
    }

}