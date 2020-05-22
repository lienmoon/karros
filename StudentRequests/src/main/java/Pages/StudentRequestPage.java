/*
 * Class: StudentRequest
 * 
 * To provide methods to work with Student Request Page
 * 
 */
package Pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import Utils.*;

public class StudentRequestPage extends Controls {
	
	/*
	 * new a LoginPage class to call loginAsUser method
	 * Set username and password to login method
	 */
	LoginPage login = new LoginPage();
	public void gotoRequestPage() {				
		login.loginAsUser("admin@test.com","test123");		
	}
	
	// Click on Filters button
	public void clickFilterButton() {
		WebElement filterButton = Controls.findElement("//button[@class = 'btn btn-filter module_grid__btn_filter btn btn-default']");
		filterButton.click();
	}
	
	//Get selected value on a Padding 
	public String getSelectedFilterValue() {
		String selectedValue = "";
		WebElement queryFilter = Controls.findElement("//div[@class='query__filter']");
		selectedValue = queryFilter.getText();
		return selectedValue;
	}
	
	/*
	 * Get all values of Request Status column
	 * Then compare if all of them are Inactive
	 */
	public Boolean isInactiveRequests() {
		ArrayList<String> valuesOfColumn = Keywords.getAllValueOfColumn(Controls.findElements("//table/tbody/tr/td[1]"), 2);
		Boolean isInactiveRequests = Keywords.compareValuesOfColumn(valuesOfColumn, "Inactive");		
		return isInactiveRequests;
	}
	
	// Click on the First Name column to sort
	public void clickSortFirstName() {
		WebElement sortFirstName = Controls.findElement("//th[@title=\"First Name\"]/span");
		sortFirstName.click();
	}
	
	/*
	 * Get all values of First Name column 
	 * Check if they are descending order
	 */
	public Boolean isDescendingSortFirstNane() {
		ArrayList<String> valuesOfColumn = Keywords.getAllValueOfColumn(Controls.findElements("//table/tbody/tr/td[1]"), 6);
		Boolean sorted = Keywords.isDescendingOrderValues(valuesOfColumn);
		return sorted;
	}
	
	/*
	 * Get all values of First Name column 
	 * Check if they are ascending order
	 */
	public Boolean isAscendingSortFirstNane() {
		ArrayList<String> valuesOfColumn = Keywords.getAllValueOfColumn(Controls.findElements("//table/tbody/tr/td[1]"), 6);
		Boolean sorted = Keywords.isAscendingOrderValues(valuesOfColumn);
		return sorted;
	}
}
