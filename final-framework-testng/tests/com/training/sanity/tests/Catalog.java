package com.training.sanity.tests;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.CatalogPOM;
import com.training.pom.TestCase16POM;
import com.training.pom.TestCase18POM;
//import com.training.pom.ArrayList;
import com.training.pom.ChangeOrderPOM;
//import com.training.pom.List;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import bsh.ParseException;


public class Catalog {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private TestCase16POM TestCase16POM;
	private TestCase18POM TestCase18POM;
	private ChangeOrderPOM ChangeOrderPOM;
	private CatalogPOM CatalogPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@Test (priority =1)
	public void ChangeOrder() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Login");
		TestCase16POM.clickSalesBtn();
		CatalogPOM.CatalogClick();
		CatalogPOM.CategoriesClick();
		CatalogPOM.AddNewClick();
		CatalogPOM.CategoryName();
		CatalogPOM.Description();
		CatalogPOM.Metatitle();
		CatalogPOM.Metadescription();
		CatalogPOM.Save();
		CatalogPOM.CatalogClick();
		CatalogPOM.Products();
		CatalogPOM.ProductAddNew();
		CatalogPOM.ProductInputName();
		CatalogPOM.Metatitle();
		CatalogPOM.Linkstab();
		CatalogPOM.inputcategory();
		CatalogPOM.SelectCategory();
		CatalogPOM.ProductSave();
		
	}
			
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		TestCase16POM = new TestCase16POM(driver);
		TestCase18POM = new TestCase18POM(driver);
		ChangeOrderPOM = new ChangeOrderPOM(driver);
		CatalogPOM = new CatalogPOM(driver);
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


			
}
