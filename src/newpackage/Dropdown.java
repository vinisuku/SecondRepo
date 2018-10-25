/**
 * 
 */
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author USER
 *
 */
public class Dropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("http://jsbin.com/osebed/2");
		   Select s = new Select (driver.findElement(By.id("fruits")));
		   System.out.println(s.isMultiple());
		   s.selectByValue("banana");
		   s.selectByValue("orange");
		   driver.close();
	}
}
