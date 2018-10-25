package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("http://demo.guru99.com/test/upload/");
		   driver.findElement(By.id("uploadfile_0")).sendKeys("E:\\Textdoc.docx");
		   //driver.findElement(By.id("terms")).click();
		   //driver.findElement(By.id("submitbutton"));
		   //driver.close();
	}

}
