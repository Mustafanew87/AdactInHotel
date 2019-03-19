package org.maven.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.maven.helper.FileReaderManager;
import org.maven.resource.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions/*(plugin = *//*{*/ /*"pretty",

		"html:src\\recourse\\java\\com\\msven\\reports",

		"junit:src\\recourse\\java\\com\\msven\\reports\\cucumber.xml",

		"json:src\\recourse\\java\\com\\msven\\reports\\cucumber.json" },*/

		(features = "src\\test\\java\\org\\maven\\feature\\", tags = {
				"@TC" }, glue = "org.maven.adactinstepdefinition", dryRun = false, monochrome = true)

public class TestRunnerAdactIn {

	public static WebDriver driver;

	@BeforeClass
	public static void browerlaunch() throws Throwable {
		String browserName = FileReaderManager.getInstance().getConfigReader().getBrowserName();
		System.out.println(browserName);
		driver = BaseClass.getbrowser(browserName);
	}

	@AfterClass
	public static void browerqui() {
		driver.quit();
	}

}
