package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.WorkersPage;

public class LoginTestCases extends BaseClass {

	LoginPage lp;
	HomePage hp;
	WorkersPage wp;

	@Test(enabled = true)
	public void verifyLoginForValidUserTC01() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		lp.enterUserName("carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLoginButton();
		String expected = "CAROL THOMAS1";
		String actual = hp.getTextofLoggedInUser();
		Assert.assertEquals(actual, expected, "Invalid User Logged");
	}

	@Test(enabled = true)
	public void verifyWorkersTestCase() throws InterruptedException {
		lp = new LoginPage(driver);
		wp = new WorkersPage(driver);
		lp.enterUserName("carol");
		lp.enterPassword("1q2w3e4r");
		lp.clickLoginButton();
		wp.clickWorkersTab();
		wp.enterFirstName();
		wp.clickSearchButton();
		Thread.sleep(3000);
		Assert.assertTrue(wp.getColumnValuestoList("Tom"), "Search Result not exists*********");
	}
	
	@Test(enabled = true)
	public void verifyBrandIconPresentInLoginPage() {
		lp = new LoginPage(driver);
		Assert.assertTrue(lp.isBrandIconDisplayed(), "Brand Icon Not Displayed");
	}
	
	@Test
	public void verifyXXXXXXXXXXXXXX() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.XenterUserName("admin");
		lp.XenterPassword("admin");
		lp.XclickLoginButton();
		lp.clickManageProduct();
		lp.clickNewButton();
		lp.clickUnlimitedCheckBox();
	}
}
