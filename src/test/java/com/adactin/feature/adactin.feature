Feature: Hotel Booking In Adactin Application

Scenario: Login Functionality

Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigate To The Search Hotel Page 

Scenario: Search Hotel Functionality 

When user Select The Location In Locatiion Field
And user Select The Hotel Location In Location Field 
And user Select The Room Type In Room Field
And user Select The Rooms In Number Of Room Field
And user Select The Check In Date In Check In Date Field
And user Select The Check Out Date In Check Out Date Field
And user Select The Adult Per Room In Adult Per Room Field
And user Select The Children Per Room In Children Per Room Field
Then user Click On The Search Button And It Navigate To The Select Home Page

Scenario: Select The Hotel Functionality

When user Select The Hotel In Hotel Field
Then  user Click On The Continue Button And It Navigate To Book A Hotel Page

Scenario: Book A Hotel Functionality

When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Adress In Billing Adress Field
And user Enter The Card No In Card No Field
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Expiry Date In Expiry Date Field
And user Select The Year In Year Field
And user Enter The Cvv Number In Cvv Number Field
Then user Click On The Book Now Button

Scenario: Click To A My Ittenary Functionality

Then user Click On The Ittenary Button



 
