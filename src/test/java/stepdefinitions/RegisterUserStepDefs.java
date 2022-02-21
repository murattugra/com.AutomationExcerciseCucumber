package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.SignupLoginPage;
import pages.MainPageFunctionalities;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();
    SignupLoginPage loginPage=new SignupLoginPage();



    @Given("Navigate to url {string}")
    public void navigate_to_url(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals("home page is visible failed",expectedTitle,actualTitle);

    }

    @And("Click on  Signup-Login button")
    public void clickOnSignupLoginButton() {
        mainPageFunctionalities.SignupLoginbutton.click();



    }






}