package Homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class SauceProductPage {
    private WebDriver driver;

    public SauceProductPage(WebDriver driver) {
        this.driver = driver;
    }
    By BackpackAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By BikeLightAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    By BabyAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
    By Cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void addToCart2(){
        driver.findElement(BackpackAdd).click();
        driver.findElement(BikeLightAdd).click();
        driver.findElement(BabyAdd).click();
        driver.findElement(Cart).click();

    }
    public int getCartItemCount(){

        WebElement cartBadge = driver.findElement(Cart);
        if (cartBadge.isDisplayed()) {
            return Integer.parseInt(cartBadge.getText());
        } else {
            return 0; // Връщаме 0, ако броячът на количката не е видим
        }
    }

    }




