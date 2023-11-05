package ProjectDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests extends BeforeAfter {

    HomePage homePage;
    Cart cart;
    SendingPage sendingPage;

    @Test
    public void loginTest() {
        homePage = new HomePage(driver);
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.loginFormMethod();
        homePage.loginFormMethodWait();
        cart = new Cart(driver);
        cart.productAssert();


    }

    @Test
    public void wrongCredentials() {
        homePage = new HomePage(driver);
        homePage.enterUsername("test");
        homePage.enterPassword("test");
        homePage.loginFormMethod();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", homePage.notSuccessfulLogin());
    }

    @Test
    public void addToCartTest() {
        homePage = new HomePage(driver);
        cart = new Cart(driver);
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.loginFormMethod();
        cart.addBackpack();
        cart.addBabyBody();
        cart.addBikeLight();
        cart.checkCart();
    }

    @Test
    public void checkoutTest() {
        homePage = new HomePage(driver);
        cart = new Cart(driver);
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.loginFormMethod();
        cart.addBackpack();
        cart.addBabyBody();
        cart.addBikeLight();
        cart.cartBtn();
        cart.checkout();

    }

    @Test
    public void SendTest() {
        homePage = new HomePage(driver);
        cart = new Cart(driver);
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.loginFormMethod();
        cart.addBackpack();
        cart.addBabyBody();
        cart.addBikeLight();
        cart.cartBtn();
        cart.checkout();
        sendingPage = new SendingPage(driver);
        sendingPage.firstNameSend();
        sendingPage.lastNameSend();
        sendingPage.postalCodeSend();
        sendingPage.pressContinueBtn();
        Assert.assertEquals("Total: $51.81", sendingPage.totalSumCheck());
        System.out.println(sendingPage.totalSum);
        sendingPage.finishBtnClick();
        sendingPage.completeOrderText();
        System.out.println(sendingPage.completeOrder);

    }
}