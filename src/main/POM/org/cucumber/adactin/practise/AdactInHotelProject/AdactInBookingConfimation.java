package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInBookingConfimation {
	
	public WebDriver driver;
	
	@FindBy(id="hotel_name")
	private WebElement confirmedhotelname; 
	
	@FindBy(id="room_type")
	private WebElement confirmedroomtype; 
	
	@FindBy(id="total_rooms")
	private WebElement confirmedNoOfRooms; 
	
	@FindBy(id="adults_room")
	private WebElement confirmedadultrooms; 
	
	@FindBy(id="children_room")
	private WebElement confirmedchildren; 
	
	public WebElement getConfirmedorderno() {
		return confirmedorderno;
	}

	@FindBy(id="arrival_date")
	private WebElement confirmedcheckin;
	
	@FindBy(id="departure_text")
	private WebElement confirmedcheckout;
	
	@FindBy(id="order_no")
	private WebElement confirmedorderno;
	
	public AdactInBookingConfimation(WebDriver cdriver) {
    this.driver=cdriver;
    PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmedhotelname() {
		return confirmedhotelname;
	}

	public WebElement getConfirmedroomtype() {
		return confirmedroomtype;
	}

	public WebElement getConfirmedNoOfRooms() {
		return confirmedNoOfRooms;
	}

	public WebElement getConfirmedadultrooms() {
		return confirmedadultrooms;
	}

	public WebElement getConfirmedchildren() {
		return confirmedchildren;
	}

	public WebElement getConfirmedcheckin() {
		return confirmedcheckin;
	}

	public WebElement getConfirmedcheckout() {
		return confirmedcheckout;
	}
	

}
