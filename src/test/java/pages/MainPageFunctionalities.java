package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageFunctionalities {

    public MainPageFunctionalities() {

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SignupLoginbutton;
}
