//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.

package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllPage {
	WebDriver driver;
	
	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]") WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']") List<WebElement> checkboxes;

	public boolean areAllCheckboxesChecked() {
		TOGGLE_ALL_CHECKBOX.click();	
		
		boolean allChecked = true;
		for (WebElement checkbox : checkboxes) {
			if(!checkbox.isSelected()) {
				allChecked = false;
				break;
			}
		}
		
		return allChecked;
		
	}
}
