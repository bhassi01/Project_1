package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class LoginPage extends BaseTest {


	//Using @findBy annotations from Pagefactory

	@FindBy(xpath="//img [@alt='Flipkart']")
	WebElement PageImage;

	@FindBy(xpath="//input[@type='text' and @ name ='q']")
	WebElement Searchbar;

	@FindBy(xpath="//a[@class='_3Ep39l' and @href='/account/login?ret=/']")
	WebElement LoginBtn;

	//Initialsing Page Factory
	public LoginPage()
	{
		PageFactory.initElements(driver, this);

	}
	//Defining ACTIONS

	public Boolean checkimage() {
		return PageImage.isDisplayed();
	}

	public Boolean SearchBar() {
		return Searchbar.isEnabled();
	}

	public LoginPage Login_Btn_Click() {
		return new LoginPage();}

	public String Get_Title() {
		return driver.getTitle();
	}
	




}





