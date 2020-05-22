/*
 * Class: Keywords
 * 
 * To support some common functions such as : handle a table, string order 
 * 
 */
package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Keywords {

	// get All values of a column by index of column and table with format //table/tbody/tr
	public static ArrayList<String> getAllValueOfColumn(List<WebElement> elements, int indexOfColumn) {
		ArrayList<String> values = new ArrayList<String>();
		int rows = elements.size();

		for (int i = 0; i < rows; i++) {
			values.add(Controls.findElement("//table/tbody/tr[" + (i + 1) + "]/td[" + indexOfColumn + "]").getText());
		}
		return values;
	}

	/*
	 * compare Values of column with Expected Value
	 * if any values is not, return false 
	 */
	public static Boolean compareValuesOfColumn(ArrayList<String> valuesOfColumn, String expectedValue) {
		Boolean isEqual = true;
		
		for(String value : valuesOfColumn) {
			if (value != expectedValue) {
				isEqual = false;
				break;
			}
		}		
		return isEqual;
	}

	//Check if an array list of string is descending order and return a true / false 
	public static Boolean isDescendingOrderValues(ArrayList<String> valuesOfColumn) {
		ArrayList<String> temp = new ArrayList<String>(valuesOfColumn);		
		Collections.sort(temp, Collections.reverseOrder());		
		Boolean sorted = temp.equals(valuesOfColumn);
		return sorted;
	}
	
	//Check if an array list of string is ascending order and return a true / false 
	public static Boolean isAscendingOrderValues(ArrayList<String> valuesOfColumn) {
		ArrayList<String> temp = new ArrayList<String>(valuesOfColumn);		
		Collections.sort(temp);		
		Boolean sorted = temp.equals(valuesOfColumn);
		return sorted;
	}
}
