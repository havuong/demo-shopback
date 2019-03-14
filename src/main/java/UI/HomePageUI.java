package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageUI {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='store six col-lg-2 col-md-2 col-sm-4 col-xs-6']")
    private static List<WebElement> popular_list;

    public HomePageUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver ,this);
    }

    public int getListSize(){
        int size = popular_list.size();
        System.out.println(size);
        return size;
    }
}
