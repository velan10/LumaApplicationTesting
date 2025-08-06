package com.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.InterfaceElements.LumaMenProductPageElements;
import com.resuableMethods.Baseclass;
import com.utility.Exceluitility;
import com.utility.LumaDataReader;

public class MenProductPagePOM extends Baseclass implements LumaMenProductPageElements {

	LumaDataReader data = new LumaDataReader();

	@FindBy(xpath = mens_xpath)
	private WebElement mens;

	@FindBy(xpath = tops_xpath)
	private WebElement tops;

	@FindBy(xpath = jacket_xpath)
	private WebElement jacket;

	@FindBy(xpath = windJacket_xpath)
	private WebElement windJacket;

	@FindBy(xpath = L_Size_xpath)
	private WebElement LSize;

	@FindBy(xpath = redColor_xpath)
	private WebElement redColor;

	@FindBy(xpath = addtoCart_xpath)
	private WebElement addtocart;

	@FindBy(xpath = addedCard_xpath)
	private WebElement addedCart;

	@FindBy(xpath = shoppingCart_xpath)
	private WebElement shoppingCart;

	@FindBy(xpath = proceedToCheckout_xpath)
	private WebElement proceedCheckout;

	public MenProductPagePOM() {

		PageFactory.initElements(driver, this);
	}

	public void getMens_Tops_Jacket() {

		actionsMoveToElement(mens);
		actionsMoveToElement(tops);
		actionsMoveToElement(jacket);

		clickElement(jacket);
		
	}

	public void getWindJacket(String jackjetSelection) {

		assertText(windJacket, jackjetSelection);
		javaScriptClick(windJacket);

	}

	public void getLSize() {

		clickElement(LSize);
	}

	public void getRedColor() {

		javaScriptClick(redColor);
		javaScriptClick(LSize);
	}

	public void getAddtoCart() {
	driver.navigate().refresh();
	javaScriptClick(redColor);
	javaScriptClick(LSize);
	
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
