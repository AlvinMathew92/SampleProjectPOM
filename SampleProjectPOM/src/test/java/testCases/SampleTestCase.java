package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class SampleTestCase extends BaseClass {

	LoginPage lp;
	HomePage hp;

	@Test
	public void verifyTheXXXXXXXXFunctionality() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		lp.enterUserName("carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLoginButton();
		String expected = "CAROL THOMAS";
		System.out.println("*******MyTest************");
		String actual = hp.getTextofLoggedInUser();
		Assert.assertEquals(actual, expected, "Invalid User Logged");
	}

	@Test
	public void verifyTheYYYYYYYYFunctionality() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		lp.enterUserName("carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLoginButton();
		String expected = "CAROL THOMAS";
		System.out.println("*******MyTest************");
		String actual = hp.getTextofLoggedInUser();
		Assert.assertEquals(actual, expected, "Invalid User Logged");
	}
}
