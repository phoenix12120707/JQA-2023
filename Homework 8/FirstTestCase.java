package SeleniumDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //Login
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Add Product in the cart
        driver.findElement(By.cssSelector("a[id='item_2_title_link'] div[class='inventory_item_name']")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        //Close
        driver.close();


    }
}



