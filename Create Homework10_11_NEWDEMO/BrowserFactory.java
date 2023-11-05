package ProjectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver getBrowser(String browserName) {


        switch (browserName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\kalch\\IdeaProjects\\JQA\\src\\test\\Resources\\chromedriver.exe");
                return driver = new ChromeDriver();

            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalch\\IdeaProjects\\geckodriver-v0.27.0-win64\\geckodriver.exe");
                return driver = new FirefoxDriver();

            case "Edge":
                System.setProperty("webdriver.edge.driver", "C:\\Users\\kalch\\IdeaProjects\\Edgedriver\\msedgedriver.exe");
                return driver = new EdgeDriver();
            default:
                throw new IllegalArgumentException("Undefined or unsupported browser type" + browserName);
        }


    }

}

