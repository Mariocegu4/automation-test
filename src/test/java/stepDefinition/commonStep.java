package stepDefinition;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import methodsBank.manyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import webElements.ScreenInterface;
import webElements.apiElements;

import static methodsBank.BrowserMethods.driver;

public class commonStep {


    private ScreenInterface api = new apiElements();



    // ADDED SLEEPS FOR TEST APRECIATION Thread.sleep (1000) = 1 sec

    @When("^A user enters \"(.*)\" in the \"(.*)\" textBox$")
    public void enterInTextBox(String text, String field) throws Throwable {
        System.out.println("User enters: "+text+" in "+field+" field.");

        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(api.getEleLocator(field + " input")));
        manyMethods.highlightElement(driver, ele, false);
        ele.sendKeys(text);
        Thread.sleep (1000);

        manyMethods.deactivateHiglightElement(driver, ele);
    }



    @And("^User clicks \"(.*)\" button$")
    public void clickOnButton(String button) throws Throwable {
        System.out.println("User clicks on "+button+" button.");

        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(api.getEleLocator(button+" button")));
        manyMethods.highlightElement(driver, ele, true);

        Thread.sleep (500);
        manyMethods.deactivateHiglightElement(driver, ele);
        ele.click();
    }


    @And("^Navigate back$")
    public void navBack() throws Throwable {
        System.out.println("Navigate Back . . .");
        driver.navigate().back();
    }

    //Working
    @And("^Change css background color to \"(.*)\" to card title \"(.*)\"$")
    public void changeBGColor(String color, String movie) throws Throwable {
        System.out.println("-----WORKING-----");
        System.out.println("Element changes BG color");

        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        String xpath = "//div[contains(@class, 'card light-blue darken-1') and contains(.//span, '"+movie+"')]";

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated
                (By.xpath(xpath)));
        manyMethods.highlightElement(driver, ele, true);


        manyMethods.changeBGColor(driver,ele, color);
        System.out.println(ele.getCssValue("background-color"));

        Thread.sleep (500);
        manyMethods.deactivateHiglightElement(driver, ele);
        System.out.println("-----WORKING-----");
    }


    @And("^Input for \"(.*)\" textbox is empty$")
    public void textBoxEmpty(String textbox) throws Throwable {


        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 5);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(api.getEleLocator(textbox+" input")));
        manyMethods.highlightElement(driver, ele, true);

        Thread.sleep (500);
        manyMethods.deactivateHiglightElement(driver, ele);
        String value = ele.getAttribute("value");

        Assert.assertEquals(value, "");
        System.out.println(textbox+" texbox is empty");

    }

}
