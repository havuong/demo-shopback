package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUI {
    WebDriver driver;

    @FindBy (xpath = "//div[contains(text(),'Not Now')]")
    private static WebElement not_now_btn;
    @FindBy (xpath = "//div[@data-qa='login-btn']")
    private static WebElement login_btn;
    @FindBy (xpath = "//h3[text()='Sign in or Create a New Account']")
    private static WebElement login_popup_title;
    @FindBy (xpath = "//a[text()='Use Email Address']")
    private static WebElement use_email_link;
    @FindBy (xpath = "//input[@placeholder='Enter Email Address']")
    private static WebElement email_txt;
    @FindBy (xpath = "")
    private static WebElement password_txt;
    @FindBy (xpath = "")
    private static WebElement next_btn;

    public LoginPageUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void clicksOnNotNow(){
        not_now_btn.click();
    }

    public static void clicksOnLoginBtn(){
        login_btn.click();
    }

    public static boolean isLoginPopupDislayed(){
        return login_popup_title.isDisplayed();
    }

    public static void clicksOnUseEmailAddress(){
        use_email_link.click();
    }

    public static void inputEmail(String email){
        email_txt.sendKeys(email);
    }

    public static void inputPassword(String password){
        password_txt.sendKeys(password);
    }

    public static void clicksOnNextButton(){
        next_btn.click();
    }
}
