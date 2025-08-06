@watch
Feature: Purchasing in Luma Application 
 User want to purchase a Luma Analog Watch  




@Reg @lumawatch
Scenario: Buy a Luma Analog Watch 
	Given  User Launch the Url 
	When User click the Homepage SingIn Button 
	Then User navigates to the login page "Customer Login" 
	When  User enters Username "velandg10@gmail.com" in the Username Field 
	And  User enters password "Velan@1995"  in the Password Field 
	And  User clicks on the signIn button 
	Then   User should be redirected to  the dashboard  "Welcome, Velan Velli!" 
	When User select the watches  
	And user select the "Luma Analog Watch" watch   
	And user increase the quantity 
	And User click the add to cart button 
	And User click the Shoping Cart 
	And User check the quantity as 2 in  the Shoping Cart Page 
	And  User proceeds to checkout 
	When User fills in the mandatory shipping address with the following details
	And  User selects the standard shipping method 
	And  User places the order 
	Then  User should see a success message "Thank you for your purchase!" 
	And  User should print the order number
	
	
				
	
	
	
	
	
	
	

