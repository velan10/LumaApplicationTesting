package com.lumaStepDef2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pageObjectManager.LumaPageObjectManager;
import com.resuableMethods.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaWomenStepDef extends Baseclass {
	LumaPageObjectManager pageObjectManager = new LumaPageObjectManager();


@When("User navigate to the {string} category")
public void user_navigate_to_the_category(String string) {
     
     
}
@When("User add the {string} product to the cart with size {string}")
public void user_add_the_product_to_the_cart_with_size(String string, String string2) {
     
     
}
@When("User Women Tshirt Select L size")
public void user_women_tshirt_select_l_size() {
     
     
}
@When("User add the {string} product to the cart")
public void user_add_the_product_to_the_cart(String string) {
     
     
}
@When("User proceed to the cart")
public void user_proceed_to_the_cart() {
     
     
}
@Then("User verify the cart contains {string} and {string}")
public void user_verify_the_cart_contains_and(String string, String string2) {
     
     
}
@When("User proceed to checkout")
public void user_proceed_to_checkout() {
     
     
}
@When("User fill in the shipping details with valid information")
public void user_fill_in_the_shipping_details_with_valid_information() {
     
     
}
@When("User select {string} as the payment method")
public void user_select_as_the_payment_method(String string) {
     
     
}
@When("User confirm the order")
public void user_confirm_the_order() {
     
     
}
@Then("User should see the order confirmation page with order details")
public void user_should_see_the_order_confirmation_page_with_order_details() {
     
}




}
