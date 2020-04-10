package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase18POM {
	private WebDriver driver; 
	
	public TestCase18POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id='menu-sale']/a")
	private WebElement menuBtn; 
	
	@FindBy(xpath="//*[@id='menu-sale']/ul/li[3]/a")
	private WebElement returnlinkBtn;
	
	@FindBy(id="input-return-id")
	private WebElement returnId;
	
	@FindBy(id="button-filter")
	private WebElement filterId;
	
	@FindBy(id="input-customer")
	private WebElement inputCust;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickmenuBtn() {
		this.menuBtn.click(); 
	}
	public void returnlinkBtn() {
		this.returnlinkBtn.click(); 
	}
	public void returnId() {
		this.returnId.sendKeys("209"); 
	}
	
	public void filterId() {
		this.filterId.click();
	}
	public void inputCust() {
		this.returnId.clear();
		this.inputCust.sendKeys("reva sharma");
	}
}
