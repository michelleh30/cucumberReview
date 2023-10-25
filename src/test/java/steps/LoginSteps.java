package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user navigate to the Website")
    public void user_navigate_to_the_website() {
      //
    }
    @When("user enters the credentials")
    public void user_enters_the_credentials() {
       //find the elements
        //send the credent
    }
    @When("click on login button")
    public void click_on_login_button() {
        //find the login button and click
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
      // verity that you logged in
    }

}
