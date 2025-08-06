package com.InterfaceElements;

public interface LumaShippingAddressElements {

	String firstname_name = "firstname";

	String lastname_name = "lastname";

	String company_name = "company";

	String streetAddress_name = "street[0]";

	String city_name = "city";

	String state_name = "region_id";

	String zipCode_name = "postcode";

	String country_name = "country_id";

	String telephone_name = "telephone";

	String placeOder_xpath = "//span[text()='Place Order']";

	String confirmationText_xpath = "//span[text()='Thank you for your purchase!']";

	
	String newAddress_xpath="//span[text()='New Address']";
	
	
	String shipAddress_id ="shipping-save-in-address-book";
	
	
}
