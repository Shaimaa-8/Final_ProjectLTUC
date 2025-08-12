package tests;

import org.testng.annotations.Test;

import Pages.myFinalProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;


import utils.DriverFactory;

public class userTest {
	 WebDriver driver;
	 myFinalProject MyFinalProject;
	 @BeforeTest
	    public void setup() {
	        driver = DriverFactory.getDriver();
	        driver.get("https://jebnalak.com/");
	        MyFinalProject = new myFinalProject(driver);
	    }
	 @Test (priority = 1 , enabled = true)
	 public void myAccount() {
		MyFinalProject.Actions();
	 }
}
