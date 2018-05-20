package com.qa.crm.util;

import com.qa.crm.base.TestBase;

public class Frame extends TestBase {

	
	public static void switchToMainPanelFrame() {
		driver.switchTo().frame("mainpanel");
	}
}
