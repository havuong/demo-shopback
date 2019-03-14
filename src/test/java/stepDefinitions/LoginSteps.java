package stepDefinitions;

import UI.LoginPageUI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    private LoginPageUI loginPageUI;

    public LoginSteps() {
        driver = Hooks.openBrowser();
        loginPageUI = new LoginPageUI(driver);
    }

    @Given("User access to Homepage")
    public void userAccessToHomepage() {
        LoginPageUI.clicksOnNotNow();
    }

    @And("User access to Login popup")
    public void userAccessToLoginPopup() {
        LoginPageUI.clicksOnLoginBtn();
        Assert.assertTrue(LoginPageUI.isLoginPopupDislayed());
    }

    @When("User login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String email, String password) {
        LoginPageUI.clicksOnUseEmailAddress();
        LoginPageUI.inputEmail(email);
        LoginPageUI.clicksOnNextButton();
        LoginPageUI.inputPassword(password);
        LoginPageUI.clicksOnNextButton();
    }

//
//    @And("User go to next page")
//    public void userGoToNextPage() {
//
//    }
//
//
//    @Then("User login successfully")
//    public void userLoginSuccessfully() {
//    }
}
