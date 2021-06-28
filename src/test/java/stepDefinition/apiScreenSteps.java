package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import methodsBank.BrowserMethods;
import methodsBank.manyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import webElements.ScreenInterface;
import webElements.apiElements;



import static methodsBank.BrowserMethods.driver;


public class apiScreenSteps {

    private ScreenInterface api = new apiElements();


    //div[@class='row'][2]//a

    @Before
    public void setupTest(){
        BrowserMethods.startChromeService();
    }

//    @AfterMethod
//    public void quitBrowser() throws Exception {
//        driver.quit();
//    }
//
    @Given("^A user enters the API$")
    public void enterApp() throws Throwable {
        System.out.println("Entering API. . .");
        BrowserMethods.getAPIURL();
        try{
            String apiTitle = driver.getTitle();
            Assert.assertEquals(apiTitle, "Guitar Inventory");
        }catch (Exception e){
            System.out.println("Please check if 'npm dev run' was excecuted.");
            Assert.fail();

        }
        //    This snippet could also be used to initialize documentation (PDF w/ Scenario name)
        //    to add screenshots
    }


    @When("^The user is presented to the login screen$")
    public void userLoginIn() throws Throwable{

        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(api.getEleLocator("Login Header")));
        String title =ele.getText();
//
//        Assert.assertEquals(title, "LoginTest");


    }

    @And("^User click on the \"(.*)\" card URL of movie search$")
    public void clickOnSpecURL(String movie) throws Throwable {
        System.out.println("User goes to movie card number "+movie);

        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);

        //title of movie
//div[@class='row'][2]//a//..//..//span[@class ='card-title']
        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(
                        By.xpath("//div[@class='row']["+movie+"]//a//..//..//span[@class ='card-title']")));
        manyMethods.highlightElement(driver, ele, true);
        Thread.sleep (1000);
        manyMethods.deactivateHiglightElement(driver, ele);

        //URL
        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(
                                By.xpath("//div[@class='row']["+movie+"]//a")));
        manyMethods.highlightElement(driver, ele, false);
        System.out.println("User clicks on movie URL");
        ele.click();
    }






}
