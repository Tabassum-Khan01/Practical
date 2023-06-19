//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on. 

package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllPage;
import util.BrowserFactory;

public class RemoveAllTest {

	WebDriver driver;

	@Test
	public void areAllItemsRemoved() {
		driver = BrowserFactory.init();

		RemoveAllPage removeAllPage = PageFactory.initElements(driver, RemoveAllPage.class);
		removeAllPage.checkToggleAll();
		// removeAllPage.clickRemoveButton();

		boolean allItemsRemoved = removeAllPage.areAllItemsRemoved();
		if (allItemsRemoved) {
			System.out.println("All items have been removed.");
		} else {
			System.out.println("Some items are still present.");
		}

	}

}
