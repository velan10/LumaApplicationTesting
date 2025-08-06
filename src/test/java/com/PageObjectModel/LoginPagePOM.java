package com.PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceElements.LumaLoginPageElements;
import com.resuableMethods.Baseclass;
import com.utility.LumaDataReader;

public class LoginPagePOM extends Baseclass implements LumaLoginPageElements {

	LumaDataReader data = new LumaDataReader();

	@FindBy(id = username_id)
	private WebElement email;

	@FindBy(name = password_name)
	private WebElement password;

	@FindBy(xpath = signInBtn_xpath)
	private WebElement singnin;

	@FindBy(xpath = homePageSingIn_xpath)
	private WebElement homepageSingin;

	@FindBy(xpath = customerLogintext_xpath)
	private WebElement customerlogintext;

	@FindBy(xpath = WelcomDashboard_xpath)
	private WebElement welcomeDashBoardtext;

	public LoginPagePOM() {

		PageFactory.initElements(driver, this);
	}

	public void getHomeSignIn() {
		clickElement(homepageSingin);
	}

	public void getcustomerlogintext(String expectedText) { // expectedtext="Customer Login"

		assertText(customerlogintext, expectedText);

	}

	public void getEmail(String emailData) {

		inputValues(email, emailData);

	}

	public void getPassword(String passwordData) {

		inputValues(password, passwordData);

	}

	public void getSignin() {

		javaScriptClick(singnin);

	}

	public void getDashBoardValidations(String welcomeText) {

		assertText(welcomeDashBoardtext, welcomeText);

	}

}
