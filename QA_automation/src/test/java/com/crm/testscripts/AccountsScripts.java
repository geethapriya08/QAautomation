package com.crm.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.services.Crmservices;
import com.crm.testdata.ApplicationData;
import com.crm.utils.CommonUtils;
import com.crm.validators.CrmValidator;

public class AccountsScripts {
	public static String accountsUsername;

	ApplicationData accountsData = new ApplicationData();
	Crmservices crmservices = new Crmservices();

	CrmValidator validator = new CrmValidator();

	@BeforeClass
	public void init() throws InterruptedException {
		crmservices.opencrmApplication();

		crmservices.loginCrmApplication(accountsData.appData("Login").getRow(1).getCell(0).getStringCellValue(), accountsData.appData("Login").getRow(1).getCell(1).getStringCellValue());
		//crmservices.loginCrmApplication("admin", "admin");
		
	}

	//@Test
	public void createAccount() throws InterruptedException {
		crmservices.clickDashboardAccount().clickCreateAccountButton();
//		crmservices.enterAccountName(accountsData.appData("CreateAccount").getRow(1).getCell(0).getStringCellValue());
//		crmservices.enterAccountEmailid(accountsData.appData("CreateAccount").getRow(1).getCell(1).getStringCellValue());
//		crmservices.enterAccountPhoneNumber(accountsData.appData("CreateAccount").getRow(1).getCell(2).getStringCellValue());
//		crmservices.enterAccountWebsite(accountsData.appData("CreateAccount").getRow(1).getCell(3).getStringCellValue());
//		crmservices.enterBillingAddressDetails(accountsData.appData("BillingAddress").getRow(1).getCell(0).getStringCellValue(),accountsData.appData("BillingAddress").getRow(1).getCell(1).getStringCellValue(),accountsData.appData("BillingAddress").getRow(1).getCell(2).getStringCellValue(),accountsData.appData("BillingAddress").getRow(1).getCell(3).getStringCellValue(),accountsData.appData("BillingAddress").getRow(1).getCell(4).getStringCellValue());
//		crmservices.enterShippingAddress(accountsData.appData("ShippingAddress").getRow(1).getCell(0).getStringCellValue(), accountsData.appData("ShippingAddress").getRow(1).getCell(1).getStringCellValue(), accountsData.appData("ShippingAddress").getRow(1).getCell(2).getStringCellValue(), accountsData.appData("ShippingAddress").getRow(1).getCell(3).getStringCellValue(), accountsData.appData("ShippingAddress").getRow(1).getCell(4).getStringCellValue());
//		
//		crmservices.enterDetails(accountsData.appData("DetailSection").getRow(1).getCell(0).getStringCellValue(),accountsData.appData("DetailSection").getRow(1).getCell(1).getStringCellValue());
		
		accountsUsername = "geetha" + CommonUtils.randomNumberGenerate(2);
		crmservices.enterAccountName(accountsUsername);
		crmservices.enterAccountEmailid("y.geethapriya@gmail.com");
		crmservices.enterAccountPhoneNumber("8686609500");
		crmservices.enterAccountWebsite("y.geethapriya@gmail.com");
	    crmservices.enterBillingAddressDetails("sai ram nagar", "hyderabad", "Telangana", "500049", "india");
		crmservices.enterShippingAddress("rammanagar", "secundrabad", "Andhrapradesh", "500000", "india");
		crmservices.clickCopyBillingButton();
		crmservices.clickSaveButton();
		//validator.accountsDetailPageValidation();
		
		
	}
	@Test
	public void createcontacts() {
		//create contact
				crmservices.clickDashboardContacts();
				crmservices.clickCreateAccounButton();
				//crmservices.enterCreateContactsDetails("geetha", "priya", "geethapriya@gmail.com", "9870685030", "Sairam", "Hyd", "Telangana", "500098", "India", "This is my selenium testing");
				crmservices.enterCreateContactsDetails(accountsData.appData("CreateContact").getRow(1).getCell(0).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(1).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(2).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(3).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(4).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(5).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(6).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(7).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(8).getStringCellValue(), accountsData.appData("CreateContact").getRow(1).getCell(9).getStringCellValue());
				crmservices.clickSaveContactButton();
}



	
}
