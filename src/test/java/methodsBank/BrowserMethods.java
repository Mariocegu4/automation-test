package methodsBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BrowserMethods {

    public static boolean chromeServiceRunningFlag = false;
    public static ChromeDriverService chromeDriverService;
    public static WebDriver driver;

    public static void initializeBrowserDriver(){

        if (!chromeServiceRunningFlag){
            startChromeService();
        }
//        initializeChromeDriver();
    }

    public static void startChromeService() {

        System.setProperty("webdriver.chrome.driver",
                "src/test/ChromeDriver/chromedriver.exe");
    }


}
