//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on. 

package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllPage {
	
	WebDriver driver;
	
	public RemoveAllPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']") List<WebElement> checkboxes;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]") WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON;
	
	public void checkToggleAll() {
		TOGGLE_ALL_CHECKBOX.click();
	}
	public void clickRemoveButton() {
		REMOVE_BUTTON.click();	
	}
	
	public boolean areAllItemsRemoved() {
		return checkboxes.isEmpty();
	}
}
