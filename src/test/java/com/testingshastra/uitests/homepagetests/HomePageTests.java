package com.testingshastra.uitests.homepagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseFramework;

public class HomePageTests extends BaseFramework { // write the actual test in this class
	@Test
	public void verifyTitleOfHOmePage() {
		Assert.assertEquals(driver.getTitle(), "Yavatmal DCC Bank Bharti 2021 | YDCC Bank Bharti 2021 | MAHA Jobs");
		// assertEquals compared the acutal & expected things
	}

}
