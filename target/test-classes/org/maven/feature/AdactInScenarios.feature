@TC
Feature: End to End functionality for AdactIn Web Application
Contains 3 test scenario with Login Details

Background: User lauch the browser
Given User should launch the browser 
And User hold for '5' seconds

@TC1 
Scenario: User verify for valid login details
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
And User click the signout to exit from the loggin page
And User hold for '3' seconds


@TC2
Scenario: User verify whether the check-out date field accepts a later date than checkin date
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
Then User selects the Number of rooms
And User enters the check in date
And User enters the check out date
Then User selects the Adults per room options
And User selects the children per room
Then User click on the search button 
Then User verify the check in and check out message is displayed
And User hold for '3' seconds
And User click the signout to exit from the loggin page

@TC3
Scenario: User check if error is reported if check-out date field is in the past
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
Then User selects the Number of rooms
And User enters the check in date as today and past five dates
And User enters the check out date as today and past three dates
Then User selects the Adults per room options
And User selects the children per room
Then User click on the search button 
Then User verifies the application throws the date mismatch as post dated	
And User hold for '3' seconds
And User click the signout to exit from the loggin page

@TC4
Scenario: User verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel 
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels creek
And User selects the roomtype
Then User selects the Number of rooms
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button 
Then User verifies that hotel displayed is the same as selected in search Hotel form
And User hold for '3' seconds
And User click the signout to exit from the loggin page

@TC5
Scenario: User to verify whether check-in and check-out date are being displayed in Select Hotel page according to the dates selected in search hotel
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
Then User selects the Number of rooms
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button 
Then User verifies that hotel displayed the check in dated is same as search hotel form	
Then User verifies that hotel displayed the check out dated is same as search hotel form	
And User hold for '3' seconds
And User click the signout to exit from the loggin page

@TC6
Scenario Outline: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
Then User selects the Number of rooms as '<Room Numbers>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button 
Then User verifies the number of rooms is displayed is same as the search hotel form '<Room Numbers>'
And User hold for '3' seconds
And User click the signout to exit from the loggin page

Examples:
|Room Numbers|
|3|

@TC7
Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype as deluxe
Then User selects the Number of rooms
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button 
Then User verifies the room type is displayed is same as the search hotel form
And User hold for '3' seconds
And User click the signout to exit from the loggin page

@TC8
Scenario Outline: To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms excluding gst '<Number of Rooms>'
And User hold for '3' seconds
And User click the signout to exit from the loggin page

Examples:
|Number of Rooms|
|2              |

@TC9
Scenario Outline: User should logout from the application.
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms excluding gst '<Number of Rooms>'
And User enters the first name
And User Enters the last name
And User enters the Billing Address
And User enters the credit card number
And User selects the Credit card type
And User selects the expiry month
And User selects the expirty year
And User enters the cvv number
And user click the book now button
And User click the logout button
And User hold for '3' seconds
Then User validate the page is succesfully logout from the application '<Logout validation>'
And User hold for '3' seconds


Examples:
|Number of Rooms|Logout validation                 |
|2              |"You have successfully logged out. Click here to login again"|

@TC10
Scenario Outline: User should logout from the application.
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms including gst '<Number of Rooms>'
And User hold for '3' seconds
And User click the signout to exit from the loggin page

Examples:
|Number of Rooms|
|2              |

@TC11
Scenario Outline: To check Hotel name, Location, room type, Total Day, price pernight are same in Booking confirmation page as they were selected in previous screen
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User hold for '3' seconds
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies all the data enter is correct '<Hotel Name>','<Rooms Type>','<Location>','<Total Days>','<Price per Night>'
And User hold for '3' seconds
Then User verfies the total price for the rooms excluding gst '<Number of Rooms>'
And User click the signout to exit from the loggin page

Examples:
|Number of Rooms|Hotel Name   |Rooms Type  |Location  |Total Days|Price per Night|
|2              |"Hotel Creek"|"Standard"  |"Sydney"  |1         |"AUD $ 125"    |

@TC12
Scenario Outline: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as one '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for one room including gst '<Number of Rooms>'
And User hold for '3' seconds
And User click the signout to exit from the loggin page

Examples:
|Number of Rooms|
|1              |

@TC13
Scenario Outline: User should logout from the application.
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms including gst '<Number of Rooms>'
And User enters the first name
And User Enters the last name
And User enters the Billing Address
And User enters the credit card number
And User selects the Credit card type
And User selects the expiry month
And User selects the expirty year
And User enters the cvv number
And user click the book now button
And User hold for '3' seconds
Then User verfies the selected value in search page and is displayed in booking page is same'<Check In Date>','<Check OutDate>','<Adults per Room>','<Children per Room>','<Room Type>','<Hotel Name>'
And User hold for '3' seconds
And User click the logout button


Examples:
|Number of Rooms|Check In Date|Check OutDate|Adults per Room|Children per Room|Room Type |Hotel Name |
|2              |"15/03/2019" |"16/03/2019" |1              |"No Children"    |"Standard"|"Hotel Creek"|

@TC14
Scenario Outline: Verify Order number is generated in booking confirmation page
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms including gst '<Number of Rooms>'
And User enters the first name
And User Enters the last name
And User enters the Billing Address
And User enters the credit card number
And User selects the Credit card type
And User selects the expiry month
And User selects the expirty year
And User enters the cvv number
And user click the book now button
And User hold for '3' seconds
Then User verfies the selected value in search page and is displayed in booking page is same'<Check In Date>','<Check OutDate>','<Adults per Room>','<Children per Room>','<Room Type>','<Hotel Name>'
And User hold for '3' seconds
Then User verfies the order number is generated
And User click the logout button


Examples:
|Number of Rooms|Check In Date|Check OutDate|Adults per Room|Children per Room|Room Type |Hotel Name |
|2              |"15/03/2019" |"16/03/2019" |1              |"No Children"    |"Standard"|"Hotel Creek"|

@TC15
Scenario Outline: Verify Order number is generated in booking confirmation page
Then User should verify the Welcome to AdactIn Group of Hotels is displayed
When User should enter the username in the login page
And User should enter the passward in the login page
And User clicks the Login button in the login page
And User hold for '3' seconds
When User selects the location
And User Selects the hotels
And User selects the roomtype
And User selects number of rooms as two '<Number of Rooms>'
And User enters the check in date as todays date
And User enters the check out date as next date
Then User selects the Adults per room options
And User selects no children per room
Then User click on the search button
And User selects radio button to select the displayed hotel
And User click the continue buttons to submit
Then User verfies the total price for the rooms including gst '<Number of Rooms>'
And User enters the first name
And User Enters the last name
And User enters the Billing Address
And User enters the credit card number
And User selects the Credit card type
And User selects the expiry month
And User selects the expirty year
And User enters the cvv number
And user click the book now button
And User hold for '3' seconds
Then User verfies the selected value in search page and is displayed in booking page is same'<Check In Date>','<Check OutDate>','<Adults per Room>','<Children per Room>','<Room Type>','<Hotel Name>'
And User hold for '3' seconds
Then User verfies the order number is generated
And User click the my itinerary button
And User enters the order id in the search field and click go button 
Then User verified the order ID details
And User hold for '3' seconds
And User click the logout button


Examples:
|Number of Rooms|Check In Date|Check OutDate|Adults per Room|Children per Room|Room Type |Hotel Name |
|2              |"16/04/2019" |"17/04/2019" |1              |"No Children"    |"Standard"|"Hotel Creek"|


  


