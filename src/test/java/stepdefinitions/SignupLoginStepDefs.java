package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FillDetailsPage;
import pages.SignupLoginPage;

public class SignupLoginStepDefs {
    SignupLoginPage loginPage=new SignupLoginPage();
    FillDetailsPage fillDetailsPage=new FillDetailsPage();

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue("'New User Signup!' is invisible",loginPage.newUserSignupElement.isDisplayed());

    }


    @Then("And Enter name and email address")
    public void andEnterNameAndEmailAddress() {
        loginPage.newUserSignupNameBox.sendKeys(Faker.instance().name().fullName());
        loginPage.newUserSignupEmailBox.sendKeys(Faker.instance().internet().emailAddress());

    }

    @And("When Click Signup button")
    public void whenClickSignupButton() {
        loginPage.newUserSignupButton.click();
    }

    @And("Then Verify that {string} is visible")
    public void thenVerifyThatENTERACCOUNTINFORMATIONIsVisible(String text) {

        Assert.assertTrue(fillDetailsPage.enterAccountInformationtextElement.isDisplayed());

    }
}
