package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralUtilities {

	public List<String> getElementsToList(WebDriver driver, String locator) {
		List<WebElement> listofElement= driver.findElements(By.xpath(locator));
		
		
		List<String> listOfString = new ArrayList<String>();
		for (int i = 0; i < listofElement.size(); i++) {
			String text = listofElement.get(i).getText();
			listOfString.add(text);
		}
		return listOfString;

	}
	
	public boolean isElementDisplayed(WebElement element) {
		boolean b=element.isDisplayed();
		return b;
	}
	
	public boolean isSearchValueExistsInTheList(List<String> listOfString,String searchText) {
		boolean value=true;
				
		for (String data : listOfString) {
			if (!data.contains(searchText)) {
				value=false;
			}
		}
		return value;
	}

}
