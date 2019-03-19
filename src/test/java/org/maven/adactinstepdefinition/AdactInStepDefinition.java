package org.maven.adactinstepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.cucumber.adactin.practise.AdactInHotelProject.PageObjectManagerAdactIn;
import org.junit.Assert;
import org.maven.POM.PageObjectManager;
import org.maven.helper.FileReaderManager;
import org.maven.resource.BaseClass;
import org.maven.runner.TestRunnerAdactIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactInStepDefinition extends BaseClass {

	public static WebDriver driver = TestRunnerAdactIn.driver;
	public static PageObjectManagerAdactIn pa = new PageObjectManagerAdactIn(driver);
	public static String hotelinput;
	public static String actualdate;
	public static String actualdate1;
	public static String roomtype;
	public static String orderconfrm;

	@Given("^User should launch the browser$")
	public void user_should_launch_the_browser() throws Throwable {
		String url = FileReaderManager.getInstance().getConfigReader().getURL();
		getUrl(url);

	}

	@Given("^User hold for '(.*)' seconds1$")
	public void user_hold_for_seconds1(int arg1) throws Throwable {
		Thread.sleep(arg1 * 1000);
	}

	@Then("^User should verify the Welcome to AdactIn Group of Hotels is displayed$")
	public void user_should_verify_the_Welcome_to_AdactIn_Group_of_Hotels_is_displayed() throws Throwable {
		String actual = getElementText(pa.getAp().getValidhomepageText());
		Assert.assertEquals("Welcome to AdactIn Group of Hotels", actual.trim());
	}

	@When("^User should enter the username in the login page$")
	public void user_should_enter_the_username_in_the_login_page() throws Throwable {
		inputValueMethod(pa.getAp().getUsernameInput(), "Mustafa87");

	}

	@When("^User should enter the passward in the login page$")
	public void user_should_enter_the_passward_in_the_login_page() throws Throwable {
		inputValueMethod(pa.getAp().getPasswordInput(), "password");

	}

	@When("^User clicks the Login button in the login page$")
	public void user_clicks_the_Login_button_in_the_login_page() throws Throwable {
		elementClick(pa.getAp().getLoginClick());

	}

	@When("^User hold for '(.*)' seconds$")
	public void user_hold_for_seconds(int arg1) throws Throwable {

		Thread.sleep(arg1 * 1000);
	}

	@When("^User click the signout to exit from the loggin page$")
	public void user_click_the_signout_to_exit_from_the_loggin_page() throws Throwable {
		elementClick(pa.getAp().getUserLogout());

	}

	@When("^User should close the browser$")
	public void user_should_close_the_browser() throws Throwable {
		driverQuit();

	}

	@When("^User selects the location$")
	public void user_selects_the_location() throws Throwable {
		elementClick(pa.getAh().getLocationdropdown());
		selectValueFromDD(pa.getAh().getLocationdropdown(), "index", "1");
	}

	@When("^User Selects the hotels$")
	public void user_Selects_the_hotels() throws Throwable {
		elementClick(pa.getAh().getHoteldropdown());
		selectValueFromDD(pa.getAh().getHoteldropdown(), "index", "1");

	}

	@When("^User selects the roomtype$")
	public void user_selects_the_roomtype() throws Throwable {
		elementClick(pa.getAh().getRoomtypedropdown());
		selectValueFromDD(pa.getAh().getRoomtypedropdown(), "index", "1");
	}

	@When("^User selects the Number of rooms$")
	public void user_selects_the_Number_of_rooms() throws Throwable {
		elementClick(pa.getAh().getNumberofroomsdropdown());
		selectValueFromDD(pa.getAh().getNumberofroomsdropdown(), "index", "1");
	}

	@When("^User enters the check in date$")
	public void user_enters_the_check_in_date() throws Throwable {
		inputValueMethod(pa.getAh().getCheckIndropdown(), "19/03/2019");
	}

	@When("^User enters the check out date$")
	public void user_enters_the_check_out_date() throws Throwable {
		inputValueMethod(pa.getAh().getCheckOutdropdown(), "17/03/2019");
	}

	@When("^User selects the Adults per room options$")
	public void user_selects_the_Adults_per_room_options() throws Throwable {
		selectValueFromDD(pa.getAh().getAdultroomdropdown(), "index", "1");
	}

	@When("^User selects the children per room$")
	public void user_selects_the_children_per_room() throws Throwable {
		selectValueFromDD(pa.getAh().getChildrendropdown(), "index", "1");
	}

	@When("^User click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		elementClick(pa.getAh().getSubmitbutton());
	}

	@Then("^User verify the check in and check out message is displayed$")
	public void user_verify_the_check_in_and_check_out_message_is_displayed() throws Throwable {
		String actualerror = getElementText(pa.getAh().getCheckinerrormessage());
		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", actualerror.trim());
	}

	@Then("^User enters the check in date as today and past five dates$")
	public void user_enters_the_check_in_date_as_today_and_past_five_dates() throws Throwable {
		inputValueMethod(pa.getAh().getCheckIndropdown(), "11/03/2019");
	}

	@Then("^User enters the check out date as today and past three dates$")
	public void user_enters_the_check_out_date_as_today_and_past_three_dates() throws Throwable {
		inputValueMethod(pa.getAh().getCheckOutdropdown(), "09/03/2019");
	}

	@Then("^User verifies the application throws the date mismatch as post dated$")
	public void user_verifies_the_application_throws_the_date_mismatch_as_post_dated() throws Throwable {
		String actual = getElementText(pa.getAh().getCheckouterrormessage());
		Assert.assertEquals("Check-Out Date shall be after than Check-In Date", actual.trim());
	}

	@Then("^User enters the check in date as todays date$")
	public void user_enters_the_check_in_date_as_todays_date() throws Throwable {
		inputValueMethod(pa.getAh().getCheckIndropdown(), "16/04/2019");
		actualdate = getElementAttributetext(pa.getAh().getCheckIndropdown());

	}

	@Then("^User enters the check out date as next date$")
	public void user_enters_the_check_out_date_as_next_date() throws Throwable {
		inputValueMethod(pa.getAh().getCheckOutdropdown(), "17/04/2019");
		actualdate1 = getElementAttributetext(pa.getAh().getCheckOutdropdown());

	}

	@Then("^User selects no children per room$")
	public void user_selects_no_children_per_room() throws Throwable {
		elementClick(pa.getAh().getChildrendropdown());
		selectValueFromDD(pa.getAh().getChildrendropdown(), "index", "0");
	}

	@When("^User Selects the hotels creek$")
	public void user_Selects_the_hotels_creek() throws Throwable {
		elementClick(pa.getAh().getHoteldropdown());
		selectValueFromDD(pa.getAh().getHoteldropdown(), "index", "1");
		hotelinput = getElementAttributetext(pa.getAh().getHoteldropdown());
	}

	@Then("^User verifies that hotel displayed is the same as selected in search Hotel form$")
	public void user_verifies_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		String validate = getElementAttributetext(pa.getAs().getValidatethehotel());
		Assert.assertEquals(hotelinput, validate);
	}

	@Then("^User verifies that hotel displayed the check in dated is same as search hotel form$")
	public void user_verifies_that_hotel_displayed_the_check_in_dated_is_same_as_search_hotel_form() throws Throwable {
		String validatedate = getElementAttributetext(pa.getAs().getValidatecheckindate());
		Assert.assertEquals(actualdate, validatedate);
	}

	@Then("^User verifies that hotel displayed the check out dated is same as search hotel form$")
	public void user_verifies_that_hotel_displayed_the_check_out_dated_is_same_as_search_hotel_form() throws Throwable {
		String validatecheckoutdate = getElementAttributetext(pa.getAs().getValidatecheckoutdate());
		Assert.assertEquals(actualdate1, validatecheckoutdate);
	}

	@Then("^User selects the Number of rooms as '(\\d+)'$")
	public void user_selects_the_Number_of_rooms_as(String arg1) throws Throwable {
		elementClick(pa.getAh().getNumberofroomsdropdown());
		selectValueFromDD(pa.getAh().getNumberofroomsdropdown(), "index", arg1);
	}

	@Then("^User verifies the number of rooms is displayed is same as the search hotel form '(\\d+)'$")
	public void user_verifies_the_number_of_rooms_is_displayed_is_same_as_the_search_hotel_form(String arg1)
			throws Throwable {
		String validaterooms = getElementAttributetext(pa.getAs().getValidateNoOfRooms());
		if (validaterooms.contains(arg1)) {
			System.out.println("Same Room Number");
		} else {
			System.out.println("Room Number is not same");
		}
	}

	@When("^User selects the roomtype as deluxe$")
	public void user_selects_the_roomtype_as_deluxe() throws Throwable {
		selectValueFromDD(pa.getAh().getRoomtypedropdown(), "index", "3");
		roomtype = getElementAttributetext(pa.getAh().getRoomtypedropdown());
	}

	@Then("^User verifies the room type is displayed is same as the search hotel form$")
	public void user_verifies_the_room_type_is_displayed_is_same_as_the_search_hotel_form() throws Throwable {
		String validateroomtype = getElementAttributetext(pa.getAs().getValidateroomtype());
		Assert.assertEquals(roomtype, validateroomtype);
	}

	@When("^User selects number of rooms as two '(\\d+)'$")
	public void user_selects_number_of_rooms_as_two(String arg1) throws Throwable {
		selectValueFromDD(pa.getAh().getNumberofroomsdropdown(), "index", arg1);
	}

	@Then("^User selects radio button to select the displayed hotel$")
	public void user_selects_radio_button_to_select_the_displayed_hotel() throws Throwable {
		elementClick(pa.getAs().getClickselectradiobtn());
	}

	@Then("^User click the continue buttons to submit$")
	public void user_click_the_continue_buttons_to_submit() throws Throwable {
		elementClick(pa.getAs().getClickcontinuebtn());
	}

	@Then("^User verfies the total price for the rooms excluding gst '(\\d+)'$")
	public void user_verfies_the_total_price_for_the_rooms_excluding_gst(String arg1) throws Throwable {
		String totaldays = getElementAttributetext(pa.getAb().getTotaldays());
		String pricePerNight = getElementAttributetext(pa.getAb().getPricePerNight());
		String totalprice = getElementAttributetext(pa.getAb().getTotalPrice());
		String trimdays = totaldays.substring(0, 1).trim();
		System.out.println(trimdays);
		String trimppnight = pricePerNight.substring(5).trim();
		System.out.println(trimppnight);
		int total = Integer.parseInt(trimdays) * Integer.parseInt(trimppnight) * Integer.parseInt(arg1);
		String pricevalidate = String.valueOf(total);
		if (totalprice.contains(pricevalidate)) {
			System.out.println("Entered Price is Validated");
		} else {
			System.out.println("Entered Price is Not Valid");
		}
	}

	@Then("^User enters the first name$")
	public void user_enters_the_first_name() throws Throwable {
		inputValueMethod(pa.getAb().getFirstnameInBookingPage(), "Mohamed");
	}

	@Then("^User Enters the last name$")
	public void user_Enters_the_last_name() throws Throwable {
		inputValueMethod(pa.getAb().getLastnameInBookingPage(), "Mustafa");
	}

	@Then("^User enters the Billing Address$")
	public void user_enters_the_Billing_Address() throws Throwable {
		inputValueMethod(pa.getAb().getAddress(), "No.21, Anna Nagar, Chennai");
	}

	@Then("^User enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
		inputValueMethod(pa.getAb().getCreditcardnum(), "4321123467899876");
	}

	@Then("^User selects the Credit card type$")
	public void user_selects_the_Credit_card_type() throws Throwable {
		elementClick(pa.getAb().getCctype());
		selectValueFromDD(pa.getAb().getCctype(), "index", "3");
	}

	@Then("^User selects the expiry month$")
	public void user_selects_the_expiry_month() throws Throwable {
		elementClick(pa.getAb().getExpmonth());
		selectValueFromDD(pa.getAb().getExpmonth(), "index", "4");
	}

	@Then("^User selects the expirty year$")
	public void user_selects_the_expirty_year() throws Throwable {
		elementClick(pa.getAb().getExpyear());
		selectValueFromDD(pa.getAb().getExpyear(), "index", "10");
	}

	@Then("^User enters the cvv number$")
	public void user_enters_the_cvv_number() throws Throwable {
		inputValueMethod(pa.getAb().getCvvnum(), "123");
	}

	@Then("^user click the book now button$")
	public void user_click_the_book_now_button() throws Throwable {
		elementClick(pa.getAb().getBooknowbtn());
	}

	@Then("^User click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
		elementClick(pa.getAb().getLogoutfrombookingconfirmation());
	}

	@Then("^User validate the page is succesfully logout from the application '\"([^\"]*)\"'$")
	public void user_validate_the_page_is_succesfully_logout_from_the_application(String arg1) throws Throwable {
		String validlogout = getElementText(pa.getAb().getValidatesuccessfullogout()).trim();
		Assert.assertEquals(validlogout, arg1);
	}

	@Then("^User verfies the total price for the rooms including gst '(\\d+)'$")
	public void user_verfies_the_total_price_for_the_rooms_including_gst(String arg1) throws Throwable {
		String totaldays = getElementAttributetext(pa.getAb().getTotaldays());
		String pricePerNight = getElementAttributetext(pa.getAb().getPricePerNight());
		String totalprice = getElementAttributetext(pa.getAb().getTotalPrice());
		String finalprice = getElementAttributetext(pa.getAb().getFinalprice());
		String trimdays = totaldays.substring(0, 1).trim();
		System.out.println(trimdays);
		String trimppnight = pricePerNight.substring(5).trim();
		System.out.println(trimppnight);
		int total = Integer.parseInt(trimdays) * Integer.parseInt(trimppnight) * Integer.parseInt(arg1);
		int gst = total / 10;
		String pricevalidate = String.valueOf(total + gst);
		System.out.println(pricevalidate);
		if (finalprice.contains(pricevalidate)) {
			System.out.println("Entered Price is Validated");
		} else {
			System.out.println("Entered Price is Not Valid");
		}
	}

	@Then("^User verfies all the data enter is correct '\"([^\"]*)\"','\"([^\"]*)\"','\"([^\"]*)\"','(\\d+)','\"([^\"]*)\"'$")
	public void user_verfies_all_the_data_enter_is_correct(String arg1, String arg2, String arg3, int arg4, String arg5)
			throws Throwable {
		String bookedhotel = getElementAttributetext(pa.getAb().getBookedHotelName());
		Assert.assertEquals(bookedhotel, arg1);

		String bookedroomtype = getElementAttributetext(pa.getAb().getBookedRoomType());
		Assert.assertEquals(bookedroomtype, arg2);

		String bookedlocation = getElementAttributetext(pa.getAb().getBookedLocation());
		Assert.assertEquals(bookedlocation, arg3);

		String bookeddays = getElementAttributetext(pa.getAb().getBookedNoofDays());
		String days = bookeddays.substring(0, 1);
		String daysvalue = String.valueOf(arg4);
		if (days.contains(daysvalue)) {
			System.out.println("No fo days: " + days);
		} else {
			System.out.println("Not a Valid Entry");
		}

		String bookedprcpernight = getElementAttributetext(pa.getAb().getPricePerNight());
		String priceper = bookedprcpernight.substring(5).trim();
		if (bookedprcpernight.contains(priceper)) {
			System.out.println("Verification is Successful");
		} else {
			System.out.println("Verfication is Invalid");
		}
	}

	@When("^User selects number of rooms as one '(\\d+)'$")
	public void user_selects_number_of_rooms_as_one(String arg1) throws Throwable {
		selectValueFromDD(pa.getAh().getNumberofroomsdropdown(), "index", arg1);
	}

	@Then("^User verfies the total price for one room including gst '(\\d+)'$")
	public void user_verfies_the_total_price_for_one_room_including_gst(String arg1) throws Throwable {
		String totaldays = getElementAttributetext(pa.getAb().getTotaldays());
		String pricePerNight = getElementAttributetext(pa.getAb().getPricePerNight());
		String totalprice = getElementAttributetext(pa.getAb().getTotalPrice());
		String finalprice = getElementAttributetext(pa.getAb().getFinalprice());
		String trimdays = totaldays.substring(0, 1).trim();
		System.out.println(trimdays);
		String trimppnight = pricePerNight.substring(5).trim();
		System.out.println(trimppnight);
		float total = Float.parseFloat(trimdays) * Float.parseFloat(trimppnight) * Float.parseFloat(arg1);
		System.out.println(total);
		float gst = total / 10;
		System.out.println(gst);
		String pricevalidate = String.valueOf(total + gst);
		System.out.println(pricevalidate);
		if (finalprice.contains(pricevalidate)) {
			System.out.println("Entered Price is Validated: " + pricevalidate);
		} else {
			System.out.println("Entered Price is Not Valid");
		}
	}

	@Then("^User verfies the selected value in search page and is displayed in booking page is same'\"([^\"]*)\"','\"([^\"]*)\"','(\\d+)','\"([^\"]*)\"','\"([^\"]*)\"','\"([^\"]*)\"'$")
	public void user_verfies_the_selected_value_in_search_page_and_is_displayed_in_booking_page_is_same(String arg1,
			String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		String conhotelname = getElementAttributetext(pa.getAc().getConfirmedhotelname());
		Assert.assertEquals(conhotelname, arg6);

		String conroomtyp = getElementAttributetext(pa.getAc().getConfirmedroomtype());
		Assert.assertEquals(conroomtyp, arg5);

		String concheckin = getElementAttributetext(pa.getAc().getConfirmedcheckin());
		Assert.assertEquals(concheckin, arg1);

		String concheckout = getElementAttributetext(pa.getAc().getConfirmedcheckout());
		Assert.assertEquals(concheckout, arg2);

		String conadultroom = getElementAttributetext(pa.getAc().getConfirmedadultrooms());
		if (conadultroom.contains(arg3)) {
			System.out.println("Seleted Adult Rooms: " + conadultroom);
		} else {
			System.out.println("Mismatch in Adult Rooms");
		}

		String conchildersroom = getElementAttributetext(pa.getAc().getConfirmedchildren());
		if (arg4.contains(conchildersroom)) {
			System.out.println(arg4);
		} else {
			System.out.println("Children Selected Not Valid");
		}
	}

	@Then("^User verfies the order number is generated$")
	public void user_verfies_the_order_number_is_generated() throws Throwable {
		orderconfrm = getElementAttributetext(pa.getAc().getConfirmedorderno());
		if (orderconfrm != null) {
			System.out.println("Order Number is Generated: " + orderconfrm);
		} else {
			System.out.println("Order Number Not Verified");
		}
	}

	@Then("^User click the my itinerary button$")
	public void user_click_the_my_itinerary_button() throws Throwable {
		elementClick(pa.getAi().getBookeditilink());
	}

	@Then("^User enters the order id in the search field and click go button$")
	public void user_enters_the_order_id_in_the_search_field_and_click_go_button() throws Throwable {
		inputValueMethod(pa.getAi().getBookeditisearch(), orderconfrm);
		// System.out.println(orderconfrm);
		elementClick(pa.getAi().getBookeditigobtn());
	}

	@Then("^User verified the order ID details$")
	public void user_verified_the_order_ID_details() throws Throwable {
		List<WebElement> datas = driver.findElements(
				By.xpath("//form[@id='booked_form']/table[@class='login']//tbody/tr[2]/td/table/tbody/tr[2]/td/input"));
		for (int i = 1; i < datas.size(); i++) {
			String value = getElementAttributetext(datas.get(i));
			System.out.println(value);
			setValuetoExcel("AdactInItineraryPage", "AdactInItin", 1, i - 1, value);
		}
	}

}
