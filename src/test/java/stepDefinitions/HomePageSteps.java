package stepDefinitions;

import UI.HomePageUI;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver;
    HomePageUI homePageUI;

    public HomePageSteps() {
        driver = Hooks.openBrowser();
        homePageUI = new HomePageUI(driver);
    }

    @Then("User sees {int} items displayed in Popular tab")
    public void userSeesItemsDisplayed(int number) {
        Assert.assertEquals(homePageUI.getListSize(),number);
    }
}
