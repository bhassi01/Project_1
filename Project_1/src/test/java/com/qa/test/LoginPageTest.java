package com.qa.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	 LoginPage loginpage;
	 HomePage homepage;

	LoginPageTest() {
		super();
	}

	@BeforeMethod()
	public void setup() {
		initialise();
		loginpage = new LoginPage();
	}
	
	@Test
	public void check_image_Test()
	{
	Boolean value =loginpage.checkimage();
	Assert.assertTrue(value);
		
	}
	@Test
	public void check_Title_Test() {
		String Title=loginpage.Get_Title();
		Assert.assertEquals(Title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test()
	public HomePage Login_Btn_click_Test() {
		 homepage =loginpage.Login_Btn_Click();
		 return  new HomePage();
	}
	
	
	
	@AfterMethod()
	public void teardown(){
		driver.quit();
		
	}

}
