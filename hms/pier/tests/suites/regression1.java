package com.hms.pier.tests.suites;


	import org.testng.Assert;
import org.testng.annotations.Test;

import com.hms.pier.tests.cases.AppSelectorPagetest;

	public class regression1 extends AppSelectorPagetest {
		
		@Test(priority = 0)
	    public void loginSuccessful() {
			Assert.assertTrue(isAppSelectorPageLoaded(), "Failed to login");
		}
		
		
		
	}


