package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupLoginPage {

    public SignupLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupElement;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement newUserSignupNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserSignupEmailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public  WebElement newUserSignupButton;






}
