package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase16POM {
	private WebDriver driver; 
	
	public TestCase16POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="button-menu")
	private WebElement MenuBtn; 
	
	
	@FindBy(xpath="//*[@id='menu-sale']/a")
	private WebElement SalesBtn; 
	
	@FindBy(xpath="//*[@id='menu-sale']/ul/li[1]/a")
	private WebElement Orders; 
	
	@FindBy(xpath="//*[@id='input-order-id']")
	private WebElement OrderID; 
	
	@FindBy(id="input-customer")
	private WebElement inputCustOrder;
	
	
	public void clickSalesBtn() {
		this.SalesBtn.click(); 
	}
		
	public void clickOders() {
		this.Orders.click(); 	
		
	}
	public void ClickOrderID() {
		this.OrderID.sendKeys("325"); 
	}
	public void inputCustOrder() {
		this.OrderID.clear();
		this.inputCustOrder.sendKeys("reva sharma");
	}
	
	
	
}

