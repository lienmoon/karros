/*
 * Class: TC01_Test_Login 
 * Purpose: to log in, do not validate anything 
 */
package Login;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import Pages.LoginPage;
import Utils.Driver;

public class TC01_Test_Login {
	
	//create a loginPage to log in 
	public LoginPage loginPage = new LoginPage();
	
	/*
	 * enter username and password and click Login
	 * Do not assert the returns 
	 */
	@Test
	public void loginTest() {
		loginPage.enterUserName("admin@test.com");
		loginPage.enterPassWord("test123");
		loginPage.clickLogInButton();
	}
	
	//start the browser
	@BeforeTest 
	void startBrowser() {
		Driver.driver = Driver.startBrowser();
	}
	
	//close the browser
	@AfterTest
	public void endBrowser() {
		Driver.closeBrowser();
	}
}
