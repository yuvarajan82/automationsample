package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TestCase16POM;
import com.training.pom.TestCase18POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase16 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private TestCase16POM TestCase16POM;
	private TestCase18POM TestCase18POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		TestCase16POM = new TestCase16POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validTestCase16() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Login");
		TestCase16POM.clickSalesBtn();
		TestCase16POM.clickOders();
		TestCase16POM.ClickOrderID();
		TestCase18POM.filterId();
		screenShot.captureScreenShot("OrderID");
		TestCase16POM.inputCustOrder();
		TestCase18POM.filterId();
		screenShot.captureScreenShot("CustomerID");
	}
}
