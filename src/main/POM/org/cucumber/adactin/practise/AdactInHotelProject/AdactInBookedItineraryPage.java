package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInBookedItineraryPage {
	
	public WebDriver driver;
	
	@FindBy(linkText="Booked Itinerary")
	private WebElement bookeditilink;
	
	@FindBy(id="order_id_text")
	private WebElement bookeditisearch;
	
	@FindBy(id="search_hotel_id")
	private WebElement bookeditigobtn;
	
	@FindBy(xpath="//form[@id='booked_form']/table[@class='login']//tbody/tr[2]/td/table/tbody/tr[2]/td/input")
	private WebElement webtableDatas;
	
	public WebElement getWebtableDatas() {
		return webtableDatas;
	}

	public WebElement getBookeditilink() {
		return bookeditilink;
	}

	public WebElement getBookeditisearch() {
		return bookeditisearch;
	}

	public WebElement getBookeditigobtn() {
		return bookeditigobtn;
	}

	public WebElement getBookeditiorderid() {
		return bookeditiorderid;
	}

	@FindBy(id="order_id_291431")
	private WebElement bookeditiorderid;
	
	public AdactInBookedItineraryPage(WebDriver odriver) {
	this.driver=odriver;
	PageFactory.initElements(driver, this);
	}

}
