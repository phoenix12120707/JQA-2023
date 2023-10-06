package Homework10Part1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

public class DeliveryPage2  {
    private WebDriver driver;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement postFirstName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement postLastName;

    @FindBy(how = How.NAME, using = "postalCode")
    private WebElement postalCode;

    @FindBy(how = How.NAME, using = "continue")
    private WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//div[@id='']")
    private WebElement totalCart;

    @FindBy(how = How.CSS, using = "#shopping_cart_container > a")
    private WebElement cart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"checkout\"]")
    private WebElement checkout;

    public DeliveryPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToCart() {
        cart.click();
    }

    public void enterPostFirstName(String firstName) {
        postFirstName.sendKeys(firstName);
    }

    public void enterPostLastName(String lastName) {
        postLastName.sendKeys(lastName);
    }

    public void enterPostalCode(String code) {
        postalCode.sendKeys(code);
    }

    public void clickContinueButton() {
        continueBtn.click();
    }

    public void clickCheckoutButton() {
        checkout.click();
    }

    public String getTotal() {
        return totalCart.getText();


    }

    public void asserts (){
        System.out.println(totalCart);
       //assertEquals("$51.81",totalCart.getText());
    }
}
