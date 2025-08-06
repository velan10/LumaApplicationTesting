package com.pageObjectManager;

import com.PageObjectModel.LoginPagePOM;
import com.PageObjectModel.MenProductPagePOM;
import com.PageObjectModel.ShippingPagePOM;
import com.PageObjectModel.confirmationPagePOM;
import com.utility.LumaDataReader;

public class LumaPageObjectManager {
	
	
	private LumaDataReader reader;
	private LoginPagePOM login;
	private MenProductPagePOM product;
	private ShippingPagePOM address;
	private confirmationPagePOM confirm;
	private static LumaPageObjectManager pageObject;
	
	
	private LumaPageObjectManager() {		
	}
	
	
	
	public static LumaPageObjectManager getPageObjectManager() {
		if(pageObject ==null) {
			pageObject = new LumaPageObjectManager();
		}	
		return pageObject;
	}
	
	
  public LoginPagePOM getloginPageManager() {
	  
	  if(login == null)
	  {
		  login = new LoginPagePOM();
	  }
	  
	  return login;
  }
	
	
	
  public LumaDataReader getFileReaderManager() {
	  
	  
	  if(reader == null)
	  {
		  reader = new LumaDataReader();
	  }
	  
	  return reader;
  }
	
public ShippingPagePOM getShippingPageManager() {
	  
	  
	  if(address == null)
	  {
		  address = new ShippingPagePOM();
	  }
	  
	  return address;
  }
	
  
  
	
  public MenProductPagePOM getProductPage() {
	  
	  
	  if(product == null)
	  {
		  product = new MenProductPagePOM();
	  }
	  
	  return product;
  }
public confirmationPagePOM getConfirmPageManager() {
	  
	  
	  if(confirm == null)
	  {
		  confirm = new confirmationPagePOM();
	  }
	  
	  return confirm;
  }
	
  
  
  
  
  

}
