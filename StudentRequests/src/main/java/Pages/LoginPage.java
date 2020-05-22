/*
 * Class Name: LoginPage
 * 
 * Purpose: Provide actions to log in
 * 
 */
package Pages;

import org.openqa.selenium.WebElement;
import Utils.Controls;


public class LoginPage extends Controls{	
	
	// Enter an UserName into UserName textbox
	public void enterUserName(String username) {		
		WebElement name = Controls.findElement("//input[@type='email']");
		name.sendKeys(username);			
	}
	
	//Enter a password into Password textbox
	public void enterPassWord(String password) {
		WebElement pass = Controls.findElement("//input[@type='password']");
		pass.sendKeys(password);	
	}
	
	//Click on Log in button 
	public void clickLogInButton () {
		WebElement loginButton = Controls.findElement("//a[@class='col-login__btn']");
		loginButton.click();
	}

	/*
	 * A Method to log in by enter username and password 
	 */
	public void loginAsUser(String username, String password) {
		WebElement name = Controls.findElement("//input[@type='email']");
		WebElement pass = Controls.findElement("//input[@type='password']");
		WebElement loginButton = Controls.findElement("//a[@class='col-login__btn']");
		
		name.sendKeys(username);		
		pass.sendKeys(password);		
		loginButton.click();
	}
}


