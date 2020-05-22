/*
 * Class: TC02_Filter_InactiveRequestsTest
 * 
 * This test case to validate if Filter with Request Status = Inactive is returned valid requests
 * 
 */
package StudentRequests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;

import Pages.FilterModel;
import Pages.StudentRequestPage;
import Utils.Driver;

public class TC02_Filter_InactiveRequestsTest {

	//create new StudentRequest page and Filter Model to perform actions from these pages
	public StudentRequestPage stdRequests = new StudentRequestPage();
	public FilterModel filterModel = new FilterModel();

	/* 
	 * Go to the Request page and select Filter value is inactive 
	 * Assert if selected filter value is displaying correctly in the padding "Request Status: Inactive"
	 */
	@Test(priority = 1, alwaysRun = true)
	public void verifySelectedFilterOptions() {
		stdRequests.gotoRequestPage();
		stdRequests.clickFilterButton();
		filterModel.selectInactiveOption();
		filterModel.clickApplyFiltersButton();
		Assert.assertEquals(stdRequests.getSelectedFilterValue(), "Request Status: Inactive");
	}

	//Validate if all request status are inactive 
	@Test(priority = 2, alwaysRun = true)
	public void verifyFilterRequestsResult() {
		Assert.assertTrue(stdRequests.isInactiveRequests());
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
