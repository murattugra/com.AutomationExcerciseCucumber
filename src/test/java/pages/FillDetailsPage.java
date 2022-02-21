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




}
