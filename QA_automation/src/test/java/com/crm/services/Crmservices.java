package com.crm.services;

import java.util.logging.Logger;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.crm.config.BaseConfiguration;
import com.crm.objectrepo.Crmor;
import com.crm.utils.CommonUtils;

public class Crmservices extends BaseConfiguration{
	private static Logger log = Logger.getLogger(Crmservices.class.getName());
	Crmor crmobjects = new Crmor();
	
	public Crmservices opencrmApplication() {
		invokebrowser();
		return this;
		
	}
	
	public Crmservices loginCrmApplication(String username,String password) throws InterruptedException {
		CommonUtils.insertText("id", wd, crmobjects.getObjects().getProperty("crm_login_username"), username);
		CommonUtils.insertText("id", wd, crmobjects.getObjects().getProperty("crm_login_password"), password);
		CommonUtils.clickButton("id", wd, crmobjects.getObjects().getProperty("crm_login_button"));
		Thread.sleep(5000);
		log.info("user logged in successfully");
		return this;
		
	}
	
	public boolean checkHomePageHeader() {
		return CommonUtils.isElementPresent("css", wd, crmobjects.getObjects().getProperty("HomePageHeader"));
		
	}
	
	public String getLoginUserAccount() throws InterruptedException {
		Thread.sleep(3000);
        CommonUtils.clickButton("css", wd, crmobjects.getObjects().getProperty("login_user_menu"));
		String uname=CommonUtils.getText("css", wd, crmobjects.getObjects().getProperty("login_user_account"));
		System.out.println(uname);
		return uname;
		
	}
	
	public Crmservices clickDashboardAccount() {
		CommonUtils.clickLink("xpath", wd, crmobjects.getObjects().getProperty("login_dashboard_Accounts"));
		return this;
		
	}
	
	public Crmservices clickCreateAccountButton() {
		CommonUtils.clickButton("xpath", wd, crmobjects.getObjects().getProperty("login_dashboard_accounts_createaccount"));
		return this;
		
	}
	
	public Crmservices enterAccountName(String name) {
		CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_name"), name);
		return this;
		
	}
	public Crmservices enterAccountEmailid(String email) {
		CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_email"), email);
		return this;
		
	}
   public Crmservices enterAccountPhoneNumber(String phone) {
	  // CommonUtils.selectDropdownItems("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_phonedropdown"), "Mobile", "value");
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_phonetextbox"), phone);
	return this;
	   
   }
   public Crmservices enterAccountWebsite(String website) {
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_website"), website);
	return this;
	   
   }
   public Crmservices enterAccountDetails(String string, String string2, String string3, String string4) {
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_name"),"geetha");
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_email"), "y.geethapriya@gmail.com");
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_phonedropdown"), "mobile");
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_phonetextbox"), "8686609400");
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_website"), "www.youtube.comm");
	return this;
	   
   }
   public Crmservices enterBillingAddressDetails(String street, String city, String state, String pincode, String country) {
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_street"), street);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_city"), city);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_state"), state);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_postalcode"), pincode);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_country"), country);
	return this;
	   
   }
   public Crmservices enterShippingAddress(String street, String city, String state, String pincode, String country){
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_sstreet"), street);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_scity"), city);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_sstate"), state);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_spostalcode"), pincode);
	   CommonUtils.insertText("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_scountry"), country);
	   copyBillingAddress = false;
	   
	return this;
	   
   }
   public Crmservices enterDetails(String SicCode , String Description) {
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_siccode"), SicCode);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_description"),Description );
	return this;
	   
   }
	Boolean copyBillingAddress = false;

   public  Crmservices clickCopyBillingButton() {
	   CommonUtils.clickButton("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_scopybutton"));
		copyBillingAddress = true; 
		return this;
	   
   }
   public Boolean isBillingAddressCopied(){
		return copyBillingAddress;
	}
   
   public Crmservices clickSaveButton() {
	   CommonUtils.clickButton("css", wd, crmobjects.getObjects().getProperty("login_accounts_createaccount_save"));
	   System.out.println("login successfull");
	return this;
	   
   }
   
   public Crmservices clickSaveContactButton() {
	   CommonUtils.clickButton("xpath", wd, crmobjects.getObjects().getProperty("login_accounts_createcontact_save"));
	   System.out.println("Contact saved successful");
	return this;
	   
   }
   
   public Crmservices clickDashboardContacts() {
	   CommonUtils.clickLink("xpath", wd, crmobjects.getObjects().getProperty("login_dashboard_contacts"));
	   System.out.println("clicked Contacts link in dashboard");
	return this;
	   
   }
   
   public Crmservices clickCreateAccounButton() {
	   CommonUtils.clickButton("xpath", wd, crmobjects.getObjects().getProperty("login_dashboard_contacts_createcontact"));
	   System.out.println("click Create Account Button");
	return this;
	   
   }
   
   public Crmservices enterCreateContactsDetails(String firstname , String lastname , String email , String Mobilenum , String street , String city , String state , String postalcode , String country , String Description) {
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_firstname"),firstname );
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_lastname"),lastname );
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_email"), email);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_phonenumber"), Mobilenum);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_street"), street);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_city"), city);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_state"), state);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_postalcode"), postalcode);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_country"), country);
	   CommonUtils.insertText("xpath", wd, crmobjects.getObjects().getProperty("login_contacts_createcontacts_description"), Description);
	return this;
	   
   }

public void loginCrmApplication(Object stringCellValue, Object stringCellValue2) {
	// TODO Auto-generated method stub
	
}

public void enterAccountEmailid(XSSFSheet appData) {
	// TODO Auto-generated method stub
	
}
   
   
}
