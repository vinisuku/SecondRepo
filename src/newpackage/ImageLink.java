/**
 * 
 */
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author USER
 *
 */
public class ImageLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   driver.findElement(By.xpath(".//a[@title='Go to Facebook home']")).click();
		   
				   
		   
		   
		
	}

}
