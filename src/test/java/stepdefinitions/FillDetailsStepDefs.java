package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FillDetailsPage;

public class FillDetailsStepDefs {
    FillDetailsPage fillDetailsPage =new FillDetailsPage();



    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

    }
    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @When("Click Create Account button")
    public void click_create_account_button() {

    }
    @When("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {

    }
    @Then("Click Continue button")
    public void click_continue_button() {

    }

}
