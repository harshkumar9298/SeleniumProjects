package com.hrms.testscripts;

import com.hrms.lib.GENERAL;

public class TC_001 {
	public static void main(String args[]) {
	    //Test Steps
	GENERAL obj = new GENERAL();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}
	}