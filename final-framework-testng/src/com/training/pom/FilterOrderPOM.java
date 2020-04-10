package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterOrderPOM {
	private WebDriver driver; 
	
	public FilterOrderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@id='content']/div[2]/div/div[2]/div[1]/div/div[3]/div[2]/div/span/button")
	private WebElement ClickDate; 
	
	
	@FindBy(id="input-total")
	private WebElement InputTotal;
	
	@FindBy(id="input-customer")
	private WebElement inputCust;


	public void OrderStatus() {
		WebElement dropDown = driver.findElement(By.id("input-order-status"));
		Select drop = new Select(dropDown);
		drop.selectByValue("1");
	}
	
	public void selectDateAdded() {
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[2]/div[1]/div/div[3]/div[1]/div/span/button")).click();
	}
	
	public void ClickDateAdded() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/table/tbody/tr[5]/td[4]")).click();
	}
	
	public void selectDateModify() {
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[2]/div[1]/div/div[3]/div[2]/div/span/button")).click();
	}
	
	public void ClickDateModify() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[5]/td[4]")).click();
	}

	public void ClickTotal() {
		
		this.InputTotal.sendKeys("1545");
	}
	
	public void inputCust() {
		this.inputCust.sendKeys("reva sharma");
	}
}

