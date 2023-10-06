package Homework10Part1;

import Homework10Part1.DeliveryPage2;
import Homework10Part1.LoginPage;
import Homework10Part1.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {
    @org.junit.Test
    public void verifyLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage LPage = new LoginPage(driver);
        LPage.typeUserName("standard_user");
        LPage.typePass("secret_sauce");
        LPage.clickBtn();
        driver.close();


    }

    @org.junit.Test
    public void addToCart() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage LPage = new LoginPage(driver);
        LPage.typeUserName("standard_user");
        LPage.typePass("secret_sauce");
        LPage.clickBtn();

        ProductsPage PPage = new ProductsPage(driver);
        PPage.AddBackpack();

    }
    @org.junit.Test
    public void checkoutTest (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage LPage = new LoginPage(driver);
        LPage.typeUserName("standard_user");
        LPage.typePass("secret_sauce");
        LPage.clickBtn();

        ProductsPage PPage = new ProductsPage(driver);
        PPage.AddBackpack();

       // DeliveryPage DPage = new DeliveryPage(driver);
        DeliveryPage2 DPage = new DeliveryPage2(driver);
        DPage.navigateToCart();
        DPage.clickCheckoutButton();
        DPage.enterPostFirstName("Test");
        DPage.enterPostLastName("Test");
        DPage.enterPostalCode("1000");
        DPage.clickContinueButton();
        DPage.getTotal();
        DPage.asserts();



    }

}







