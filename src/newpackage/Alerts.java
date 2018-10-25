package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://jsbin.com/usidix/1");
		   driver.findElement(By.xpath(".//input")).click();
		  System.out.println(driver.switchTo().alert().getText());
		   driver.switchTo().alert().accept();
		   driver.close();
}
}
