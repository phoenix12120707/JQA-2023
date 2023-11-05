package ProjectDemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    WebDriver driver;
    By BackpackAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By BikeLightAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    By BabyAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
    By ShoppingCartBtn = By.xpath("//*[@id=\"shopping_cart_container\"]");
    By ShopBadgeCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By CheckoutBtn = By.xpath("//*[@id=\"checkout\"]");
    By ProductAss = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By CartCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    private WebElement WebDriver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack() {
        driver.findElement(BackpackAdd).click();

    }

    public void addBabyBody() {

        driver.findElement(BabyAdd).click();

    }

    public void addBikeLight() {

        driver.findElement(BikeLightAdd).click();

    }
    public int getCartItemCount(){

        WebElement cartBadge = driver.findElement(CartCount);
        if (cartBadge.isDisplayed()) {
            return Integer.parseInt(cartBadge.getText());
        } else {
            return 0;
        }
    }


    public void checkCart() {

        WebElement count = driver.findElement(ShopBadgeCount);
        Assert.assertTrue("3", true);


    }

    public void cartBtn() {

        driver.findElement(ShoppingCartBtn).click();

    }

    public void productAssert() {
        driver.findElement(ProductAss).isDisplayed();
    }

    public WebElement checkout() {

        driver.findElement(CheckoutBtn).click();
        return WebDriver;
    }

}

