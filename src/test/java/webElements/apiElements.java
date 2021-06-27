package webElements;

import org.openqa.selenium.By;
import java.util.HashMap;

public class apiElements extends Screen{

    public apiElements(){
        elements = new HashMap<>();

        //xpath for specific card with "i" being the number
        // div[@class='row'][i]

        elements.put("Search input", By.xpath("//input[@placeholder='Search']"));
        elements.put("Search button", By.xpath("//button[contains(text(), 'Search')]"));
        elements.put("Back button", By.xpath("//a[@class='btn btn-primary']"));

    }
}
