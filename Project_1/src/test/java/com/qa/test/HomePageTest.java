package com.qa.test;

import org.testng.annotations.BeforeMethod;

import com.qa.base.BaseTest;

public class HomePageTest extends BaseTest {
	HomePageTest homepage;

	HomePageTest(){

		super();	
	}


	@BeforeMethod()
	public void setup()
	{
		homepage= new HomePageTest();
		initialise();

	}

}
