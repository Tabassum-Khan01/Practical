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
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[3]/input") WebElement FIRST_ITEM_CHECKBOX;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[3]") WebElement FIRST_ITEM_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[2]/input") WebElement SECOND_ITEM_CHECKBOX;
	@FindBy(how = How.XPATH, using ="//*[@id=\"todos-content\"]/form/ul/li[2]/span") WebElement SECOND_ITEM_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON;
	
	public void validateFirstItem(String expectedTest) {
		Assert.assertEquals("Item name does not match.", " 0Tabassum001 (None)", FIRST_ITEM_ELEMENT.getText());		
	}
	
	public void checkFirstItem() {
		FIRST_ITEM_CHECKBOX.click();		
	}
	
	public void validateSecondItem(String expectedTest) {
		Assert.assertEquals("Item name does not match.", "Tabassum002", SECOND_ITEM_ELEMENT.getText());		
	}
	
	public void checkSecondItem() {
		SECOND_ITEM_CHECKBOX.click();		
	}
	public void clickRemoveButton() {
		REMOVE_BUTTON.click();		
	}
}
