/*
 * Class TC_04 
 * 
 * This is not actually a test, the purpose is to print the ONE XPATH to return the requests which are submitted and approved in 2019
 * Request Status = Approved && Date Submitted = 2019)
 * 
 * Also print expected Elements that are returned from the xpath 
 * 
 */
package StudentRequests;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Pages.StudentRequestPage;
import Utils.Controls;
import Utils.Driver;

public class TC04_xPathApprovedRequestsin2019 {
	public StudentRequestPage stdRequests = new StudentRequestPage();

	@Test
	public void oneXPATHForApproveRequestsin2019() {
		
		stdRequests.gotoRequestPage();
		
		//The xPath to return the requests which are submitted and approved in 2019
		String xpath = "//tr[td[@class='td-request-approved uppercase'] and //td[div[contains(.,'2019')]]]";
		Reporter.log("ONE XPath to return the requests which are submitted and approved in 2019 is:" + "<p>" + xpath + "<p>");
		
		//Print all elements matched with xpath to reporter
		List<WebElement> elements = Controls.findElements(xpath);
		int rows = elements.size();
		for (int i = 0; i < rows; i++) {
			Reporter.log(elements.get(i).getText() + "<p>");			
		}
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
