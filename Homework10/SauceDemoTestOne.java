package Homework10;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SauceDemoTestOne {
    private WebDriver driver;
    private SauceDemoPage saucedemoPage;
    private SauceProductPage SauceProduct;

    @Before
    public void setUp() {
        driver = BrowserFactory.getBrowser("chrome");
        saucedemoPage = new SauceDemoPage(driver);
        SauceProduct = new SauceProductPage(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://www.saucedemo.com/");
        saucedemoPage.login("standard_user", "secret_sauce");
        String productsLabelText = saucedemoPage.getProductsLabelText();
        Assert.assertEquals("Products", productsLabelText);
        System.out.println("Успешно се логнахте в магазина");

    }
    @Test
    public void wrongCredentialsLogin(){
        driver.get("https://www.saucedemo.com/");
        saucedemoPage.login("wrong", "secret_sauce");
        saucedemoPage.wrongLoginCredentialsText();
        assertEquals("Epic sadface: Username and password do not match any user in this service", saucedemoPage.wrongLoginCredentialsText());

    }
    @Test
    public void addToCart(){
        driver.get("https://www.saucedemo.com/");
        saucedemoPage.login("standard_user", "secret_sauce");
        SauceProduct.addToCart2();
        int cartItemCount = SauceProduct.getCartItemCount();
        Assert.assertEquals(3, cartItemCount);
        System.out.println("В количката Ви има " + cartItemCount + "продукта");
    }

    @After
    public void tearDown() {
        BrowserFactory.closeBrowser(driver);
    }


}
