package org.cucumber.adactin.practise.AdactInHotelProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInLoginPage {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernameInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;
	
	@FindBy(id="login")
	private WebElement loginClick;
	
	@FindBy(xpath="//p[text()='Welcome to AdactIn Group of Hotels']")
	private WebElement validhomepageText;
	
	@FindBy(xpath="//input[@value='Hello Mustafa87!']")
	private WebElement verifytheusernameinLoggedInPage;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement userLogout;
	
	public WebElement getVerifytheusernameinLoggedInPage() {
		return verifytheusernameinLoggedInPage;
	}

	public WebElement getUserLogout() {
		return userLogout;
	}

	public AdactInLoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameInput() {
		return usernameInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}

	public WebElement getValidhomepageText() {
		return validhomepageText;
	}

}
