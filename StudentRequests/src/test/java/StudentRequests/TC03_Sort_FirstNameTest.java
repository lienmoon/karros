/*
 * Class TC03
 * To validate the sort first name function 
 */
package StudentRequests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;

import Pages.StudentRequestPage;
import Utils.Driver;

public class TC03_Sort_FirstNameTest {

	public StudentRequestPage stdRequests = new StudentRequestPage();

	/*
	 * Go to Request page and click on the First name column to sort 
	 * Assert if the list of First Name is descending order
	 */
	
	@Test(priority = 1, alwaysRun = true)
	public void verifyDescendingOrderFirstName() {
		stdRequests.gotoRequestPage();
		stdRequests.clickSortFirstName();
		Assert.assertTrue(stdRequests.isDescendingSortFirstNane());
	}

	/*
	 * Continue click on the First name column to sort 
	 * Assert if the list of First Name is ascending order
	 */
	@Test(priority = 2, alwaysRun = true)
	public void verifyAscendingOrderFirstName() {
		stdRequests.clickSortFirstName();
		Assert.assertTrue(stdRequests.isAscendingSortFirstNane());
	}

	@BeforeTest
	public void startBrowser() {
		Driver.driver = Driver.startBrowser();
	}

	@AfterTest
	public void endBrowser() {
		Driver.closeBrowser();
	}
}
