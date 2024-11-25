package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {
	@Given("user is on login page")
	public void verifyLoginPage() {
		System.out.println("Inside- user is on login page");
		
	}

@When("user enters correct username and password")
public void user_enters_correct_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Inside-Enter username and password");;
}

@And("clicks on login button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Inside-Click on Login Button");
}

@Then("user is navigated to the homepage")
public void user_is_navigated_to_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Inside-User is in landing page");;
}

}
