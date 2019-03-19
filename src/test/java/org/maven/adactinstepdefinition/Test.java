package org.maven.adactinstepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@When("^User Enter Valid address with List$")
	public void user_Enter_Valid_address_with_List(DataTable arg1) throws Throwable {
		List<List<String>> raw = arg1.raw();
		System.out.println(raw.get(0).get(0));
		System.out.println(raw.get(0).get(1));
		System.out.println(raw.get(0).get(2));
		System.out.println(raw.get(1).get(0));

	}

	@Then("^Validate entered data$")
	public void validate_entered_data() throws Throwable {

	}

	@When("^User Enter Valid address with Map$")
	public void user_Enter_Valid_address_with_Map(DataTable arg1) throws Throwable {
		List<Map<String,String>> asMaps = arg1.asMaps(String.class, String.class);
		System.out.println(asMaps.get(1).get("DoorNO"));
		System.out.println(asMaps.get(1).get("City"));
		System.out.println(asMaps.get(0).get("State"));

	
	}


}
