package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInSelectHotelPage {
	
	public WebDriver driver;
	
	@FindBy(id="hotel_name_0")
	private WebElement validatethehotel;
	
	@FindBy(id="arr_date_0")
	private WebElement validatecheckindate;
	
	@FindBy(id="dep_date_0")
	private WebElement validatecheckoutdate;
	
	@FindBy(id="rooms_0")
	private WebElement validateNoOfRooms;
	
	@FindBy(id="room_type_0")
	private WebElement validateroomtype;
	
	@FindBy(id="hotel_name_0")
	private WebElement selectedhotelname;
	
	@FindBy(id="location_0")
	private WebElement selectedlocation;
	
	@FindBy(id="room_type_0")
	private WebElement selectedroomtype;
	
	@FindBy(id="no_days_0")
	private WebElement selectednoofdays;
	
	@FindBy(id="price_night_0")
	private WebElement selectedpricepernight;
	
	
	public WebElement getSelectedhotelname() {
		return selectedhotelname;
	}

	public WebElement getSelectedlocation() {
		return selectedlocation;
	}

	public WebElement getSelectedroomtype() {
		return selectedroomtype;
	}

	public WebElement getSelectednoofdays() {
		return selectednoofdays;
	}

	public WebElement getSelectedpricepernight() {
		return selectedpricepernight;
	}

	@FindBy(id="radiobutton_0")
	private WebElement clickselectradiobtn;
	
	@FindBy(id="continue")
	private WebElement clickcontinuebtn;
	
	public WebElement getClickselectradiobtn() {
		return clickselectradiobtn;
	}

	public WebElement getClickcontinuebtn() {
		return clickcontinuebtn;
	}

	public WebElement getValidateroomtype() {
		return validateroomtype;
	}

	public WebElement getValidateNoOfRooms() {
		return validateNoOfRooms;
	}

	public WebElement getValidatecheckindate() {
		return validatecheckindate;
	}

	public WebElement getValidatecheckoutdate() {
		return validatecheckoutdate;
	}

	public AdactInSelectHotelPage(WebDriver hdriver) {
    this.driver=hdriver;
    PageFactory.initElements(driver, this);
	}

	public WebElement getValidatethehotel() {
		return validatethehotel;
	}

	
}
