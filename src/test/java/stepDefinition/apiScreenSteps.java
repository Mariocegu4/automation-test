package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webElements.ScreenInterface;
import webElements.apiElements;

import static methodsBank.BrowserMethods.driver;


public class apiScreenSteps {

    private ScreenInterface api = new apiElements();
//    private WebDriverWait wait = new WebDriverWait(driver, 15);


    //div[@class='row'][2]//a


    @Given("^A user enters the API$")
    public void startApp() throws Throwable {
        //        startdriver();

        //    This snippet could also be used to initialize documentation (PDF w/ Scenario name)
        //    to add screenshots
    }


    @When("^The user is presented to the login screen$")
    public void userLoginIn() throws Throwable{
        WebElement ele;

//        ele = wait.until(ExpectedConditions.
//                presenceOfElementLocated(api.getEleLocator("Login Header")));
//        String title =ele.getText();
//
//        Assert.assertEquals(title, "LoginTest");


    }




}
