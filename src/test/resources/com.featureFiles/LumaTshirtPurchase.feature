
Feature: Magento E-commerce Website Testing 




Scenario Outline: Purchase a Mens Jacket 
	Given  User Launch the Url 
	When User click the Homepage SingIn Button 
	Then User navigates to the login page "Customer Login" 
	When  User enters Username "<Username>" in the Username Field
	And  User enters password "<password>"  in the Password Field 
	And  User clicks on the signIn button 
	Then   User should be redirected to  the dashboard  "Welcome, Velan Velli!"
	When User select the Mens top Jacket Selection 
	And  User selects the "Montana Wind Jacket" 
	And  User Select L size  Red Color  
	And  User adds the jacket to the cart 
	And User click the Shoping Cart 
	And  User proceeds to checkout 
	When User fills in the mandatory shipping address with the following details
	And  User selects the standard shipping method 
	And  User places the order 
	Then  User should see a success message "Thank you for your purchase!" 
	And  User should print the order number
	# And User Terminate the Browser
	Examples: 
		|Username|password| 
		|vellivelan@gmail.comg | 123455 | 
		|velandg10@gmail.com| Velan@1995|
		
	
	 Scenario: Purchase Women Tshirt  products
	Given  User Launch the facebook Url 
	When User click the Homepage SingIn Button 
	Then User navigates to the login page "Customer Login" 
	When  User enters Username "velandg10@gmail.com" in the Username Field 
	And  User enters password "vel12365"  in the Password Field 
	And  User clicks on the signIn button 
    When User navigate to the "Women" category
    When User add the "juno jacket" product to the cart with size "XL"
    And  User Women Tshirt Select L size  
    And User add the "Fusion Backpack" product to the cart
    And User proceed to the cart
    Then User verify the cart contains "Radiant Tee" and "Fusion Backpack"
    When User proceed to checkout
    And User fill in the shipping details with valid information
    And User select "PayPal" as the payment method
    And User confirm the order
    Then User should see the order confirmation page with order details
    
    
	