package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceElements.LumaShippingAddressElements;
import com.resuableMethods.Baseclass;
import com.utility.Exceluitility;

public class ShippingPagePOM extends Baseclass implements LumaShippingAddressElements {

	

	@FindBy(name = firstname_name)
	private WebElement firstName;

	@FindBy(name = lastname_name)
	private WebElement lastName;

	@FindBy(name = company_name)
	private WebElement companyName;

	@FindBy(name = streetAddress_name)
	private WebElement address;

	@FindBy(name = city_name)
	private WebElement city;

	@FindBy(name = state_name)
	private WebElement state;

	@FindBy(name = zipCode_name)
	private WebElement zipCode;

	@FindBy(name = country_name)
	private WebElement country;

	@FindBy(name = telephone_name)
	private WebElement telephone;

	@FindBy(xpath = placeOder_xpath)
	private WebElement placeOrder;

	@FindBy(xpath = confirmationText_xpath)
	private WebElement confirmation;

	@FindBy(xpath = newAddress_xpath)
	private WebElement newAddress;
	
	
	@FindBy(id = shipAddress_id)
	private WebElement shipAddress;

	
	
	
	public ShippingPagePOM() {

		PageFactory.initElements(driver, this);
	}
	static Exceluitility excelData = new Exceluitility();
	
//	public void getValidation() { /// to get the excel data 
//		
//		assertText(address, excelData.getCellValue(company_name, shipAddress_id, city_name));
//		
//	}

	public void getShippingAddress() {
		

		javaScriptClick(newAddress);
		clearInput(firstName);

		inputValues(firstName,excelData.getCellValue("LumaData","user1", "firstname") );

		clearInput(lastName);
		inputValues(lastName, excelData.getCellValue("LumaData", "user1", "Lastname"));

		inputValues(companyName, excelData.getCellValue("LumaData", "user1", "Company"));

		inputValues(address, excelData.getCellValue("LumaData", "user1", "Street"));

		inputValues(city, excelData.getCellValue("LumaData", "user1", "City"));

		
		selectDropDownOption(country, "Value", "IN");

		selectDropDownOption(state, "visibletext", "Tamil Nadu");
		inputValues(zipCode, excelData.getCellValue("LumaData", "user1", "Zipcode"));

		inputValues(telephone, excelData.getCellValue("LumaData", "user1", "Phonenumber"));
		
		javaScriptClick(shipAddress);		
		
	}

}
