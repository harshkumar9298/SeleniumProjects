package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.GENERAL;

public class TC_001 {
	@Test
	public void run() {
	GENERAL obj = new GENERAL();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}
	}