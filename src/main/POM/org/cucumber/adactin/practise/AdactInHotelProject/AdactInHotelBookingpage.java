package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInHotelBookingpage {
	
	public WebDriver driver;
	
	@FindBy(id="total_days_dis")
	private WebElement totaldays;
	
	@FindBy(id="price_night_dis")
	private WebElement pricePerNight;
	
	@FindBy(id="total_price_dis")
	private WebElement totalPrice;
	
	@FindBy(id="final_price_dis")
	private WebElement finalprice;
	
	
	@FindBy(id="hotel_name_dis")
	private WebElement bookedHotelName;
	
	@FindBy(id="location_dis")
	private WebElement bookedLocation;
	
	@FindBy(id="room_type_dis")
	private WebElement bookedRoomType;
	
	@FindBy(id="total_days_dis")
	private WebElement bookedNoofDays;
	
	@FindBy(id="price_night_dis")
	private WebElement bookedPriceperNight;
	
	
	public WebElement getBookedHotelName() {
		return bookedHotelName;
	}

	public WebElement getBookedLocation() {
		return bookedLocation;
	}

	public WebElement getBookedRoomType() {
		return bookedRoomType;
	}

	public WebElement getBookedNoofDays() {
		return bookedNoofDays;
	}

	public WebElement getBookedPriceperNight() {
		return bookedPriceperNight;
	}

	public WebElement getFinalprice() {
		return finalprice;
	}

	@FindBy(id="first_name")
	private WebElement firstnameInBookingPage;
	
	@FindBy(id="last_name")
	private WebElement lastnameInBookingPage;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement Creditcardnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	
	@FindBy(id="book_now")
	private WebElement booknowbtn;
	
	@FindBy(id="logout")
	private WebElement logoutfrombookingconfirmation;
	
	public WebElement getLogoutfrombookingconfirmation() {
		return logoutfrombookingconfirmation;
	}

	public WebElement getValidatesuccessfullogout() {
		return validatesuccessfullogout;
	}

	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement validatesuccessfullogout;
	
	public WebElement getFirstnameInBookingPage() {
		return firstnameInBookingPage;
	}

	public WebElement getLastnameInBookingPage() {
		return lastnameInBookingPage;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardnum() {
		return Creditcardnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknowbtn() {
		return booknowbtn;
	}

	public AdactInHotelBookingpage(WebDriver idriver) {
    this.driver=idriver;
    PageFactory.initElements(driver, this);
	}

	public WebElement getTotaldays() {
		return totaldays;
	}

	public WebElement getPricePerNight() {
		return pricePerNight;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}
	
	
	

}
