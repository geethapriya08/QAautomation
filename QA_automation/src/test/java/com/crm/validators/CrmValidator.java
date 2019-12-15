package com.crm.validators;

import org.testng.Assert;

import com.crm.PageObjects.AccountsPageObjects;
import com.crm.testscripts.AccountsScripts;

public class CrmValidator {

	AccountsPageObjects accountsPageObjects = new AccountsPageObjects();

	public void accountsDetailPageValidation() throws InterruptedException {
		String actualAccountName = AccountsScripts.accountsUsername;
		String expectedAccountName = accountsPageObjects.accountNamecss();
		System.out.println("actualAccountName : " + actualAccountName);
		System.out.println("expectedAccountName : " + expectedAccountName);
		Thread.sleep(5000);
		Assert.assertEquals(actualAccountName, expectedAccountName);
		System.out.println("Account Name Verified Successfully as : " + AccountsScripts.accountsUsername);
	}

}
