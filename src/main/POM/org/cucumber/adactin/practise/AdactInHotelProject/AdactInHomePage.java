package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInHomePage {
	
	public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement locationdropdown;
	
	@FindBy(id="hotels")
	private WebElement hoteldropdown;
	
	@FindBy(id="room_type")
	private WebElement roomtypedropdown;
	
	@FindBy(id="room_nos")
	private WebElement numberofroomsdropdown;
	
	@FindBy(id="datepick_in")
	private WebElement checkIndropdown;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutdropdown;
	
	@FindBy(id="adult_room")
	private WebElement adultroomdropdown;
	
	@FindBy(id="child_room")
	private WebElement childrendropdown;
	
	@FindBy(id="Submit")
	private WebElement submitbutton;
	
	@FindBy(id="checkin_span")
	private WebElement checkinerrormessage;
	
	@FindBy(xpath="//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement checkouterrormessage;
	
	public WebElement getCheckouterrormessage() {
		return checkouterrormessage;
	}

	public AdactInHomePage(WebDriver gdriver) {
		this.driver=gdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocationdropdown() {
		return locationdropdown;
	}

	public WebElement getHoteldropdown() {
		return hoteldropdown;
	}

	public WebElement getRoomtypedropdown() {
		return roomtypedropdown;
	}

	public WebElement getNumberofroomsdropdown() {
		return numberofroomsdropdown;
	}

	public WebElement getCheckIndropdown() {
		return checkIndropdown;
	}

	public WebElement getCheckOutdropdown() {
		return checkOutdropdown;
	}

	public WebElement getAdultroomdropdown() {
		return adultroomdropdown;
	}

	public WebElement getChildrendropdown() {
		return childrendropdown;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getCheckinerrormessage() {
		return checkinerrormessage;
	}

}
