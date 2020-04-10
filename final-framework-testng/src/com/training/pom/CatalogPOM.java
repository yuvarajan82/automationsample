package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CatalogPOM {
	private WebDriver driver; 
	
	public CatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='menu-catalog']/a")
	private WebElement CatalogClick; 
	
	@FindBy(xpath="//*[@id='menu-catalog']/ul/li[1]/a")
	private WebElement CategoriesClick; 
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a[1]")
	private WebElement AddNewClick; 
	
	@FindBy(id="input-name1")
	private WebElement CategoryName;
	
	@FindBy(xpath="//*[@id='language1']/div[2]/div/div/div[3]/div[2]")
	private WebElement Description; 
	
	@FindBy(id="input-meta-description1")
	private WebElement Metadescription;
	
	@FindBy(id="input-meta-title1")
	private WebElement Metatitle;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement Save; 
	
	@FindBy(xpath="//*[@id='menu-catalog']/ul/li[2]/a")
	private WebElement Products; 
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement ProductAddNew; 
	
	@FindBy(id="input-name1")
	private WebElement ProductInputName;
	
	@FindBy(xpath="//*[@id='form-product']/ul/li[3]/a")
	private WebElement Linkstab; 
	
	@FindBy(id="input-category")
	private WebElement inputcategory;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement ProductSave; 
	

	public void CatalogClick() {
	this.CatalogClick.click();

	}
	
	public void CategoriesClick() {
	this.CategoriesClick.click();

	}
	
	public void AddNewClick() {
	this.AddNewClick.click();
	
	}
	
	public void CategoryName() {
	this.CategoryName.sendKeys("CategoryName");
	}
	
	public void Metatitle() {
	this.Metatitle.sendKeys("Metatitle");
	}

	public void Metadescription() {
	this.Metadescription.sendKeys("Metadescription");
	}
	
	public void Description() {
	this.Description.sendKeys("Description");
	}
	
	public void Save() {
	this.Save.click();
	}
	
	public void Products() {
	this.Products.click();
	}
	
	public void ProductAddNew() {
	this.ProductAddNew.click();
	}
	
	public void ProductInputName() {
	this.ProductInputName.sendKeys("ProductInputName");
	}
	
	public void Linkstab() {
	this.Linkstab.click();
	}
	
	public void inputcategory() {
	this.inputcategory.click();
	}
	
	public void SelectCategory() {
		
	List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='tab-links']/div[2]/div/ul/li[1]/a"));
	Actions actions = new Actions(driver);
	actions.keyDown(Keys.CONTROL).click(selectable.get(0)).build().perform();
	
	}

	public void ProductSave() {
	this.ProductSave.click();
	}

}



