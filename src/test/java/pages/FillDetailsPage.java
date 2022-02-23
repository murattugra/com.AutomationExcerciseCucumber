package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FillDetailsPage {

    public FillDetailsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformationtextElement;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement titleMr;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//select[@id='days']")
    public  WebElement daysDropDownElement;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement mounthDropDownElement;

    @FindBy(xpath = "//select[@id='years']")
    public  WebElement yearsDropDownElement;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropDownElement;

    @FindBy(xpath = "//input[@id='first_name']")
    public  WebElement firstNameBox;

   @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountButton;

   @FindBy(xpath = "//b[.='Account Created!']")
    public  WebElement accountCreatedText;

   @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;


   @FindBy(tagName = "//li[9]")
    public WebElement loggedinasElement;

   @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;





}
