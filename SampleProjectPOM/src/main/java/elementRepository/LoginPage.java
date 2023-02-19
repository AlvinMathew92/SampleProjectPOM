package elementRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.GeneralUtilities;

public class LoginPage {

	WebDriver driver;
	
	GeneralUtilities gu=new GeneralUtilities();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement userName;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement loginButton;
	
	@FindBy(xpath="//h1[text()='Login']")
	WebElement brandIcon;
	
	/////////////////////
	@FindBy(name = "username")
	WebElement XuserName;

	@FindBy(name = "password")
	WebElement Xpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement XloginButton;
	
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product'])[1]")
	WebElement manageProducts;
	
	@FindBy(xpath="//a[contains(text(),'New')]")
	WebElement newButton;
	
	@FindBy(xpath="//input[@name='unlimitw[]']")
	WebElement checkBoxUnLimited;
	
	public void clickManageProduct() {
		manageProducts.click();
	}
	
	public void clickNewButton() {
		newButton.click();
	}
	
	public void clickUnlimitedCheckBox() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='unlimitw[]']")));
//		Actions a=new Actions(driver);
//		a.moveToElement(checkBoxUnLimited).click().perform();
		checkBoxUnLimited.click();
		
	}
	
	public void XenterUserName(String uname) {
		XuserName.sendKeys(uname);
	}

	public void XenterPassword(String pswd) {
		Xpassword.sendKeys(pswd);
	}

	public void XclickLoginButton() {
		XloginButton.click();
	}

	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}

	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public boolean isBrandIconDisplayed() {
		return gu.isElementDisplayed(brandIcon);
	}

}
