
/*
 * Class: Controls 
 * 
 * Controls is extended from Driver to user the variable driver of WebDriver
 * 
 * Purpose: to wrap out findElement method 
 * 
 */
package Utils;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Controls extends Driver{

	// Find and return a WebElement by enter a locator
	public static WebElement findElement(String locator) {
        WebElement element = null;

        try {
            WebDriverWait wait = new WebDriverWait(Driver.driver, 100L);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            element = Driver.driver.findElement(By.xpath(locator));
        } catch (NoSuchElementException var3) {
            System.err.format("No Element Found to click on" + var3);
        }
        return element;
    }
	
	// Find and return a List<WebElement> by enter a locator
	public static List<WebElement> findElements(String locator) {
        List<WebElement> elements = null;

        try {
            WebDriverWait wait = new WebDriverWait(Driver.driver, 100L);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
            elements = Driver.driver.findElements(By.xpath(locator));
        } catch (NoSuchElementException var3) {
            System.err.format("No Element Found to click on" + var3);
        }

        return elements;
    }
	
}
