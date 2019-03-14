package cucumberOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static WebDriver openBrowser(){
        if (driver==null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.shopback.sg/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
    @After
    public static void teardown() {
        if (driver != null) {
            openBrowser().quit();
        }
    }
}
