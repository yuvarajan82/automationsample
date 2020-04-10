package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeOrderPOM {
	private WebDriver driver; 
	
	public ChangeOrderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@id='form-order']/div/table/tbody/tr[3]/td[8]/a[2]")
	private WebElement EditBtn; 
	
	@FindBy(id="button-customer")
	private WebElement Customerbtn;

	@FindBy(xpath="//*[@id='cart']/tr/td[6]/button")
	private WebElement RemoveBtn; 
	
	@FindBy(id="input-product")
	private WebElement InputProduct;
	
	@FindBy(id="input-quantity")
	private WebElement InputQty;
	
	@FindBy(id="button-product-add")
	private WebElement Productadd;

	@FindBy(id="button-cart")
	private WebElement CartContinue;
	
	@FindBy(id="button-payment-address")
	private WebElement PaymentAddress;
	
	@FindBy(id="button-save")
	private WebElement SaveBtn;
	
	

	public void ClicEditBtn() {
		this.EditBtn.click();
	}
	public void ClickCustomerbtn() {
		this.Customerbtn.click();
	}
	public void ClickRemoveBtn() {
		this.RemoveBtn.click();
	}
	public void ClickInputProduct() {
		this.InputProduct.sendKeys("Car");
	}
	public void ClickInputQty() {
		this.InputQty.clear();
		this.InputQty.sendKeys("1");
	}
	public void ClickProductadd() {
		this.Productadd.click();
		
	}
	public void ClickCartContinue() {
		this.CartContinue.click();
		
	}
	public void ClickPaymentAddress() {
		this.PaymentAddress.click();
		
	}
	public void ClickSaveBtn() {
		this.SaveBtn.click();
		
	}

}

