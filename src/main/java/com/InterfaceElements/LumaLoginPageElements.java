package com.InterfaceElements;

public interface LumaLoginPageElements {
	
	String username_id = "email";
	String password_name= "login[password]";
	
	String signInBtn_xpath="(//span[text()='Sign In'])[1]";
	
	String homePageSingIn_xpath="(//a[contains(text(),'Sign In')])[1]";

	String customerLogintext_xpath ="//span[text()='Customer Login']";
	
	
	String WelcomDashboard_xpath="(//span[text()='Welcome, Velan Velli!'])[1]";
	
}
