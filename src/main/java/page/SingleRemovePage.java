//Test 2: Validate that a single list item could be removed using the remove button when a single check box is selected.

package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleRemovePage {
	WebDriver driver;
	
	public SingleRemovePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[4]/input") WebElement THIRD_ITEM_CHECKBOX;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[4]/span") WebElement THIRD_ITEM_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[4]/input") WebElement FOURTH_ITEM_CHECKBOX;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[1]/span[1]") WebElement FOURTH_ITEM_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON;
	
	public void validateFirstItem(String expectedTest) {
		Assert.assertEquals("Item name does not match.", "Tabassum001", THIRD_ITEM_ELEMENT.getText());		
	}
	
	public void checkFirstItem() {
		THIRD_ITEM_CHECKBOX.click();		
	}
	
	public void validateSecondItem(String expectedTest) {
		Assert.assertEquals("Item name does not match.", "Tabassum002 (04/03/23)", FOURTH_ITEM_ELEMENT.getText());		
	}
	
	public void checkSecondItem() {
		FOURTH_ITEM_CHECKBOX.click();		
	}
	public void clickRemoveButton() {
		REMOVE_BUTTON.click();		
	}
}
