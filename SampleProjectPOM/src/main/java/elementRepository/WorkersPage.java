package elementRepository;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import utilities.GeneralUtilities;

public class WorkersPage {

	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();

	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersTab;

	@FindBy(id = "workersearch-first_name")
	WebElement firstName;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	public void clickWorkersTab() {
		workersTab.click();
	}

	public void enterFirstName() {
		firstName.sendKeys("Tom");
	}

	public void clickSearchButton() {

		searchButton.click();
	}

	public boolean getColumnValuestoList(String text) {
		
		List<String> listOfStringData = gu.getElementsToList(driver, "//table[@class='table table-striped table-bordered']//tbody//tr//td[2]");
		return gu.isSearchValueExistsInTheList(listOfStringData, text);
		

	}

}
