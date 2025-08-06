package com.lumaStepDef1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pageObjectManager.LumaPageObjectManager;
import com.resuableMethods.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaMensStepDef extends Baseclass {
	LumaPageObjectManager pageObjectManager = new LumaPageObjectManager();

	@Given("User Launch the Browser")
	public void user_launch_the_browser() {

		launchBrowser(pageObjectManager.getFileReaderManager().getDataProperty("browser")); // chrome
		
		
	}

	@Given("User Launch the Url")
	public void user_launch_the_url() {

		launchUrl(pageObjectManager.getFileReaderManager().getDataProperty("url"));
	}

	@When("User click the Homepage SingIn Button")
	public void user_click_the_homepage_sing_in_button() {

		pageObjectManager.getloginPageManager().getHomeSignIn();
	}

	@Then("User navigates to the login page {string}")
	public void user_navigates_to_the_login_page(String Logintext) { // logintext ="Customer Login"

		pageObjectManager.getloginPageManager().getcustomerlogintext(Logintext);

	}

	@When("User enters Username {string} in the Username Field")
	public void user_enters_username_in_the_username_field(String email) {

		pageObjectManager.getloginPageManager().getEmail(email);
		
	}

	@When("User enters password {string}  in the Password Field")
	public void user_enters_password_in_the_password_field(String password) {

		pageObjectManager.getloginPageManager().getPassword(password);

	}

	@When("User clicks on the signIn button")
	public void user_clicks_on_the_signIn_button() throws InterruptedException {

		pageObjectManager.getloginPageManager().getSignin();

	}

	@Then("User should be redirected to  the dashboard  {string}")
	public void user_should_be_redirected_to_the_dashboard(String welcomeText) throws InterruptedException {

		pageObjectManager.getloginPageManager().getDashBoardValidations(welcomeText);
	}

	@When("User select the Mens top Jacket Selection")
	public void user_select_the_mens_top_jacket_selection() {

		pageObjectManager.getProductPage().getMens_Tops_Jacket();

	}

	@When("User selects the {string}")
	public void user_selects_the(String ecpectedText) {

		pageObjectManager.getProductPage().getWindJacket(ecpectedText);
	}

	@When("User Select L size")
	public void user_select_m_size() {
		pageObjectManager.getProductPage().getLSize();
	}

	@When("User Select  Red Color")
	public void user_select_red_color() {
		pageObjectManager.getProductPage().getRedColor();
	}

	@When("User adds the jacket to the cart")
	public void user_adds_the_jacket_to_the_cart() {
	
		pageObjectManager.getProductPage().getAddtoCart();
	}

	@When("User click the Shoping Cart")
	public void user_click_the_shoping_cart() {
		pageObjectManager.getProductPage().getShoppingCart();
	}

	@When("User proceeds to checkout")
	public void user_proceeds_to_checkout() {

		pageObjectManager.getProductPage().getProceedToCheckout();

	}

	@When("User fills in the mandatory shipping address with the following details")
	public void user_fills_in_the_mandatory_shipping_address_with_the_following_details() {
		pageObjectManager.getShippingPageManager().getShippingAddress();

	}

	@When("User selects the standard shipping method")
	public void user_selects_the_standard_shipping_method() {

		pageObjectManager.getConfirmPageManager().getNextBtn();

	}

	@When("User places the order")
	public void user_places_the_order() {

		pageObjectManager.getConfirmPageManager().getPlaceOrder();

	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String successMessage) {

		pageObjectManager.getConfirmPageManager().getSuccessMessage(successMessage);

	}

	@Then("User should print the order number")
	public void user_should_print_the_order_number() {
		pageObjectManager.getConfirmPageManager().getOrderNumber();
	}

	
	@Then("User Terminate the Browser")
	public void user_terminate_the_browser() {
	   terminateBrowser();
	}


}
