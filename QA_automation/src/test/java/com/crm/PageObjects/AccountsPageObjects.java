package com.crm.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.objectrepo.Crmor;

public class AccountsPageObjects {
	WebDriver driver;
	Crmor crmobjects = new Crmor();
	
	
	String accountsNameXpath= crmobjects.getObjects().getProperty("login_accounts_account_name_Verify");
	public String accountsNameValidation(String accountName) throws InterruptedException{
		String Xpath=accountsNameXpath.replace("<Account_Name>", accountName);
		System.out.println("Xpath : "+Xpath);
		Thread.sleep(20000);
		this.driver = driver;
		return driver.findElement(By.xpath(Xpath)).getText();

	}
	
	public String accountNamecss() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div")).getText();
		
	}
}
