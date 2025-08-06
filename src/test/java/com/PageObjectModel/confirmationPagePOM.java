package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceElements.LumaConfimPageElements;
import com.resuableMethods.Baseclass;

public class confirmationPagePOM extends Baseclass implements LumaConfimPageElements {

	@FindBy(xpath = next_xpath)
	private WebElement nextBtn;

	@FindBy(xpath = placeOrder_xpath)
	private WebElement placeOrder;

	@FindBy(xpath = thankyou_xpath)
	private WebElement thankYouMessage;

	@FindBy(xpath = orderId_xpath)
	private WebElement orderID;

	public confirmationPagePOM() {

		PageFactory.initElements(driver, this);
	}

	public void getNextBtn() {

		javaScriptClick(nextBtn);
		
	}

	public void getPlaceOrder() {

		javaScriptClick(placeOrder);

	}

	public void getSuccessMessage(String successMessage) {

		assertText(thankYouMessage, successMessage);

	}

	public void getOrderNumber() {
		
		PrintingText(orderID);

	
	}

}
