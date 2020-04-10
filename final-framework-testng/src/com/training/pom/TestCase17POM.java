package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase17POM {
	private WebDriver driver; 
	
	public TestCase17POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='form-order']/div/table/tbody/tr[5]/td[1]/input[1]")
	private WebElement CheckBox; 
	
	
	@FindBy(id="button-delete")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]")
	private WebElement AlertSuccess;
	
		
	public void clickCheckBox() {
		this.CheckBox.click(); 		
	}
	public void clickDelete() {
		this.DeleteBtn.click(); 		
	}
	public void AlertSuccess() {
		this.AlertSuccess.getText(); 	
	}

	
	
	
}

