package methodsBank;

import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserMethods {

    public static WebDriver driver;

    public static void startChromeService() {

        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public static void getAPIURL(){
        BrowserMethods.driver.get("http://localhost:3000/shows");
    }



}
