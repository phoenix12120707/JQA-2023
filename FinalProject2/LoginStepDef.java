package StepDefinitions;

import PageObjects.CartPage;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDef {
    public WebDriver driver;
    public HomePage hp;
    public CartPage cp;
    private org.openqa.selenium.WebDriver WebDriver;

    @Given("user Launch Chrome browser")
    public void userLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        cp = new CartPage(driver);
        hp = new HomePage(driver);
        this.WebDriver = driver;
    
    }
    @When("user opens URL {string} for test")
    public void userOpensURL(String URL) {
        driver.get(URL);

    }

    @And("^enters (.*) and (.*)$")
    public void entersLoginUsernameBDDAndLoginPasswordBDD(String LoginUsernameBDD, String LoginPasswordBDD) {
        hp.enterUsernameBDD(LoginUsernameBDD);
        hp.enterPasswordBDD(LoginPasswordBDD);


    }

    @Then("a message indicating a wrong login should be displayed")
    public void aMessageIndicatingAWrongLoginShouldBeDisplayed() {
        hp.notSuccessfulLogin();
    }


    @And("user click on LoginButton")
    public void userClickOnLoginButton() {
        hp.loginFormMethod();


    }

    @Then("all products are displayed")
    public void allProductsAreDisplayed() {
        cp.productAssert();
        driver.quit();
    }
}