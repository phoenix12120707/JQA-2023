package StepDefinitions;


import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.SendingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps{
public WebDriver driver;
public HomePage hp;
public CartPage cp;
public SendingPage sp;


    @Given("user Launch Chrome browser and adding some products")
    public void userLaunchChromeBrowserAndAddingSomeProducts() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        hp = new HomePage(driver);
        cp = new CartPage(driver);
        sp = new SendingPage(driver);

    }

    @When("user opens URL {string}")
     public void userOpensURL(String URL) {
       driver.get(URL);

    }




    @When("user click on Login")
    public void userClickOnLogin() {
       hp.loginFormMethod();
    }

    @Then("products are displayed")
    public void productsAreDisplayed() {
        cp.productAssert();

    }

    @Then("user add BikeLight, backpack, baby-body")
    public void userAddBikeLightBackpackBabyBody() {
    cp.addBabyBody();
    cp.addBackpack();
    cp.addBikeLight();
    }

    @Then("user check count in the cart")
    public void userCheckCountInTheCart() {
    cp.checkCart();
    }

    @Then("press cart button")
    public void pressCartButton() {
        cp.cartBtn();
        cp.checkout();

    }


    @Then("user enters their name, address, and postal code")
    public void userEntersTheirNameAddressAndPostalCode() {
        sp.firstNameSend();
        sp.lastNameSend();
        sp.postalCodeSend();
    }

    @Then("user click on continue button")
    public void userClickOnContinueButton() {
sp.pressContinueBtn();
    }

    @Then("check count of the sum")
    public void checkCountOfTheSum() {
        sp.totalSumCheck();

    }

    @Then("user click finish")
    public void userClickFinish() {
        sp.finishBtnClick();

    }

    @Then("user should be redirected to page complete order")
    public void userShouldBeRedirectedToPageCompleteOrder() {
        sp.completeOrderFinal();
        driver.quit();

    }


    @And("user enters username and Password")
    public void userEntersUsernameAndPassword() {
        hp.enterUsername("standart_user");
         hp.enterPassword("standard_pass");
    }
}

