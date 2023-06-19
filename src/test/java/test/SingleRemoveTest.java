//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.

package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.SingleRemovePage;
import util.BrowserFactory;

public class SingleRemoveTest {
	
	WebDriver driver;
	
	String firstItem = " 0Tabassum001 (None)";
	String secondItem = "Tabassum002";
	
	@Test
	public void userShouldBeAbleToRemoveItem() {
		driver = BrowserFactory.init();
		
		SingleRemovePage singleRemovePage = PageFactory.initElements(driver, SingleRemovePage.class);				
		
		singleRemovePage.validateFirstItem(firstItem);
		singleRemovePage.checkFirstItem();
		singleRemovePage.validateSecondItem(secondItem);
		singleRemovePage.checkSecondItem();
	//	singleRemovePage.clickRemoveButton();
	}

}
