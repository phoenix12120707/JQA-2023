package Homework10Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage{
    private WebDriver driver;

    private By BackpackAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By BikeLight = By.cssSelector("#item_0_title_link > div");
    private By BikeLightAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    private By TShirt = By.cssSelector("#item_1_title_link > div");
    private By TShirtAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
    private By Jacket = By.cssSelector("#item_5_title_link > div");
    private By JacketAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
    private By BabySuit = By.cssSelector("#item_2_title_link > div");
    private By BabySuitAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By LongSlave = By.cssSelector("#item_3_title_link > div");
    private By LongSlaveAdd = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }





    public void AddBackpack() {
           driver.findElement(BackpackAdd).click();
           driver.findElement(BikeLightAdd).click();
           driver.findElement(LongSlaveAdd).click();

        }
    }
