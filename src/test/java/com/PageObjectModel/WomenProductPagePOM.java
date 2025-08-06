package com.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceElements.LumaWomenProductPageElements;
import com.resuableMethods.Baseclass;
import com.utility.LumaDataReader;

public class WomenProductPagePOM  extends Baseclass implements LumaWomenProductPageElements{

	LumaDataReader data = new LumaDataReader();

	@FindBy(xpath = womens_xpath)
	private WebElement women;

	@FindBy(xpath = tops_xpath)
	private WebElement tops;

	@FindBy(xpath = jacket_xpath)
	private WebElement jacket;

	@FindBy(xpath = junoJacket_xpath)
	private WebElement junoJacket;

	@FindBy(xpath = xl_Size_xpath)
	private WebElement xlSize;

	@FindBy(xpath = greenColor_xpath)
	private WebElement redColor;

	@FindBy(xpath = addtoCart_xpath)
	private WebElement addtocart;

//	@FindBy(xpath = addedCard_xpath)
//	private WebElement addedCart;

	@FindBy(xpath = shoppingCart_xpath)
	private WebElement shoppingCart;

	@FindBy(xpath = proceedToCheckout_xpath)
	private WebElement proceedCheckout;

	public WomenProductPagePOM() {

		PageFactory.initElements(driver, this);
	}

	public void getWomen_Jacket() {

		actionsMoveToElement(women);
		actionsMoveToElement(tops);
		actionsMoveToElement(jacket);

		clickElement(jacket);
		
	}

	public void getWindJacket(String jackjetSelection) {

		assertText(junoJacket, jackjetSelection);
		javaScriptClick(junoJacket);

	}

	public void getLSize() {

		clickElement(xlSize);
	}

	public void getRedColor() {

		javaScriptClick(redColor);
		javaScriptClick(xlSize);
	}

	public void getAddtoCart() {
	driver.navigate().refresh();
	javaScriptClick(redColor);
	javaScriptClick(xlSize);
	
		javaScriptClick(addtocart);

	}

	public void getShoppingCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", shoppingCart);
	}

	public void getProceedToCheckout() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", proceedCheckout);
	}

	
	

}
