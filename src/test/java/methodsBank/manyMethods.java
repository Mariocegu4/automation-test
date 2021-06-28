package methodsBank;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class manyMethods {

    public static void scroll(WebDriver driver, WebElement ele){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ele);
    }

    public static void highlightElement(WebDriver driver, WebElement ele, boolean scroll) {

        try {

            if(scroll){
                scroll(driver, ele);
            }
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", ele);

        } catch (Exception e) {
            System.out.println("Unable to locate element");
            Assert.fail();

        }
    }

    public static void deactivateHiglightElement(WebDriver driver, WebElement ele){

        try {
            if(driver instanceof  JavascriptExecutor){
                ((JavascriptExecutor)driver)
                        .executeScript("arguments[0].style.border='0px solid red'", ele);
            }
        }catch (Exception e){
            System.out.println("Unable to deactivate Highlight");
        }
    }

    //working
    public static void changeBGColor(WebDriver driver, WebElement ele, String color) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
//            document.getElementById("p2").style.color = "blue";
            js.executeScript("arguments[0].style.background='"+color+"')", ele);
        } catch (Exception e) {
            System.out.println("Couldn't change BG color");
        }
    }
}
