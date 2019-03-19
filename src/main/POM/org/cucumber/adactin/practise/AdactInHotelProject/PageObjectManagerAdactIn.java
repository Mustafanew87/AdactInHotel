package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;

public class PageObjectManagerAdactIn {
	
	public WebDriver driver;
	
	private AdactInLoginPage ap;
	private AdactInHomePage ah;
	private AdactInSelectHotelPage as;
	private AdactInHotelBookingpage ab;
	private AdactInBookingConfimation ac;
	private AdactInBookedItineraryPage ai;
	
	public AdactInBookedItineraryPage getAi() {
		if (ai==null) {
			ai=new AdactInBookedItineraryPage(driver);
		}
		return ai;
	}


	public AdactInHotelBookingpage getAb() {
		if (ab==null) {
			ab=new AdactInHotelBookingpage(driver);
		}
		return ab;
	}


	public AdactInBookingConfimation getAc() {
		if (ac==null) {
			ac=new AdactInBookingConfimation(driver);
		}
		return ac;
	}


	public AdactInSelectHotelPage getAs() {
		if (as==null) {
			as=new AdactInSelectHotelPage(driver);
			
		}
		return as;
	}


	public PageObjectManagerAdactIn(WebDriver fdriver) {
    this.driver =fdriver;
	}


	public AdactInLoginPage getAp() {
		if (ap==null) {
			ap= new AdactInLoginPage(driver);
		}
		return ap;
	}
	public AdactInHomePage getAh() {
		if (ah==null) {
			ah=new AdactInHomePage(driver);
		}
		return ah;
	}
}
