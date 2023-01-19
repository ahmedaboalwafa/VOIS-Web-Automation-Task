# VOIS-Web-Automation-Task
 
## Environment
* Using Java 19 OpenJDK
* Using Selenium 4
* Using IntelliJ IDEA IDE to develop the solution
*	Using TestNG as a Test Framework to create and execute the script
*	Using Maven to build and manage the project
*	Using Chrome driver to run the script
*	Using Data property file to save configuration data used in the script such as URL
*	Using Page Object Model as a Design Pattern 

## Note
* when open the URL page return "Account suspended" and when search for it in google the url appear put replace ".pl" instead of ".com" to become "http://automationpractice.pl"
* please change the email from property file used in registration

## Classes 
* Creating a Configuration_Data_Reader class to read values from the property file .
* Creating a createNewAccount Test Case in SignUp_Tests class to create a new user account and this class call 4 classes_page (Home_Page,Authentication_Page,SignUp_Page,MyAccount_Page).
* Creating a Two Test Cases in MakeAnOrder_Tests class (signIn,makeAnOrder) --> (signIn to login with the new created user account and this class call 3 classes-page (Home_Page,Authentication_Page,MyAccount_Page) - (makeAnOrder to make order and check the orders history this class call 7 classes-page (MyAccount_Page,Categories_Page,Summary_Page,Address_Page,Shipping_Page,Payment_Page,History_Page).
* Creating a BaseTests class contains the setup and teardown. 
* Create a Home_Page class to click on Signin Button and navigate to Authentication page.
* Create a Authentication_Page class to enter the email and navigate to signUp page , and to enter the email and password and login and navigate to MyAccount page.
* Create a signUp_Page class to enter the data and signUp and navigate to MyAccount page.
* Create a MyAccount_Page class to select the category and navigate to category page.
* Create a Categories_Page class to add the product to card and navigate to Summary page.
* Create a Summary_Page class to click on proceed and navigate to Address page.
* Create a Address_Page class to click on proceed and navigate to Shipping page.
* Create a Shipping_Page class to accept the terms and click on proceed and navigate to Payment page.
* Create a Payment_Page class to choose and confirm bank wire option and get the product reference code and navigate with it to History page.
* Create a History_Page class to assert the reference code that return from the payment page exist in the history page.
