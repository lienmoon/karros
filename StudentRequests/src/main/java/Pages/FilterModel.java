/*
 * Class Name: FilterModel
 * 
 * Purpose: Perform actions on Filter Model
 */
package Pages;

import org.openqa.selenium.WebElement;
import Utils.Controls;

public class FilterModel extends Controls{

	/*
	 * To select Inactive Option from the Request Status Drop Down
	 */
	public void selectInactiveOption() {
		WebElement statusDropDown = Controls.findElement("//select[@name='status']");
		statusDropDown.click();
		
		WebElement inactiveOption = Controls.findElement("//select[@name='status']/option[@value='inactive']");
		inactiveOption.click();
	}
	/*
	 * Click on Apply Filters button
	 */
	public void clickApplyFiltersButton() {
		WebElement applyFiltersButton = Controls.findElement("//button[@class='btn-filter btn btn-default']");
		applyFiltersButton.click();
	}
}
