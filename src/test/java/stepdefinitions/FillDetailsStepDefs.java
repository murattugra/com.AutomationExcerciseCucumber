package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {
    FillDetailsPage fillDetailsPage =new FillDetailsPage();
    Actions actions;
    String nameBox;

    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions=new Actions(Driver.getDriver());
        actions.click(fillDetailsPage.firstNameBox).sendKeys(Faker.instance().name().firstName())
                .sendKeys(Keys.TAB).sendKeys(Faker.instance().name().lastName())
                .sendKeys(Keys.TAB).sendKeys(Faker.instance().name().bloodGroup())
                .sendKeys(Keys.TAB).sendKeys(Faker.instance().address().streetAddressNumber())
                .sendKeys(Keys.TAB)  .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Faker.instance().address().country())
                .sendKeys(Keys.TAB).sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB).sendKeys(Faker.instance().address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();
                Select select=new Select(fillDetailsPage.countryDropDownElement);
                select.selectByIndex(Faker.instance().random().nextInt(1,7));
        nameBox=fillDetailsPage.nameBox.getText();
        System.out.println(nameBox);

    }
    @When("Click Create Account button")
    public void click_create_account_button() {
        fillDetailsPage.createAccountButton.click();
    }
    @When("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
           String actualText=fillDetailsPage.accountCreatedText.getText();
           Assert.assertEquals("'ACCOUNT CREATED!' test failed",string,actualText);

    }
    @Then("Click Continue button")
    public void click_continue_button() {
    fillDetailsPage.continueButton.click();
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth, Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!")
    public void fillDetailsTitleNameEmailPasswordDateOfBirthSelectCheckboxSignUpForOurNewsletterAndSelectCheckboxReceiveSpecialOffersFromOurPartners() throws InterruptedException {
        fillDetailsPage.titleMr.click();

        fillDetailsPage.passwordBox.sendKeys(Faker.instance().internet().password());

        Select select=new Select(fillDetailsPage.daysDropDownElement);
        select.selectByIndex(Faker.instance().random().nextInt(1,28));
        Select select2=new Select(fillDetailsPage.mounthDropDownElement);
        select2.selectByIndex(Faker.instance().random().nextInt(1,12));
        Select select3=new Select(fillDetailsPage.yearsDropDownElement);
        int rastegeleSayi=Faker.instance().random().nextInt(1950,2000);
        String rastgeleSayiStr= String.valueOf(rastegeleSayi);
        select3.selectByValue(rastgeleSayiStr);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).click().sendKeys(Keys.TAB).perform();


    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        String aa=fillDetailsPage.loggedinasElement.getAttribute("innerText");
        System.out.println(aa);
        Assert.assertTrue(fillDetailsPage.loggedinasElement.isDisplayed());

    }
}
