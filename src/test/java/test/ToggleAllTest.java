//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.

package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllPage;
import util.BrowserFactory;

public class ToggleAllTest {
	
	WebDriver driver;
	
@Test	
public void allListItemsShouldBeChecked() {
	driver = BrowserFactory.init();
	
	ToggleAllPage toggleAllPage = PageFactory.initElements(driver, ToggleAllPage.class);
	
	boolean allCheckboxesChecked = toggleAllPage.areAllCheckboxesChecked();
	
	if (allCheckboxesChecked) {
		System.out.println("All checkboxes are checked.");		
	} else {
		System.out.println("Not all checboxes are checked.");
	}
}

}
