package com.crm.testscripts;

import com.crm.services.Crmservices;

public class TestData {
    static Crmservices crms = new Crmservices();
	public static void main(String[] args) {
		crms.opencrmApplication();

	}

}
